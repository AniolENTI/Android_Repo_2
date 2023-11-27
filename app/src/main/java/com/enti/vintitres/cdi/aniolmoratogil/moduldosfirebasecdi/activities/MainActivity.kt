package com.enti.vintitres.cdi.aniolmoratogil.moduldosfirebasecdi.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.enti.vintitres.cdi.aniolmoratogil.moduldosfirebasecdi.R
import com.enti.vintitres.cdi.aniolmoratogil.moduldosfirebasecdi.fragments.classes.firebase.FB

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity_screen)

        FB.crashlytics.logSimpleError("Subnormal Error"){
            key("Error", "Kernel Panel")
            key("Bomdia", true)
        }
    }
}