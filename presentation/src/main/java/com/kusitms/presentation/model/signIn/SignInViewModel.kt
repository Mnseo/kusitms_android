package com.kusitms.presentation.model.signIn

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SignInViewModel:ViewModel() {
    private val _major = MutableLiveData<String>("")
    val major: LiveData<String> = _major

    private val _email = MutableLiveData<String>("")
    val email: LiveData<String> = _email

    private val _phoneNum = MutableLiveData<String>("")
    val phoneNum: LiveData<String> = _phoneNum

    private val _isAllFieldsValid = MutableLiveData<Boolean>(false)
    val isAllFieldsValid: LiveData<Boolean> = _isAllFieldsValid

    private val _snackbarState = MutableLiveData<SnackbarState>(SnackbarState.Hidden)
    val snackbarState: LiveData<SnackbarState> = _snackbarState

    private val _selectedPart = MutableLiveData<String?>()
    val selectedPart: LiveData<String?> = _selectedPart

    fun updateMajor(newMajor: String) {
        _major.value = newMajor
    }

    fun updateEmail(newEmail: String) {
        _email.value = newEmail
    }

    fun updatePhoneNum(newNumber: String) {
        _phoneNum.value = newNumber
    }

    fun onButtonClick(): Boolean {
        return _isAllFieldsValid.value == true
    }

    private fun validateFields() {
        _isAllFieldsValid.value = !(_email.value.isNullOrBlank() || _phoneNum.value.isNullOrBlank() || _major.value.isNullOrBlank())
    }

    fun showSnackbar() {
        _snackbarState.value = SnackbarState.Shown
    }

    fun hideSnackbar() {
        _snackbarState.value = SnackbarState.Hidden
    }

    fun updateSelectedPart(part: String) {
        _selectedPart.value = part
    }

}