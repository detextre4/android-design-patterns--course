package com.cristianvillamil.platziwallet.ui.home.data

import android.app.AlertDialog
import android.content.Context

class MessageFactory {
    companion object {
        val TYPE_ERROR = "typeError"
        val TYPE_SUCCESS= "typeSuccess"
        val TYPE_INFO= "typeInfo"
    }

    fun getDialog(context : Context, type : String) : AlertDialog.Builder {
        when(type) {
            TYPE_SUCCESS ->
                AlertDialog.Builder(context)
                    .setMessage("Hay un error al momento de traer el contenido")

            TYPE_ERROR ->
                AlertDialog.Builder(context)
                    .setMessage("El contenido fue cargado exitosamente")

            TYPE_INFO ->
                AlertDialog.Builder(context)
                    .setMessage("Esta es la info")
        }

        return AlertDialog.Builder(context)
            .setMessage("Necesitas añadir el nuevo tipo")
    }
}