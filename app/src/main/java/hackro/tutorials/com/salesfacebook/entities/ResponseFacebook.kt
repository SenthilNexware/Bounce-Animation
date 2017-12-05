package hackro.tutorials.com.salesfacebook.entities

import com.google.gson.annotations.SerializedName

data class ResponseFacebook(

    @field:SerializedName("data")
	val data: List<DataItem?>? = null,

    @field:SerializedName("paging")
	val paging: Paging? = null
)