package com.bankasia.cblabsmvvm.adapter

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Product : Parcelable {
    @SerializedName("p_id")
    @Expose
    var pId: String? = null

    @SerializedName("p_code")
    @Expose
    var pCode: String? = null

    @SerializedName("sub_sub_cat_id")
    @Expose
    var subSubCatId: String? = null

    @SerializedName("p_name")
    @Expose
    var pName: String? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("p_price")
    @Expose
    var pPrice: String? = null

    @SerializedName("p_image1")
    @Expose
    var pImage1: String? = null

    @SerializedName("p_image2")
    @Expose
    var pImage2: String? = null

    @SerializedName("p_weight")
    @Expose
    var pWeight: String? = null

    @SerializedName("quantity")
    @Expose
    var quantity: String? = null

    @SerializedName("status")
    @Expose
    var status: String? = null

    @SerializedName("short_desc")
    @Expose
    var shortDesc: String? = null

    @SerializedName("createDate")
    @Expose
    var createDate: String? = null

    @SerializedName("modifyDate")
    @Expose
    var modifyDate: Any? = null

    @SerializedName("p_rating")
    @Expose
    var pRating: String? = null

    @SerializedName("start_date")
    @Expose
    var startDate: String? = null

    @SerializedName("start_time")
    @Expose
    var startTime: String? = null

    @SerializedName("end_date")
    @Expose
    var endDate: String? = null

    @SerializedName("end_time")
    @Expose
    var endTime: String? = null

    protected constructor(`in`: Parcel) {
        pId = `in`.readValue(String::class.java.classLoader) as String?
        pCode = `in`.readValue(String::class.java.classLoader) as String?
        subSubCatId = `in`.readValue(String::class.java.classLoader) as String?
        pName = `in`.readValue(String::class.java.classLoader) as String?
        name = `in`.readValue(String::class.java.classLoader) as String?
        pPrice = `in`.readValue(String::class.java.classLoader) as String?
        pImage1 = `in`.readValue(String::class.java.classLoader) as String?
        pImage2 = `in`.readValue(String::class.java.classLoader) as String?
        pWeight = `in`.readValue(String::class.java.classLoader) as String?
        quantity = `in`.readValue(String::class.java.classLoader) as String?
        status = `in`.readValue(String::class.java.classLoader) as String?
        shortDesc = `in`.readValue(String::class.java.classLoader) as String?
        createDate = `in`.readValue(String::class.java.classLoader) as String?
        modifyDate = `in`.readValue(Any::class.java.classLoader)
        pRating = `in`.readValue(String::class.java.classLoader) as String?
        startDate = `in`.readValue(String::class.java.classLoader) as String?
        startTime = `in`.readValue(String::class.java.classLoader) as String?
        endDate = `in`.readValue(String::class.java.classLoader) as String?
        endTime = `in`.readValue(String::class.java.classLoader) as String?
    }

    constructor() {}

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeValue(pId)
        dest.writeValue(pCode)
        dest.writeValue(subSubCatId)
        dest.writeValue(pName)
        dest.writeValue(name)
        dest.writeValue(pPrice)
        dest.writeValue(pImage1)
        dest.writeValue(pImage2)
        dest.writeValue(pWeight)
        dest.writeValue(quantity)
        dest.writeValue(status)
        dest.writeValue(shortDesc)
        dest.writeValue(createDate)
        dest.writeValue(modifyDate)
        dest.writeValue(pRating)
        dest.writeValue(startDate)
        dest.writeValue(startTime)
        dest.writeValue(endDate)
        dest.writeValue(endTime)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {
        val CREATOR: Parcelable.Creator<Product?> = object : Parcelable.Creator<Product?> {
            override fun createFromParcel(`in`: Parcel): Product? {
                return Product(`in`)
            }

            override fun newArray(size: Int): Array<Product?> {
                return arrayOfNulls(size)
            }
        }
    }
}