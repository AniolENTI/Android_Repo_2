package com.enti.vintitres.cdi.aniolmoratogil.moduldosfirebasecdi.fragments.classes.firebase

import android.app.Application
import com.enti.vintitres.cdi.aniolmoratogil.moduldosfirebasecdi.R
import com.google.firebase.auth.FirebaseAuth

class MyFirebaseAuth(val appContext: Application) {

    private val firebaseAuth = FirebaseAuth.getInstance()

    fun getUsername() = firebaseAuth.currentUser?.displayName ?: appContext.getString(R.string.unknown_user)

}