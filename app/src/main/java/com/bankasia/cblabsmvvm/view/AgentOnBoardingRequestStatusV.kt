package com.bankasia.cblabsmvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bankasia.cblabsmvvm.R
import com.bankasia.cblabsmvvm.adapter.AgentOnBoardingRequestListAdapter
import com.bankasia.cblabsmvvm.datamodel.AgentOnBoardingRequestStatusDataM
import com.bankasia.cblabsmvvm.requestmodel.AgentOnBoardingRequestStatusRequestM
import com.bankasia.cblabsmvvm.viewmodel.AgentOnBoardingRequestStatusViewM
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class AgentOnBoardingRequestStatusV : AppCompatActivity() {

    private lateinit var agentOnBoardingReqStatusVM : AgentOnBoardingRequestStatusViewM
    private lateinit var requestList: ArrayList<AgentOnBoardingRequestStatusDataM>

    lateinit var toolbar: Toolbar
    lateinit var recyclerView: RecyclerView

    lateinit var acNumberSearch:String

    lateinit var searchLyt: TextInputLayout
    lateinit var edtSearch: TextInputEditText
    lateinit var btnSubmit: Button
    lateinit var btnCancel: Button
    lateinit var btnClear: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agent_on_boarding_request_status_v)

        recyclerView = findViewById(R.id.rvRequestTable)
        toolbar = findViewById(R.id.toolbar)
        searchLyt = findViewById(R.id.editTextSearchLytRA)
        edtSearch = findViewById(R.id.edtACSearchRA)
        btnSubmit = findViewById(R.id.btnSubmitRA)
        btnCancel = findViewById(R.id.btnCancelRA)
        btnClear = findViewById(R.id.btnClearRA)
        requestList = ArrayList<AgentOnBoardingRequestStatusDataM>()

        setSupportActionBar(toolbar)
        supportActionBar?.title = "Request"
        supportActionBar?.subtitle="Acknowledgement"

        agentOnBoardingReqStatusVM = ViewModelProviders.of(this).get(AgentOnBoardingRequestStatusViewM::class.java)

        doActonAgentOnBoardingRequestStatus()
        observeViewModel()




    }

    private fun doActonAgentOnBoardingRequestStatus() {
        var model = AgentOnBoardingRequestStatusRequestM()
        model.reqCode = "1"

        this.let { it1->agentOnBoardingReqStatusVM.fetchAgentOnBoardingReq(model,it1) }
    }

    fun observeViewModel() {

        agentOnBoardingReqStatusVM.agentOnBoardingReqInfo.observe(this, androidx.lifecycle.Observer {

            it?.let {

                if (null!=it) {
                    requestList.clear()
                    requestList = ArrayList<AgentOnBoardingRequestStatusDataM>()
                    for (i in 0 until it!!.size){
                        edtSearch.setText(it[0].THANA)
                        val model = AgentOnBoardingRequestStatusDataM(
                            it.get(i).THANA.toString(),
                            it.get(i).AGN_CATEGORY.toString(),
                            it.get(i).COURIER_ADDRESS.toString(),
                            it.get(i).UPDATE_DATE.toString(),
                            it.get(i).CONTACT_PERSON.toString(),
                            it.get(i).REMARKS.toString(),
                            it.get(i).DEMOGRAPHY.toString(),
                            it.get(i).EMAIL.toString(),
                            it.get(i).DIVISION.toString(),
                            it.get(i).AC_LINKED.toString(),
                            it.get(i).DISTRICT.toString(),
                            it.get(i).REQ_TYPE.toString(),
                            it.get(i).CIB_DEFAULTER.toString(),
                            it.get(i).STATUS.toString(),
                            it.get(i).AREA.toString(),
                            it.get(i).BUSINESS_TYPE.toString(),
                            it.get(i).BRANCH_CODE.toString(),
                            it.get(i).BIC.toString(),
                            it.get(i).OUTLET_CREATED.toString(),
                            it.get(i).TRADE_LICENSE_NMAE.toString(),
                            it.get(i).TERITORY.toString(),
                            it.get(i).REQ_ID.toString(),
                            it.get(i).DST.toString(),
                            it.get(i).POINT_ID.toString(),
                            it.get(i).UPDATE_BY.toString(),
                            it.get(i).REQ_NAME.toString(),
                            it.get(i).PROFILE_CREATED.toString(),
                            it.get(i).CUST_TYPE.toString(),
                            it.get(i).PREF_COURIER_POINT.toString(),
                            it.get(i).LOCATION_TYPE.toString(),
                            it.get(i).REGION.toString(),
                            it.get(i).MOBILE_NO.toString(),
                            it.get(i).AGN_TYPE.toString(),
                            it.get(i).CREATE_DATE.toString(),
                            it.get(i).OUTLET_ADDRESS.toString(),
                            it.get(i).CREATE_BY.toString(),
                            it.get(i).CIB_CHARGE_AC.toString(),
                            it.get(i).REQ_NO.toString()
                        )

                        requestList.add(model)

                    }
                    Log.e("size-->",requestList.size.toString())
                    val linearLayoutManager = LinearLayoutManager(this)
                    recyclerView.layoutManager = linearLayoutManager
                    recyclerView.setHasFixedSize(true)
                    recyclerView.adapter = AgentOnBoardingRequestListAdapter(requestList, this@AgentOnBoardingRequestStatusV)


                } else {
                    Toast.makeText(this,"No data found", Toast.LENGTH_SHORT).show()
                }
            }
        })

    }


}