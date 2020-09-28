package com.bankasia.cblabsmvvm.viewmodel

import android.app.Activity
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bankasia.cblabsmvvm.datamodel.AgentOnBoardingRequestStatusDataM
import com.bankasia.cblabsmvvm.requestmodel.AgentOnBoardingRequestStatusRequestM
import com.bankasia.cblabsmvvm.retrofit.ApiService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class AgentOnBoardingRequestStatusViewM : ViewModel() {
    private val disposable = CompositeDisposable()
    private val apiService = ApiService()
    var agentOnBoardingReqInfo = MutableLiveData<List<AgentOnBoardingRequestStatusDataM>>()

    fun fetchAgentOnBoardingReq(model:AgentOnBoardingRequestStatusRequestM,activity: Activity){
        disposable.add(apiService.getAgentOnBoardingReqStatusService(model)
            .subscribeOn(Schedulers.newThread())
            .subscribeWith(object : DisposableSingleObserver<List<AgentOnBoardingRequestStatusDataM>>(){
                override fun onSuccess(t: List<AgentOnBoardingRequestStatusDataM>) {
                    Log.e("model-->",t.toString())


                    t.let {
                        agentOnBoardingReqInfo.postValue(t)
                    }
                }

                override fun onError(e: Throwable) {
                    Log.e("onError--->",e.toString())
                    e.printStackTrace()
                }

            })
            )

            
    }
}