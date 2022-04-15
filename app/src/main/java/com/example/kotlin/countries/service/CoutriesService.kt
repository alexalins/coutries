package com.example.kotlin.countries.service

import com.example.kotlin.countries.di.DaggerApiComponent
import com.example.kotlin.countries.model.Country
import io.reactivex.Single
import javax.inject.Inject

class CoutriesService {

    @Inject
    lateinit var  api: CountriesApi

    init {
        DaggerApiComponent.create().inject(this)
    }

    fun getCountries(): Single<List<Country>> {
        return api.getCountries()
    }
}