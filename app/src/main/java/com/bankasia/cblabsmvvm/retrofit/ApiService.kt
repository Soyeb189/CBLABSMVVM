package com.bankasia.cblabsmvvm.retrofit

import com.bankasia.cblabsmvvm.Constrants_Variable
import com.bankasia.cblabsmvvm.datamodel.CashDepositDataM
import com.bankasia.cblabsmvvm.requestmodel.CashDepositRequestM
import com.google.gson.GsonBuilder
import io.reactivex.Single
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class ApiService {

    var baseurl = "http://192.168.43.18:47956/"
    //var baseurl = "https://raw.githubusercontent.com/"
    var okHttpClient: OkHttpClient? = OkHttpClient.Builder()
        .connectTimeout(Constrants_Variable.retrofit_connection_timeout_in_second, TimeUnit.SECONDS)
        .readTimeout(Constrants_Variable.retrofit_read_timeout_in_second, TimeUnit.SECONDS)
        .writeTimeout(Constrants_Variable.retrofit_wright_timeout_in_second, TimeUnit.SECONDS)
        .build()

    var gson = GsonBuilder()
        .setLenient()
        .create()

    private val api = Retrofit.Builder()
        .baseUrl(baseurl)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .client(okHttpClient)
        .build()
        .create(Api::class.java)

    fun getCashDepositService(model: CashDepositRequestM): Single<CashDepositDataM> {
        return api.doCashDeposit(
            model.accountNoCCD,
            model.accountTitleCCD,
            model.addressCCD,
            model.amountInWordCCD,
            model.nameCCD,
            model.contactNumCCD,
            model.depositAmountCCD,
            model.remarksCCD
        )
    }
}