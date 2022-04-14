package com.example.kotlin.countries.service

import com.example.kotlin.countries.model.Country
import io.reactivex.Single
import retrofit2.http.GET

interface CountriesApi {
    @GET(value = "CatalinStefan/countries/master/countriesV2.json")
    fun getCountries(): Single<List<Country>>
}