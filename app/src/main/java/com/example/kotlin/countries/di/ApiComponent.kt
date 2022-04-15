package com.example.kotlin.countries.di

import com.example.kotlin.countries.service.CoutriesService
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service: CoutriesService)
}