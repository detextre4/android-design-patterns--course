package com.cristianvillamil.platziwallet.ui.home

import androidx.lifecycle.LiveData

interface HomeContract {
    interface  View {
        fun showLoader()
        fun hideLoader()
        fun showFavoriteTransfer(favoriteTransfers : List<FavoriteTransfer>)
    }

    interface  Presenter {
        fun retrieveFavoriteTransfer()
        fun getPercentageLiveData() : LiveData<String>
    }

    interface OnResponseCallback {
        fun onresponse(favoriteList : List<FavoriteTransfer>)
    }
}