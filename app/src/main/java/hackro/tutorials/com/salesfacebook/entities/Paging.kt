package hackro.tutorials.com.salesfacebook.entities

import com.google.gson.annotations.SerializedName


data class Paging(

	@field:SerializedName("next")
	val next: String? = null,

	@field:SerializedName("previous")
	val previous: String? = null
)