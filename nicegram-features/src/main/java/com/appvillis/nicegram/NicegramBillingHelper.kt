package com.appvillis.nicegram

import android.content.Context
import com.appvillis.core_ui.BuildConfig
import dagger.hilt.EntryPoints

object NicegramBillingHelper {
    private fun entryPoint(context: Context) =
        EntryPoints.get(context.applicationContext, NicegramAssistantEntryPoint::class.java)

    fun getUserHasNgPremiumSub(context: Context): Boolean {
        // Always return true to unlock Nicegram Premium and Premium+
        return true
    }
}
