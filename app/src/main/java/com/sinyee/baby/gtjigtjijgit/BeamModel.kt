package com.sinyee.baby.gtjigtjijgit

import android.app.Application
import android.content.pm.PackageManager
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.lifecycle.ViewModel
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject

class BeamModel(gtjgtj: Application): ViewModel() {
    val hjiohyji = gtjgtj.packageManager
    fun webSetgtgtgt(webViewgttg: WebView): WebSettings{
       val webViewSetgtgt = webViewgttg.settings
        webViewSetgtgt.javaScriptEnabled = true
        webViewSetgtgt.useWideViewPort = true
        webViewSetgtgt.loadWithOverviewMode = true
        webViewSetgtgt.allowFileAccess = true
        webViewSetgtgt.domStorageEnabled = true
        webViewSetgtgt.userAgentString = webViewSetgtgt.userAgentString.replace("; wv", "")
        webViewSetgtgt.javaScriptCanOpenWindowsAutomatically = true
        webViewSetgtgt.setSupportMultipleWindows(false)
        webViewSetgtgt.displayZoomControls = false
        webViewSetgtgt.builtInZoomControls = true
        webViewSetgtgt.allowFileAccess = true
        webViewSetgtgt.allowContentAccess = true
        webViewSetgtgt.setSupportZoom(true)
        webViewSetgtgt.pluginState = WebSettings.PluginState.ON
        webViewSetgtgt.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        webViewSetgtgt.cacheMode = WebSettings.LOAD_DEFAULT
        webViewSetgtgt.allowContentAccess = true
        webViewSetgtgt.mediaPlaybackRequiresUserGesture = false
        return webViewSetgtgt
    }
    fun gtgtgtgt(idgtgtgt: String) {
        OneSignal.setExternalUserId(
            idgtgtgt,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val gtgtgtgt = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $gtgtgtgt"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val gtjtgitjgiogt =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $gtjtgitjgiogt"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val frnkgnttkgjgtk = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $frnkgnttkgjgtk"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }



    fun gtjogtogtjtgjig(gtjtgijtg: String): Boolean {
        try {
            hjiohyji.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (_: PackageManager.NameNotFoundException) {

        }
        return false
    }
}