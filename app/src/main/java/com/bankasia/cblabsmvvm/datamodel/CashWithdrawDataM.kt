package com.bankasia.cblabsmvvm.datamodel

import com.google.gson.annotations.SerializedName

data class CashWithdrawDataM (

    @SerializedName("accountNoCCW")
    var accountNoCCW : String,

    @SerializedName("accountTypeCCW")
    var accountTypeCCW : String,

    @SerializedName("customerCodeCCW")
    var customerCodeCCW : String,

    @SerializedName("nameCCW")
    var nameCCW : String,

    @SerializedName("mobileNoCCW")
    var mobileNoCCW : String,

    @SerializedName("accountOperatingBalanceCCW")
    var accountOperatingBalanceCCW : String,

    @SerializedName("withdrawAmountCCW")
    var withdrawAmountCCW : String,

    @SerializedName("amountInWordCCW")
    var amountInWordCCW : String,

    @SerializedName("remarksCCW")
    var remarksCCW : String,

    @SerializedName("message")
    var message: String?,

    @SerializedName("outcode")
    var outcode: String
)
