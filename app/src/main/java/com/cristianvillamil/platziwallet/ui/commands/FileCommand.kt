package com.cristianvillamil.platziwallet.ui.commands

import android.content.Context

interface FileCommand {
    fun excecute(
        context : Context,
        fileName : String,
        vararg arguments : String
    )
}