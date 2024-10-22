package com.plcoding.cryptotracker.crypto.presentation.coin_list

import androidx.compose.runtime.Immutable
import com.plcoding.cryptotracker.crypto.presentation.models.CoinsUi

@Immutable
data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<CoinsUi> = emptyList(),
    val selectedCoin: CoinsUi? = null
)
