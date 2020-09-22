package com.bankasia.cblabsmvvm.datamodel

import com.google.gson.annotations.SerializedName

data class CashDepositDataM (

    @SerializedName("remarksCCD")
     var remarksCCD: String,

    @SerializedName("outcode")
    var outcode: String,

    @SerializedName("accountNo")
    var accountNo: String,

    @SerializedName("depositAmountCCD")
    var depositAmountCCD: String,

    @SerializedName("nameCCD")
    var nameCCD: String,

    @SerializedName("message")
    var message: String?,

    @SerializedName("accountTitleCCD")
    var accountTitleCCD: String?,

    @SerializedName("amountInWordCCD")
    var amountInWordCCD: String?,

    @SerializedName("contactNumCCD")
    var contactNumCCD: String?,

    @SerializedName("addressCCD")
    var addressCCD: String?
)