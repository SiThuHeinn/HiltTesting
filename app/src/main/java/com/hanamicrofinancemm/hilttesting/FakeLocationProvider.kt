package com.hanamicrofinancemm.hilttesting

import javax.inject.Inject

class FakeLocationProvider @Inject constructor(): LocationProvider {

    override fun fetchLocation(): String = "London"

    override fun fetchLocationCode(): String = "1600.30, 1900.21"
}