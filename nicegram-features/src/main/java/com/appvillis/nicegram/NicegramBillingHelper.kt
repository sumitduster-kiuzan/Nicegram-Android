package com.appvillis.nicegram

import android.content.Context

object NicegramBillingHelper {
    @Suppress("UNUSED_PARAMETER")
    fun getUserHasNgPremiumSub(context: Context): Boolean {
        // Always return true to unlock premium features
        return true
    }
}
