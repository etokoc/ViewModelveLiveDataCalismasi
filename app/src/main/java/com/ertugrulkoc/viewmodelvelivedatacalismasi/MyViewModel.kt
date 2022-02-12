package com.ertugrulkoc.viewmodelvelivedatacalismasi

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    var number = 0
    val currentNumber = MutableLiveData<Int>()
    val currentBoolean = MutableLiveData<Boolean>()
}