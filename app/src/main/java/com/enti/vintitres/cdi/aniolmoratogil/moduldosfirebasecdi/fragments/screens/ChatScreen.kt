package com.enti.vintitres.cdi.aniolmoratogil.moduldosfirebasecdi.fragments.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.enti.vintitres.cdi.aniolmoratogil.moduldosfirebasecdi.R

class ChatScreen:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.screen_chat, container, false)
    }
}