
import com.fasterxml.jackson.annotation.JsonProperty

data class User(
    @JsonProperty("name")
    val name: String = "",

    @JsonProperty("email")
    val email: String = "",

    @JsonProperty("password")
    val password: String = "",

    @JsonProperty("_id")
    val id: String = ""
)