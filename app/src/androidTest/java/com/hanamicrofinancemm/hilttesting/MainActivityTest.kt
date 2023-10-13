package com.hanamicrofinancemm.hilttesting

import androidx.test.ext.junit.rules.ActivityScenarioRule
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import javax.inject.Inject
import org.junit.Assert.*


@HiltAndroidTest
class MainActivityTest {



    @get:Rule(order = 1)
    var hiltRule = HiltAndroidRule(this)

    @get:Rule(order = 2)
    var activityRule: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)


    @Inject
    lateinit var locationProvider: LocationProvider


    @Before
    fun setup() {
        hiltRule.inject()
    }

    @Test
    fun location_must_be_London() {
        assertEquals("London", locationProvider.fetchLocation())
    }

    @Test
    fun location_code_must_be_same() {
        assertEquals("1600.30, 1900.21", locationProvider.fetchLocationCode())
    }


    @Test
    fun start() {
        Thread.sleep(10_000)
    }


}