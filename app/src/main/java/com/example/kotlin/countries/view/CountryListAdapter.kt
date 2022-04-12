package com.example.kotlin.countries.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin.countries.R
import com.example.kotlin.countries.model.Country
import kotlinx.android.synthetic.main.item_country.view.*

class CountryListAdapter(var countries: ArrayList<Country>):
    RecyclerView.Adapter<CountryListAdapter.CountryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int) = CountryViewHolder (
        LayoutInflater.from(parent.context).inflate(R.layout.item_country, parent, false)
    )

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.bing(countries[position])
    }

    override fun getItemCount() = countries.size

    fun updateCountries(newCountries: List<Country>) {
        countries.clear()
        countries.addAll(newCountries)
        notifyDataSetChanged()
    }

    //
    class CountryViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val  countryName = view.name

        fun bing(country: Country) {
            countryName.text = country.name
        }
    }
}