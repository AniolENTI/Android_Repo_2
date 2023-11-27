package com.enti.vintitres.cdi.aniolmoratogil.moduldosfirebasecdi.fragments.components

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.enti.vintitres.cdi.aniolmoratogil.moduldosfirebasecdi.R
import com.enti.vintitres.cdi.aniolmoratogil.moduldosfirebasecdi.fragments.classes.firebase.FB
import com.google.android.material.appbar.MaterialToolbar
import com.google.firebase.Firebase
import com.google.firebase.crashlytics.crashlytics
import com.google.firebase.crashlytics.setCustomKeys
import java.lang.Exception

class AppToolbar: Fragment() {

    companion object{
        private lateinit var Instance: AppToolbar
        fun get() = Instance
    }

    lateinit var  toolbar: MaterialToolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Instance = this
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.component_toolbar, container, false)

        toolbar = view.findViewById(R.id.appToolbar)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        toolbar.setNavigationOnClickListener {

        }

        toolbar.setOnMenuItemClickListener { menuItem ->

            when(menuItem.itemId) {
                R.id.toolbar_button_test -> {
                    //throw RuntimeException("Test Crash") // Force a crash
                    FB.crashlytics.logSimpleError("Subnormal Error"){
                        key("Subnormal Name", "Aniol")
                        key("Is Subnormal", true)
                        key("Level Of Subnormality", 9001)
                    }
                }
            }

            true
        }
    }
}