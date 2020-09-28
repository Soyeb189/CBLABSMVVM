package com.bankasia.cblabsmvvm.view

import android.os.Bundle
import android.widget.AutoCompleteTextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.bankasia.cblabsmvvm.R
import com.bankasia.cblabsmvvm.datamodel.AgentOnBoardingRequestStatusDataM
import com.bankasia.cblabsmvvm.requestmodel.AgentOnBoardingRequestStatusRequestM
import com.google.android.material.textfield.TextInputEditText

class AgentOnBoardingRequestStatusDetailsV : AppCompatActivity() {

    private lateinit var toolbar: Toolbar

    //*********Variables*********//
    private lateinit var region:String
    private lateinit var area:String
    private lateinit var territory:String
    private lateinit var dst:String
    private lateinit var division:String
    private lateinit var district:String
    private lateinit var thana:String
    private lateinit var requestType:String
    private lateinit var outlet:String
    private lateinit var agentType:String
    private lateinit var agentName:String
    private lateinit var companyName:String
    private lateinit var businessType:String
    private lateinit var contactPersonName:String
    private lateinit var outletName:String
    private lateinit var outletAddress:String
    private lateinit var tagBranch:String
    private lateinit var tradeLicenceName:String
    private lateinit var cibChargeAccount:String
    private lateinit var preferredCourier:String
    private lateinit var courierPointAddress:String
    private lateinit var mobile:String
    private lateinit var email:String
    private lateinit var demography:String
    private lateinit var agentCategory:String
    private lateinit var remarks:String


    //********* Edit Text ********//
    private lateinit var edtRegion: AutoCompleteTextView
    private lateinit var edtArea: AutoCompleteTextView
    private lateinit var edtTerritory: AutoCompleteTextView
    private lateinit var edtDst: AutoCompleteTextView
    private lateinit var edtDivision: AutoCompleteTextView
    private lateinit var edtDistrict: AutoCompleteTextView
    private lateinit var edtThana: AutoCompleteTextView
    private lateinit var edtRequestType: AutoCompleteTextView
    private lateinit var edtOutlet: AutoCompleteTextView
    private lateinit var edtAgentType: AutoCompleteTextView
    private lateinit var edtAgentName: TextInputEditText
    private lateinit var edtCompanyName: TextInputEditText
    private lateinit var edtBusinessType: TextInputEditText
    private lateinit var edtContactPersonName: TextInputEditText
    private lateinit var edtOutletName: TextInputEditText
    private lateinit var edtOutletAddress: TextInputEditText
    private lateinit var edtTagBranch: AutoCompleteTextView
    private lateinit var edtTradeLicenceName: TextInputEditText
    private lateinit var edtCibChargeAccount: TextInputEditText
    private lateinit var edtPreferredCourier: TextInputEditText
    private lateinit var edtCourierPointAddress: TextInputEditText
    private lateinit var edtMobile: TextInputEditText
    private lateinit var edtEmail: TextInputEditText
    private lateinit var edtDemography: AutoCompleteTextView
    private lateinit var edtAgentCategory: AutoCompleteTextView
    private lateinit var edtRemarks: TextInputEditText


    private var listRequest: AgentOnBoardingRequestStatusDataM? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agent_on_boarding_request_status_details_v)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar!!.title = "Regional Request"

        init()

        val intent = intent

        if (intent.hasExtra("list")){
            listRequest = getIntent().getParcelableExtra("list")

            edtRegion.setText(listRequest?.REGION.toString())
            edtRegion.isEnabled = false

            edtArea.setText(listRequest?.AREA.toString())
            edtArea.isEnabled = false

            edtTerritory.setText(listRequest?.TERITORY.toString())
            edtTerritory.isEnabled = false

            edtDst.setText(listRequest?.DST.toString())
            edtDst.isEnabled = false

            edtDivision.setText(listRequest?.DIVISION.toString())
            edtDivision.isEnabled = false

            edtDistrict.setText(listRequest?.DISTRICT.toString())
            edtDistrict.isEnabled = false

            edtThana.setText(listRequest?.THANA.toString())
            edtThana.isEnabled = false

            edtRequestType.setText(listRequest?.REQ_TYPE.toString())
            edtRequestType.isEnabled = false

//            edtOutlet.setText(listRequest?.OUTLET_ADDRESS.toString())
//            edtOutlet.isEnabled = false

            edtAgentType.setText(listRequest?.AGN_TYPE.toString())
            edtAgentType.isEnabled = false

//            edtCompanyName.setText(listRequest?.CO.toString())
//            edtArea.isEnabled = false

            edtBusinessType.setText(listRequest?.BUSINESS_TYPE.toString())
            edtBusinessType.isEnabled = false

            edtContactPersonName.setText(listRequest?.CONTACT_PERSON.toString())
            edtContactPersonName.isEnabled = false

//            edtOutletName.setText(listRequest?.OUT.toString())
//            edtArea.isEnabled = false

            edtOutletAddress.setText(listRequest?.OUTLET_ADDRESS.toString())
            edtOutletAddress.isEnabled = false

//            edtTagBranch.setText(listRequest?.TAG.toString())
//            edtArea.isEnabled = false

            edtTradeLicenceName.setText(listRequest?.TRADE_LICENSE_NMAE.toString())
            edtTradeLicenceName.isEnabled = false

            edtCibChargeAccount.setText(listRequest?.CIB_CHARGE_AC.toString())
            edtCibChargeAccount.isEnabled = false

            edtPreferredCourier.setText(listRequest?.PREF_COURIER_POINT.toString())
            edtPreferredCourier.isEnabled = false

            edtCourierPointAddress.setText(listRequest?.COURIER_ADDRESS.toString())
            edtCourierPointAddress.isEnabled = false

            edtMobile.setText(listRequest?.MOBILE_NO.toString())
            edtMobile.isEnabled = false

            edtEmail.setText(listRequest?.EMAIL.toString())
            edtEmail.isEnabled = false

            edtDemography.setText(listRequest?.DEMOGRAPHY.toString())
            edtArea.isEnabled = false

            edtAgentCategory.setText(listRequest?.AGN_CATEGORY.toString())
            edtAgentCategory.isEnabled = false

            edtRemarks.setText(listRequest?.REMARKS.toString())
            edtRemarks.isEnabled = false


        }

    }

    private fun init() {
        //********* Edit text initialization start ********//

        edtRegion=findViewById(R.id.edtRegionAOnBo)
        edtArea=findViewById(R.id.edtAreaAOnBo)
        edtTerritory=findViewById(R.id.edtTerritoryAOnBo)
        edtDst=findViewById(R.id.edtDSTAOnBo)
        edtDivision=findViewById(R.id.edtDivisionAOnBo)
        edtDistrict=findViewById(R.id.edtDistrictAOnBo)
        edtThana=findViewById(R.id.edtThanaAOnBo)
        edtRequestType=findViewById(R.id.edtRequestTypeAOnBo)
        edtOutlet=findViewById(R.id.edtOutletAOnBo)
        edtAgentType=findViewById(R.id.edtAgentTypeAOnBo)
        edtAgentName=findViewById(R.id.edtAgentNameAOnBo)
        edtCompanyName=findViewById(R.id.edtCompanyNameAOnBo)
        edtBusinessType=findViewById(R.id.edtBusinessTypeAOnBo)
        edtContactPersonName=findViewById(R.id.edtContactPersonNameAOnBo)
        edtOutletName=findViewById(R.id.edtOutletNameAOnBo)
        edtOutletAddress=findViewById(R.id.edtOutletAddressAOnBo)
        edtTagBranch=findViewById(R.id.edtTagBranchAOnBo)
        edtTradeLicenceName=findViewById(R.id.edtTradeLicenceNameInEngAOnBo)
        edtCibChargeAccount=findViewById(R.id.edtCibChargeAcNOAOnBo)
        edtPreferredCourier=findViewById(R.id.edtPreferredCourierPointAOnBo)
        edtCourierPointAddress=findViewById(R.id.edtCourierPointAddressAOnBo)
        edtMobile=findViewById(R.id.edtMobileAOnBo)
        edtEmail=findViewById(R.id.edtEmailAOnBo)
        edtDemography=findViewById(R.id.edtDemographyAOnBo)
        edtAgentCategory=findViewById(R.id.edtAgentCategoryAOnBo)
        edtRemarks=findViewById(R.id.edtRemarksAOnBo)

        //********* Edit text initialization end ********//
    }
}