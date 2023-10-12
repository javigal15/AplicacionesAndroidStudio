package com.example.aprendiendo.superHeroApp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.aprendiendo.databinding.ItemSuperheroBinding
import com.squareup.picasso.Picasso

class SuperHeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = ItemSuperheroBinding.bind(view)

    fun bind(
        superHeroItemResponse: SuperHeroItemResponse,
        onItemSelected: (String) -> Unit,
    ) {
        binding.tvSuperHero.text = superHeroItemResponse.superHeroName
        Picasso.get().load(superHeroItemResponse.superHeroImage.superHeroImageUrl)
            .into(binding.ivSuperHero)
        binding.root.setOnClickListener {
            onItemSelected(superHeroItemResponse.superHeroId)
        }
    }
}