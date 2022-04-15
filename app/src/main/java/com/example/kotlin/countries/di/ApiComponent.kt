package com.example.kotlin.countries.di

import com.example.kotlin.countries.service.CoutriesService
import com.example.kotlin.countries.viewmodel.ListViewModel
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service: CoutriesService)

    fun inject(viewModel: ListViewModel)
}