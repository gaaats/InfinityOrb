package com.sinyee.baby.vevveve.frhrfuihfrihhrfhihfr

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.sinyee.baby.cococnsnns.Jifhrfihrfhhfrhrf.hjohyjhyjjohyj
import com.sinyee.baby.cococnsnns.Jifhrfihrfhhfrhrf.hyjuikkiikikkiki
import com.sinyee.baby.cococnsnns.Jifhrfihrfhhfrhrf.gthhyhyhyhyhyhy
import com.sinyee.baby.databinding.ActivityVebVactivityBinding
import com.sinyee.baby.gtjigtjijgit.JOIjfrfhrfhrfhfrhfr
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class VebVActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        gtgtgt = ActivityVebVactivityBinding.inflate(layoutInflater)
        bnkgtuhgtuhgthugtu = WebView(this)
        setContentView(bnkgtuhgtuhgthugtu)
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(bnkgtuhgtuhgthugtu, true)
        gtggtuigthgtuhhgt.webSetgtgtgt(bnkgtuhgtuhgthugtu)

        bnkgtuhgtuhgthugtu.webViewClient = Jfrhfhfrhfrhrfhu()
        bnkgtuhgtuhgthugtu.webChromeClient = Hifhrrfhfrh()
        bnkgtuhgtuhgthugtu.loadUrl(gthyhyhy())
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        if (requestCode != INPUT_FILE_REQUEST_CODEhyhyhyhy || gtgtgthyhyhy == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var results: Array<Uri>? = null

        if (resultCode == RESULT_OK) {
            if (data == null) {
                if (gthyjuujujuj != null) {
                    results = arrayOf(Uri.parse(gthyjuujujuj))
                }
            } else {
                val dataString = data.dataString
                if (dataString != null) {
                    results = arrayOf(Uri.parse(dataString))
                }
            }
        }
        gtgtgthyhyhy!!.onReceiveValue(results)
        gtgtgthyhyhy = null
        return
    }

    private lateinit var gtgtgt: ActivityVebVactivityBinding
    lateinit var bnkgtuhgtuhgthugtu: WebView
    private var gtgtgthyhyhy: ValueCallback<Array<Uri>>? = null
    private var gthyjuujujuj: String? = null
    private  val INPUT_FILE_REQUEST_CODEhyhyhyhy = 1

    private val gtggtuigthgtuhhgt by viewModel<JOIjfrfhrfhrfhfrhfr>(
        named("BeamModel")
    )


    inner class Jfrhfhfrhfrhrfhu: WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
            try {
                if (URLUtil.isNetworkUrl(url)) {
                    return false
                }
                if (gtggtuigthgtuhhgt.gtjogtogtjtgjig(url)) {

                    val intentgtgtgt = Intent(Intent.ACTION_VIEW)
                    intentgtgtgt.data = Uri.parse(url)
                    startActivity(intentgtgtgt)
                } else {

                    Toast.makeText(
                        applicationContext,
                        "Application is not installed",
                        Toast.LENGTH_LONG
                    ).show()
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                        )
                    )
                }
                return true
            } catch (e: Exception) {
                return false
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            saveUrlgtgttggt(url)
        }


        override fun onReceivedError(
            view: WebView?,
            errorCode: Int,
            description: String?,
            failingUrl: String?
        ) {
            Toast.makeText(this@VebVActivity, description, Toast.LENGTH_SHORT).show()
        }
    }


    inner class Hifhrrfhfrh : WebChromeClient() {

        override fun onShowFileChooser(
            view: WebView?,
            filePath: ValueCallback<Array<Uri>>?,
            fileChooserParams: FileChooserParams?
        ): Boolean {
            gtgtgthyhyhy?.onReceiveValue(null)
            gtgtgthyhyhy = filePath
            var ggtgttghy: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (ggtgttghy!!.resolveActivity(packageManager) != null) {
                var gtgtgtgt: File? = null
                try {
                    gtgtgtgt = gtjiotgjiogtji()
                    ggtgttghy.putExtra("PhotoPath", gthyjuujujuj)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (gtgtgtgt != null) {
                    gthyjuujujuj = "file:" + gtgtgtgt.absolutePath
                    ggtgttghy.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(gtgtgtgt)
                    )
                } else {
                    ggtgttghy = null
                }
            }
            val frgtthyyhhy = Intent(Intent.ACTION_GET_CONTENT)
            frgtthyyhhy.addCategory(Intent.CATEGORY_OPENABLE)
            frgtthyyhhy.type = "image/*"
            val gtgtgtjjgti: Array<Intent?> = ggtgttghy?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val gtthyhy = Intent(Intent.ACTION_CHOOSER)
            gtthyhy.putExtra(Intent.EXTRA_INTENT, frgtthyyhhy)
            gtthyhy.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            gtthyhy.putExtra(Intent.EXTRA_INITIAL_INTENTS, gtgtgtjjgti)
            startActivityForResult(gtthyhy, INPUT_FILE_REQUEST_CODEhyhyhyhy)
            return true
        }

        fun gtjiotgjiogtji(): File? {
            val gthyhyhy = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val imageFileNamegthy = "JPEG_" + gthyhyhy + "_"
            val storageDirgtgt = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                imageFileNamegthy,
                ".jpg",
                storageDirgtgt
            )
        }
    }

    private fun gthyhyhy(): String {

        val gttggtgt = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)

        val sharPregttggt = getSharedPreferences("SHARED_PREF",
            Context.MODE_PRIVATE)

        val linkgtgtgt = sharPregttggt.getString(hyjuikkiikikkiki, null)
        Log.d("lolo", linkgtgtgt.toString())
        val gttggtgtd = sharPregttggt.getString(gthhyhyhyhyhyhy, null)
        val afIdgtgttg = sharPregttggt.getString(hjohyjhyjjohyj, null)


        when (sharPregttggt.getString("WebInt", null)) {
            "campaign" -> {
                gtggtuigthgtuhhgt.gtgtgtgt(afIdgtgttg.toString())
            }
            "deepLink" -> {
                gtggtuigthgtuhhgt.gtgtgtgt(afIdgtgttg.toString())
            }
            "deepLinkNOApps" -> {
                gtggtuigthgtuhhgt.gtgtgtgt(gttggtgtd.toString())
            }
            "geo" -> {
                gtggtuigthgtuhhgt.gtgtgtgt(gttggtgtd.toString())
            }
        }
        return gttggtgt.getString("SAVED_URL", linkgtgtgt).toString()
    }


    fun saveUrlgtgttggt(gtgthy5: String?) {
        if (!gtgthy5!!.contains("t.me")) {

            if (urlfifififgttg == "") {
                urlfifififgttg = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    gtgthy5
                ).toString()

                val gttggtgtgt = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
                val gtgtgt = gttggtgtgt.edit()
                gtgtgt.putString("SAVED_URL", gtgthy5)
                gtgtgt.apply()
            }
        }
    }
    var urlfifififgttg = ""

    override fun onBackPressed() {

        if (bnkgtuhgtuhgthugtu.canGoBack()) {
            if (gtgthyhyhyhy) {
                bnkgtuhgtuhgthugtu.stopLoading()
                bnkgtuhgtuhgthugtu.loadUrl(urlfifififgttg)
            }
            this.gtgthyhyhyhy = true
            bnkgtuhgtuhgthugtu.goBack()
            Handler(Looper.getMainLooper()).postDelayed({
                gtgthyhyhyhy = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

    private var gtgthyhyhyhy = false

}
