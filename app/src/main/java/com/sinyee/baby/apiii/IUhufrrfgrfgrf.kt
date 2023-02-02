package com.sinyee.baby.apiii

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import com.sinyee.baby.apiii.gthtgugt.HostInterfacegtgtgt
import retrofit2.Response
import retrofit2.http.GET


@Keep
data class CountryCodeJSgttg(
    @SerializedName("countryCode")
    val cou: String,
)




interface HIUfhrhrfhhrfhurf {
    @GET("json/?key=KXgMIA7HSEcn0SV")
    suspend fun getData(): Response<CountryCodeJSgttg>
}




class DevRepogthyyuyh(private val devDatagtgttgtg: HostInterfacegtgtgt) {
    suspend fun getDataDev() = devDatagtgttgtg.getDataDev()
}
