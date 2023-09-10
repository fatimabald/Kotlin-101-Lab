import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("api/v1/users")
    fun getUsers(): Call<List<User>>
}