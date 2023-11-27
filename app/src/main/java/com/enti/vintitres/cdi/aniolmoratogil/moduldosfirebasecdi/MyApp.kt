package com.enti.vintitres.cdi.aniolmoratogil.moduldosfirebasecdi

import android.app.Application
import com.enti.vintitres.cdi.aniolmoratogil.moduldosfirebasecdi.fragments.classes.firebase.FB
import com.enti.vintitres.cdi.aniolmoratogil.moduldosfirebasecdi.fragments.classes.firebase.MyFirebase

class MyApp: Application() {

    companion object{
        private lateinit var instance: MyApp

        public fun get() = instance
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        FB.init(this)
        FB.analytics.logOpenApp()
    }
}