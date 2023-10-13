package com.hanamicrofinancemm.hilttesting

interface LocationProvider {

    fun fetchLocation(): String

    fun fetchLocationCode(): String
}