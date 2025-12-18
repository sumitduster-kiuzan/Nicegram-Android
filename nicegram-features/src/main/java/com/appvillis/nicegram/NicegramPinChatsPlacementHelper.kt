package com.appvillis.nicegram

import android.content.Context
import dagger.hilt.EntryPoints

object NicegramPinChatsPlacementHelper {
    private fun entryPoint(context: Context) =
        EntryPoints.get(context.applicationContext, NicegramAssistantEntryPoint::class.java)

    fun getPossiblePinChatsPlacements(context: Context) = entryPoint(context).getPinChatsPlacementsUseCase().noFilters()

    fun isPinnedChatHidden(context: Context, id: String) =
        entryPoint(context).getPinPlacementsStatusUseCase().invoke(id)

    fun setPinnedChatHidden(context: Context, id: String, hidden: Boolean) {
        if (hidden) entryPoint(context).hidePlacementUseCase().invoke(id)
        else entryPoint(context).hidePlacementUseCase().unhide(id)
    }

    fun pumpFeatureEnabled(context: Context) = false
    fun pumpEnabled(context: Context) = false

    fun setPumpEnabled(context: Context, enabled: Boolean) {
        entryPoint(context).updatePumpSettingsUseCase().setEnabled(enabled)
    }
}