package com.plcoding.cryptotracker.crypto.presentation.coin_list

import com.plcoding.cryptotracker.crypto.presentation.models.CoinsUi

sealed interface CoinListAction {
    data class OnCoinClick(val coinsUi: CoinsUi): CoinListAction
}