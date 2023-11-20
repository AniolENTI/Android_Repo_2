package com.enti.vintitres.cdi.aniolmoratogil.moduldosfirebasecdi.fragments.components

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.enti.vintitres.cdi.aniolmoratogil.moduldosfirebasecdi.R

class AppNavHost:Fragment() {

    companion object{
        private lateinit var Instance:AppNavHost
        fun get()= Instance
    }

    lateinit var navHost: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Instance = this
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.component_navhost, container, false)

        val navHostFragment = childFragmentManager.findFragmentById(R.id.appNavigationHostFragment) as NavHostFragment
        navHost = navHostFragment.navController

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}