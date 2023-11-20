package com.enti.vintitres.cdi.aniolmoratogil.moduldosfirebasecdi.fragments.components

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.enti.vintitres.cdi.aniolmoratogil.moduldosfirebasecdi.R
import com.google.android.material.appbar.MaterialToolbar

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
}