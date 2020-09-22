package com.bankasia.cblabsmvvm.retrofit

import com.bankasia.cblabsmvvm.datamodel.CashDepositDataM
import io.reactivex.Single
import retrofit2.http.*

interface Api {


    @GET("CashWithdrowS")
    fun doCashDeposit(
        @Query("accountNo") accountNo: String?,
        @Query("accountTitleCCD") accountTitleCCD: String?,
        @Query("contactNumCCD") contactNumCCD: String?,
        @Query("addressCCD") addressCCD: String?,
        @Query("depositAmountCCD") depositAmountCCD: String?,
        @Query("amountInWordCCD") amountInWordCCD: String?,
        @Query("remarksCCD") remarksCCD: String?,
        @Query("nameCCD") nameCCD: String?
    ): Single<CashDepositDataM>

}