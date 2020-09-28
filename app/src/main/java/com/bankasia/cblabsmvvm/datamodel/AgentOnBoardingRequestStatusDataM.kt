package com.bankasia.cblabsmvvm.datamodel

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class AgentOnBoardingRequestStatusDataM(

    @SerializedName("THANA")
    var THANA:String?,

    @SerializedName("AGN_CATEGORY")
    var AGN_CATEGORY:String?,

    @SerializedName("COURIER_ADDRESS")
    var COURIER_ADDRESS:String?,

    @SerializedName("UPDATE_DATE")
    var UPDATE_DATE:String?,

    @SerializedName("CONTACT_PERSON")
    var CONTACT_PERSON:String?,

    @SerializedName("REMARKS")
    var REMARKS:String?,

    @SerializedName("DEMOGRAPHY")
    var DEMOGRAPHY:String?,

    @SerializedName("EMAIL")
    var EMAIL:String?,

    @SerializedName("DIVISION")
    var DIVISION:String?,

    @SerializedName("AC_LINKED")
    var AC_LINKED:String?,

    @SerializedName("DISTRICT")
    var DISTRICT:String?,

    @SerializedName("REQ_TYPE")
    var REQ_TYPE:String?,

    @SerializedName("CIB_DEFAULTER")
    var CIB_DEFAULTER:String?,

    @SerializedName("STATUS")
    var STATUS:String?,

    @SerializedName("AREA")
    var AREA:String?,

    @SerializedName("BUSINESS_TYPE")
    var BUSINESS_TYPE:String?,

    @SerializedName("BRANCH_CODE")
    var BRANCH_CODE:String?,

    @SerializedName("BIC")
    var BIC:String?,

    @SerializedName("OUTLET_CREATED")
    var OUTLET_CREATED:String?,

    @SerializedName("TRADE_LICENSE_NMAE")
    var TRADE_LICENSE_NMAE:String?,

    @SerializedName("TERITORY")
    var TERITORY:String?,

    @SerializedName("REQ_ID")
    var REQ_ID:String?,

    @SerializedName("DST")
    var DST:String?,

    @SerializedName("POINT_ID")
    var POINT_ID:String?,

    @SerializedName("UPDATE_BY")
    var UPDATE_BY:String?,

    @SerializedName("REQ_NAME")
    var REQ_NAME:String?,

    @SerializedName("PROFILE_CREATED")
    var PROFILE_CREATED:String?,

    @SerializedName("CUST_TYPE")
    var CUST_TYPE:String?,

    @SerializedName("PREF_COURIER_POINT")
    var PREF_COURIER_POINT:String?,

    @SerializedName("LOCATION_TYPE")
    var LOCATION_TYPE:String?,

    @SerializedName("REGION")
    var REGION:String?,

    @SerializedName("MOBILE_NO")
    var MOBILE_NO:String?,

    @SerializedName("AGN_TYPE")
    var AGN_TYPE:String?,

    @SerializedName("CREATE_DATE")
    var CREATE_DATE:String?,

    @SerializedName("OUTLET_ADDRESS")
    var OUTLET_ADDRESS:String?,

    @SerializedName("CREATE_BY")
    var CREATE_BY:String?,

    @SerializedName("CIB_CHARGE_AC")
    var CIB_CHARGE_AC:String?,

    @SerializedName("REQ_NO")
    var REQ_NO:String?,


) : Parcelable
