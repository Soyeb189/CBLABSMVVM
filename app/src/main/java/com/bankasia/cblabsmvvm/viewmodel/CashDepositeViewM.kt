package com.bankasia.cblabsmvvm.viewmodel

import android.app.Activity
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bankasia.cblabsmvvm.datamodel.CashDepositDataM
import com.bankasia.cblabsmvvm.requestmodel.CashDepositRequestM
import com.bankasia.cblabsmvvm.retrofit.ApiService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class CashDepositeViewM : ViewModel() {
    private val disposable = CompositeDisposable()
    private val apiService = ApiService()
    var cash_deposit_info = MutableLiveData<CashDepositDataM>();

    fun doLogin(model: CashDepositRequestM,activity: Activity){

        //var pDialog: SweetAlertDialog? =  Custom_alert.showProgressDialog(activity)

        //pDialog?.show();

        disposable.add(apiService.getCashDepositService(model)
            .subscribeOn(Schedulers.newThread())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeWith(object : DisposableSingleObserver<CashDepositDataM>() {
                override fun onSuccess(model: CashDepositDataM) {
                    //pDialog?.hide()


                    Log.e("model-->",model.toString())

                    if(model == null){
                        //pDialog?.hide()
                    }

                    //pDialog?.hide()

                    model?.let {
                        cash_deposit_info.value = model
                    }

                }

                override fun onError(e: Throwable) {
                    //pDialog?.hide()
                    Log.e("onError--->",e.toString())
                    e.printStackTrace()

                }

            })
        )
    }

}