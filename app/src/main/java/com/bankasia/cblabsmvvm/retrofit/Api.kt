package com.bankasia.cblabsmvvm.retrofit

import com.bankasia.cblabsmvvm.datamodel.AgentOnBoardingRequestStatusDataM
import com.bankasia.cblabsmvvm.datamodel.CashDepositDataM
import com.bankasia.cblabsmvvm.datamodel.CashWithdrawDataM
import io.reactivex.Single
import retrofit2.http.*

interface Api {


    @GET("CashDepositS")
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

    @GET("CashWithdrawS")
    fun doCashWithdraw(
        @Query("accountNoCCW") accountNoCCW:String?
    ): Single<CashWithdrawDataM>

    @GET("AgentOnBoardingS")
    fun fetchOnBoardingReq(
        @Query("REQ_CODE") reqCode:String?
    ): Single<List<AgentOnBoardingRequestStatusDataM>>

}