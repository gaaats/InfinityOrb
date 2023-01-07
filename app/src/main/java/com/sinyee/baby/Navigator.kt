package com.sinyee.baby

interface Navigator {

    fun goToVebViev(keyCodeFromHost:String, naming:String, deepLink:String, linka:String, mainId:String)
    fun goToGame()
    fun saveToSharedPref(key:String, valuue:String?)
    fun readFromSharedPref(key:String, defValue:String): String
}