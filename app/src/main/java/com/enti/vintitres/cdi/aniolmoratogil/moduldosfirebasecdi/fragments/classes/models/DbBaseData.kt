package com.enti.vintitres.cdi.aniolmoratogil.moduldosfirebasecdi.fragments.classes.models

interface DbBaseData {
    var id: String?

    fun getTable(): String
}