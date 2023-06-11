package com.cristianvillamil.platziwallet.ui

class TransferFacade {
    val analyticsManager = AnalyticsManager()
    val securityManager = com.cristianvillamil.platziwallet.ui.SecurityManager()
    val transferManager = TransferManager()

    fun transfer() {
        val token = securityManager.getToken()
        analyticsManager.registerTransfer(token)
        transferManager.transfer(token)
    }
}