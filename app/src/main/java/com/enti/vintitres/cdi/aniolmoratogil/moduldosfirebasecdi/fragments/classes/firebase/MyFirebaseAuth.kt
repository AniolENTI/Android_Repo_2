package com.enti.vintitres.cdi.aniolmoratogil.moduldosfirebasecdi.fragments.classes.firebase

import android.app.Application
import com.enti.vintitres.cdi.aniolmoratogil.moduldosfirebasecdi.R
import com.enti.vintitres.cdi.aniolmoratogil.moduldosfirebasecdi.fragments.classes.models.DbUser
import com.google.firebase.auth.FirebaseAuth

class MyFirebaseAuth(val appContext: Application) {

    private val firebaseAuth = FirebaseAuth.getInstance()
    private var currentUser: DbUser? = null

    fun getCurrentUser() = currentUser

    fun setCurrentUser(newUser: DbUser){
        currentUser = newUser
    }


    fun getAuthDbUser() : DbUser? {
        firebaseAuth.currentUser?.let { user ->
            val dbUser = DbUser(
                id = user.uid,
                email = user.email,
                username = user.displayName,
                photoPath = user.photoUrl.toString()
            )
            return dbUser
        }
        return null
    }

}