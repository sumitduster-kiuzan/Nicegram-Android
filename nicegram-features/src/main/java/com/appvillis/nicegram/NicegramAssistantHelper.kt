package com.appvillis.nicegram

import android.content.Context
import com.appvillis.feature_nicegram_assistant.domain.SpecialOffersRepository
import dagger.hilt.EntryPoints

object NicegramAssistantHelper {
    private fun entryPoint(context: Context) = EntryPoints.get(context.applicationContext, NicegramAssistantEntryPoint::class.java)

    fun getSpecialOffer(context: Context): SpecialOffersRepository.SpecialOffer? {
        // Disabled special offers/ads since premium is unlocked
        return null
    }

    fun findSpecialOffer(context: Context, id: Int): SpecialOffersRepository.SpecialOffer? {
        val ep = entryPoint(context)
        val getSpecialOfferUseCase = ep.getSpecialOfferUseCase()

        return getSpecialOfferUseCase.allOffers.find { it.id == id }
    }

    fun getPossibleChatPlacements(context: Context, isRestricted: Boolean, hasNgPremium: Boolean) =
        emptyList<Any>() // Disabled ads placements

    fun getEsimSplashData(context: Context): Any? = null // Disabled ads

    fun shouldShowAvatarsWelcome(context: Context) = !entryPoint(context).avatarsOnboardingUseCase().hasSeenWelcome
    fun hasGeneratedAvatar(context: Context) = entryPoint(context).getAvatarsUseCase().hasAnyAvatar
}
