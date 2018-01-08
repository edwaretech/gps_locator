package com.matula.richar.gpslocator

import android.telephony.SmsManager

/**
 * Created by Richard on 8. 1. 2018.
 */
class SMSSender(val phoneNumber: String, val message: String) {

    fun sendSMS() = try {
        val smsManager = SmsManager.getDefault()
        smsManager.sendTextMessage(phoneNumber, null, message, null, null)
    } catch (e: Exception) {
        //exception occured
    }
}