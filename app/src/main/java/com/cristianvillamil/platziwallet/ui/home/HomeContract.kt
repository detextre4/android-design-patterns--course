package com.cristianvillamil.platziwallet.ui.home

interface HomeContract {
    interface  View {
        fun showLoader()
        fun hideLoader()
        fun showFavoriteTransfer(favoriteTransfers : List<FavoriteTransfer>)
    }

    interface  Presenter {
        fun retrieveFavoriteTransfer()
    }

    interface OnResponseCallback {
        fun onresponse(favoriteList : List<FavoriteTransfer>)
    }
}