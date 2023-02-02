package com.sinyee.baby.moooodlella

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.sinyee.baby.apiii.DevRepogthyyuyh
import com.sinyee.baby.apiii.HIUfhrhrfhhrfhurf
import com.sinyee.baby.apiii.ggthgthgthgtuigt.CountryRepogtgtgt
import com.sinyee.baby.apiii.gthtgugt.HostInterfacegtgtgt
import com.sinyee.baby.gtjigtjijgit.JOIjfrfhrfhrfhfrhfr
import com.sinyee.baby.vevveve.JIOFjrhfrhhfrhfrhrfu
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

fun provideGsongtgtgt(): Gson {
    return GsonBuilder().create()
}

val frjgtgthgthigt = module {
    viewModel(named("MainModel")) {
        JIOFjrhfrhhfrhfrhrfu(
            (get(named("CountryRep"))),
            get(named("DevRep")),
            get(named("SharedPreferences")),
            get()
        )
    }
    viewModel(named("BeamModel")) {
        JOIjfrfhrfhrfhfrhfr(get())
    }
}

val appModulegtgtgtgt = module {

    single<HostInterfacegtgtgt>(named("HostInter")) {
        get<Retrofit>(named("RetroDev"))
            .create(HostInterfacegtgtgt::class.java)
    }

    single<HIUfhrhrfhhrfhurf>(named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(HIUfhrhrfhhrfhurf::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single<Retrofit>(named("RetroDev")) {
        Retrofit.Builder()
            .baseUrl("http://infinityorb.xyz/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory(named("CountryRep")) {
        CountryRepogtgtgt(get(named("ApiInter")))
    }

    factory(named("DevRep")) {
        DevRepogthyyuyh(get(named("HostInter")))
    }
    single {
        provideGsongtgtgt()
    }
    single(named("SharedPreferences")) {
        jgtigtjjtgjgto(androidApplication())
    }
}

fun jgtigtjjtgjgto(app: Application): SharedPreferences {
    return app.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

