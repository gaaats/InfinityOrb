package com.sinyee.baby.apiii.gthtgugt

import com.sinyee.baby.apiii.hfruhuf.GeoDevgtgtgt
import retrofit2.Response
import retrofit2.http.GET


interface  HostInterfacegtgtgt{
    @GET("const.json")
    suspend fun getDataDev(): Response<GeoDevgtgtgt>
}