package com.enti.vintitres.cdi.aniolmoratogil.moduldosfirebasecdi.fragments.components

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.enti.vintitres.cdi.aniolmoratogil.moduldosfirebasecdi.R
import com.enti.vintitres.cdi.aniolmoratogil.moduldosfirebasecdi.fragments.screens.LoginScreen
import com.google.android.material.navigation.NavigationView
import java.util.zip.Inflater

class AppDrawer: Fragment() {

    companion object{
        lateinit var instance: AppDrawer

        fun get() = instance
    }

    lateinit var fragmentView: View
    private val drawer by lazy { fragmentView.findViewById<DrawerLayout>(R.id.appDrawer) }
    private val navigationDrawer by lazy { fragmentView.findViewById<NavigationView>(R.id.navigationDrawer) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        instance = this
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentView = inflater.inflate(R.layout.component_navigationdrawer, container, false)
        return fragmentView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navigationDrawer.setNavigationItemSelectedListener { menuItem ->

            when(menuItem.itemId)
            {
                R.id.login_drawer_button -> {

                    val loginScreen = LoginScreen()
                    val transaction = childFragmentManager.beginTransaction()
                    transaction.setCustomAnimations(
                        R.anim.enter_from_right, R.anim.exit_to_right,
                        R.anim.enter_from_left, R.anim.exit_to_right
                    )
                    transaction.replace(R.id.reusableDialogsContainer, loginScreen)
                        .addToBackStack(null)
                        .commit()
                    drawer.close()

                }
            }

            true
        }
    }

    fun openDrawer()
    {
        drawer.open()
    }

}