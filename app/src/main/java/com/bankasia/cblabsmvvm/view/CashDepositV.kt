package com.bankasia.cblabsmvvm.view

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.ViewModelProviders
import com.bankasia.cblabsmvvm.R
import com.bankasia.cblabsmvvm.requestmodel.CashDepositRequestM
import com.bankasia.cblabsmvvm.viewmodel.CashDepositeViewM
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.activity_main.view.*
import java.util.EnumSet.of
import java.util.List.of

class CashDepositV : AppCompatActivity() {

    private lateinit var toolbar: Toolbar
    private lateinit var dialog: Dialog
    private lateinit var loginVM: CashDepositeViewM

    //******** Buttons ********//
    private lateinit var submitButtonCCD: Button
    private lateinit var cancelButtonCCD: Button
    private lateinit var clearButtonCCD: Button

    //******** Edit Text ******//
    private lateinit var lytSearchAcNoCCD: TextInputLayout
    private lateinit var edtAccountNoCCD: TextInputEditText
    private lateinit var edtAccountTitleCCD: TextInputEditText
    private lateinit var edtNameCCD: TextInputEditText
    private lateinit var edtContactNumCCD: TextInputEditText
    private lateinit var edtAddressCCD: TextInputEditText
    private lateinit var edtDepositAmountCCD: TextInputEditText
    private lateinit var edtAmountInWordsCCD: TextInputEditText
    private lateinit var edtRemarksCCD: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginVM = ViewModelProviders.of(this).get(CashDepositeViewM::class.java)

        //******* Button Initialization start here ******//

        submitButtonCCD= findViewById(R.id.btnSubmitCCD)
        cancelButtonCCD = findViewById(R.id.btnCancelCCD)
        clearButtonCCD = findViewById(R.id.btnClearCCD)

        //******* Button Initialization End here ******//

        //******* EditText Initialization Start here ******//

        lytSearchAcNoCCD = findViewById(R.id.editTextSearchLytCCD)
        edtAccountNoCCD = findViewById(R.id.edtAccountNoSearchCCD)
        edtAccountTitleCCD = findViewById(R.id.edtAccountTitleCCD)
        edtNameCCD = findViewById(R.id.edtNameCCD)
        edtContactNumCCD = findViewById(R.id.edtContactNumberCCD)
        edtAddressCCD = findViewById(R.id.edtAddressCCD)
        edtDepositAmountCCD = findViewById(R.id.edtDepositCCD)
        edtAmountInWordsCCD = findViewById(R.id.edtAmountInWordCCD)
        edtRemarksCCD = findViewById(R.id.edtRemarksCCD)

        //******* EditText Initialization End here ******//

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = ""

        //***************Button Click Listener Start*************//

        submitButtonCCD.setOnClickListener {
            if (!validateAccountSearch() or !validateAccountTitle() or !validateName() or
                !validateContactNum() or !validateAddress() or !validateDepositAmount() or
                !validateAmountInWord()){

                return@setOnClickListener
            }else{
                doLogiAction()
            }
        }

        clearButtonCCD.setOnClickListener {
            edtAccountNoCCD.text = null
            edtAccountTitleCCD.text = null
            edtNameCCD.text = null
            edtContactNumCCD.text = null
            edtAddressCCD.text = null
            edtDepositAmountCCD.text = null
            edtAmountInWordsCCD.text = null
            edtRemarksCCD.text = null
        }

        cancelButtonCCD.setOnClickListener {

        }

        //***************Button Click Listener End*************//

        observeViewModel()
    }

    //*************** Validation functions start here *********//

    private fun validateAccountSearch():Boolean{
        var accountNoCCD = edtAccountNoCCD.text.toString().trim()
        return if (accountNoCCD.isEmpty()){
            lytSearchAcNoCCD.error = "Field can not be empty"
            false
        }

        else if (edtAccountNoCCD.text?.trim()?.isEmpty()!!){
            edtAccountTitleCCD.error = "Field Can't be empty"
            false
        }

        else{
            lytSearchAcNoCCD.error = null
            true
        }
    }

    private fun validateAccountTitle():Boolean{
        var accountTitleCCD = edtAccountTitleCCD.text.toString()
        return if (accountTitleCCD.isEmpty()){
            edtAccountTitleCCD.error = "Field can not be empty"
            false
        }
        else if (edtAccountTitleCCD.text?.trim()?.isEmpty()!!){
            edtAccountTitleCCD.error = "Field Can't be empty"
            false
        }
        else{
            edtAccountTitleCCD.error = null
            true
        }
    }

    private fun validateName():Boolean{
        var nameCCD = edtNameCCD.text.toString()
        return if (nameCCD.isEmpty()){
            edtNameCCD.error = "Field can not be empty"
            false
        }
        else if (edtNameCCD.text?.trim()?.isEmpty()!!){
            edtNameCCD.error = "Field Can't be empty"
            false
        }
        else{
            edtNameCCD.error = null
            true
        }
    }

    private fun validateContactNum():Boolean{
        var contactNumCCD = edtContactNumCCD.text.toString()
        return if (contactNumCCD.isEmpty()){
            edtContactNumCCD.error = "Field can not be empty"
            false
        }
        else if (edtContactNumCCD.text?.trim()?.isEmpty()!!){
            edtContactNumCCD.error = "Field Can't be empty"
            false
        }
        else{
            edtContactNumCCD.error = null
            true
        }
    }

    private fun validateAddress():Boolean{
        var addressCCD = edtAddressCCD.text.toString()
        return if (addressCCD.isEmpty()){
            edtAddressCCD.error = "Field can not be empty"
            false
        }
        else if (edtAddressCCD.text?.trim()?.isEmpty()!!){
            edtAddressCCD.error = "Field Can't be empty"
            false
        }
        else{
            edtAddressCCD.error = null
            true
        }
    }

    private fun validateDepositAmount():Boolean{
        var depositAmountCCD = edtDepositAmountCCD.text.toString()
        return if (depositAmountCCD.isEmpty()){
            edtDepositAmountCCD.error = "Field can not be empty"
            false
        }
        else if (edtDepositAmountCCD.text?.trim()?.isEmpty()!!){
            edtDepositAmountCCD.error = "Field Can't be empty"
            false
        }
        else{
            edtDepositAmountCCD.error = null
            true
        }
    }

    private fun validateAmountInWord():Boolean{
        var amountInWordCCD = edtAmountInWordsCCD.text.toString()
        return if (amountInWordCCD.isEmpty()){
            edtAmountInWordsCCD.error = "Field can not be empty"
            false
        }
        else if (edtAmountInWordsCCD.text?.trim()?.isEmpty()!!){
            edtAmountInWordsCCD.error = "Field Can't be empty"
            false
        }
        else{
            edtAmountInWordsCCD.error = null
            true
        }
    }

    private fun validateRemarks():Boolean{
        var remarksCCD = edtRemarksCCD.text.toString()
        var remarkSpaceCCD:String = edtRemarksCCD.text.toString().trim()

        return if (remarkSpaceCCD == " "){
            edtRemarksCCD.error = "Only space is not allowed"
            false
        }
        else{
            edtRemarksCCD.error = null
            true
        }
    }

    //*************** Validation functions end here *********//

    fun doLogiAction(){


        var model = CashDepositRequestM()
        model.accountNoCCD = edtAccountNoCCD.text.toString()
        model.accountTitleCCD = edtAccountTitleCCD.text.toString()
        model.nameCCD = edtNameCCD.text.toString()  //Encript_Parameter.getRsa_encrypt(globalVariable.imei)
        model.contactNumCCD = edtContactNumCCD.text.toString() //Encript_Parameter.getRsa_encrypt(txtUserName.text.toString())
        model.addressCCD = edtAddressCCD.text.toString() //Encript_Parameter.getRsa_encrypt(txtPassword.text.toString())
        model.depositAmountCCD = edtDepositAmountCCD.text.toString() //Encript_Parameter.getRsa_encrypt(globalVariable.lng)
        model.amountInWordCCD = edtAmountInWordsCCD.text.toString() //Encript_Parameter.getRsa_encrypt(globalVariable.lat)
        model.remarksCCD = edtRemarksCCD.text.toString() //Encript_Parameter.getRsa_encrypt(Properties_String.app_version)

        //savePreferences(Properties_String.login_preference_key,txtUserName.text.toString())

        this?.let { it1 -> loginVM.doLogin(model, it1) }
    }

    fun observeViewModel() {

        loginVM.cash_deposit_info.observe(this, androidx.lifecycle.Observer {

            it?.let {

                if ("0".equals(it.outcode)) {

                    edtAccountNoCCD.setText(it.message)

                } else {
                    Toast.makeText(this,it.message,Toast.LENGTH_SHORT).show()
                }
            }
        })

    }
}