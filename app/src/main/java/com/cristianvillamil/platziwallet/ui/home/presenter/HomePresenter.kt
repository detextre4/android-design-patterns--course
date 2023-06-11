package com.cristianvillamil.platziwallet.ui.home.presenter

import com.cristianvillamil.platziwallet.UserSingleton
import com.cristianvillamil.platziwallet.ui.home.FavoriteTransfer
import com.cristianvillamil.platziwallet.ui.home.HomeContract
import com.cristianvillamil.platziwallet.ui.home.data.HomeInteractor
import com.cristianvillamil.platziwallet.ui.home.data.User

class HomePresenter(private val view : HomeContract.View) : HomeContract.Presenter {
    private val homeInteractor  = HomeInteractor()

    override fun retrieveFavoriteTransfer() {
        view.showLoader()

        homeInteractor.retrieveFavoriteTransferFromCache(object : HomeContract.OnResponseCallback {
            override fun onresponse(favoriteList: List<FavoriteTransfer>) {
                UserSingleton.getInstance().username = "hola"

                val user = User.Builder()
                    .setUsername("hola")
                    .setPassword("123456")
                    .build()

                view.hideLoader()
                view.showFavoriteTransfer(favoriteList)
            }
        })
    }
}