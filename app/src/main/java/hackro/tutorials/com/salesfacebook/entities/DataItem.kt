package hackro.tutorials.com.salesfacebook.entities

import com.google.gson.annotations.SerializedName

data class DataItem(

	@field:SerializedName("updated_time")
	val updated_time: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("message")
	val message: String? = null
)