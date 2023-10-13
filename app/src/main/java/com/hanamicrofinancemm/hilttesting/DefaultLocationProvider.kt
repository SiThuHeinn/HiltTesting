package com.hanamicrofinancemm.hilttesting

import javax.inject.Inject

class DefaultLocationProvider @Inject constructor() : LocationProvider {

    override fun fetchLocation(): String = "Yangon"

    override fun fetchLocationCode(): String = "16.30, 19.21"
}