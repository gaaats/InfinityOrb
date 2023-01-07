package com.sinyee.baby

import android.content.Context
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class VolleyApiClient(val contteeeext: Context) {

    suspend fun getDevilApi(): GeoDevfrfrrfrrrrrr = suspendCoroutine { result ->
        val queue = Volley.newRequestQueue(contteeeext)
        val url =
            ApplicaClaaass.linkaaa1 + ApplicaClaaass.linkaaa2 + ApplicaClaaass.linkaaa3 + ApplicaClaaass.linkaaa4 + ApplicaClaaass.linkaaa5
        val request = StringRequest(
            Request.Method.GET, url,
            { response ->
                try {
                    val item = Gson().fromJson(response.toString(), GeoDevfrfrrfrrrrrr::class.java)
                    result.resume(item)
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            },
            { error ->
                error.printStackTrace()
            }
        )
        queue.add(request)
    }

    suspend fun getGeoData(): CountryCodeJSfrrgttggttgttt = suspendCoroutine { result ->
        val queue = Volley.newRequestQueue(contteeeext)
        val url = ApplicaClaaass.geoApiLink1+ ApplicaClaaass.geoApiLink2
        val request = StringRequest(
            Request.Method.GET, url,
            { response ->
                try {
                    val item = Gson().fromJson(
                        response.toString(),
                        CountryCodeJSfrrgttggttgttt::class.java
                    )
                    result.resume(item)
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            },
            { error ->
                error.printStackTrace()
            }
        )
        queue.add(request)
    }
}