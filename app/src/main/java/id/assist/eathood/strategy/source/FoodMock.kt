package id.assist.eathood.strategy.source

import android.content.Context
import id.assist.eathood.strategy.model.Food
import id.assist.eathood.util.FoodBuilder


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version FoodMock, v 1.1.0 2019-08-28 23:57 by Putra Nugraha
 */

class FoodMock {

    companion object {
        fun data(context: Context): List<Food> =
            listOf(
                FoodBuilder.build(context, "Bakso", "bakso.jpg", "bakso.txt"),
                FoodBuilder.build(context, "Donat", "donat.jpg", "donat.txt"),
                FoodBuilder.build(context, "Martabak Har", "martabak-har.jpg", "martabak-har.txt"),
                FoodBuilder.build(context, "Martabak Mesir", "martabak-mesir.jpg", "martabak-mesir.txt"),
                FoodBuilder.build(context, "Mie Goreng", "migor.jpg", "migor.txt"),
                FoodBuilder.build(context, "Nasi Goreng", "nasgor.jpg", "nasgor.txt"),
                FoodBuilder.build(context, "Pempek", "pempek.jpg", "pempek.txt"),
                FoodBuilder.build(context, "Sate Madura", "sate-madura.jpg", "sate-madura.txt"),
                FoodBuilder.build(context, "Sate Padang", "sate-padang.jpg", "sate-padang.txt"),
                FoodBuilder.build(context, "Siomay", "siomay.jpg", "siomay.txt"),
                FoodBuilder.build(context, "Tekwan", "tekwan.jpg", "tekwan.txt")
            )
    }
}