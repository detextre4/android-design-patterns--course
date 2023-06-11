package com.cristianvillamil.platziwallet.ui.home.presenter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.cristianvillamil.platziwallet.UserSingleton
import com.cristianvillamil.platziwallet.ui.home.FavoriteTransfer
import com.cristianvillamil.platziwallet.ui.home.HomeContract
import com.cristianvillamil.platziwallet.ui.home.data.HomeInteractor
import com.cristianvillamil.platziwallet.ui.home.data.User

class HomePresenter(private val view : HomeContract.View) : HomeContract.Presenter {
    private val homeInteractor  = HomeInteractor()
    private val percentageLiveData : MutableLiveData<String> = MutableLiveData()

    override fun retrieveFavoriteTransfer() {
        view.showLoader()

        homeInteractor.retrieveFavoriteTransferFromCache(object : HomeContract.OnResponseCallback {
            override fun onresponse(favoriteList: List<FavoriteTransfer>) {
                UserSingleton.getInstance().username = "hola"

                val user = User.Builder()
                    .setUsername("hola")
                    .setPassword("123456")
                    .build()
                println(user)

                percentageLiveData.value = "40%"

                view.hideLoader()
                view.showFavoriteTransfer(favoriteList)
            }
        })
    }

    override fun getPercentageLiveData() : LiveData<String> = percentageLiveData
}