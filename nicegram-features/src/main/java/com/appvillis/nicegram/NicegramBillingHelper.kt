package com.appvillis.nicegram

import android.content.Context

object NicegramBillingHelper {
    fun getUserHasNgPremiumSub(context: Context): Boolean {
        // Unlocked: Premium and Premium+ features enabled
        return true
    }
}
