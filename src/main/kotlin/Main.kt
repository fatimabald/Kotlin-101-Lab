import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

fun main(args: Array<String>) {
    RetrofitInstance.apiService.getUsers().enqueue(object : Callback<List<User>> {
        override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {
            if (response.isSuccessful) {
                val users = response.body()
                users?.forEach { user ->
                    println("User : ${user.id}| name : ${user.name} | email : ${user.email}| \n" +
                            "password :${user.password}")
                }
            } else {
                println("API Error: ${response.errorBody()}")
            }
        }

        override fun onFailure(call: Call<List<User>>, t: Throwable) {
            println("Network Error: $t")
        }
    })

    // Prevent the main thread from exiting immediately
    Thread.sleep(5000)
}