package com.sinyee.baby.apiii

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET


@Keep
data class CountryCodeJSgttg(
    @SerializedName("countryCode")
    val cou: String,
)


@Keep
data class GeoDevgtgtgt(
    @SerializedName("geoD")
    val geoD: String,
    @SerializedName("viewD")
    val viewD: String,
    @SerializedName("appsCheckerD")
    val appsCheckerD: String,
)

interface ApiInterfacegtgtgt {
    @GET("json/?key=KXgMIA7HSEcn0SV")
    suspend fun getData(): Response<CountryCodeJSgttg>
}

interface HostInterfacegtgtgt {
    @GET("const.json")
    suspend fun getDataDev(): Response<GeoDevgtgtgt>
}

class CountryRepogtgtgt(private val countryApigtgtgt: ApiInterfacegtgtgt) {
    suspend fun getDat() = countryApigtgtgt.getData()
}
class DevRepogthyyuyh(private val devDatagtgttgtg: HostInterfacegtgtgt) {
    suspend fun getDataDev() = devDatagtgttgtg.getDataDev()
}
