package id.assist.eathood.food.source

import android.content.Context
import id.assist.eathood.food.model.Food
import id.assist.eathood.util.AssetsUtils


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version FoodMock, v 1.1.0 2019-08-28 23:57 by Putra Nugraha
 */

class FoodMock {

    companion object {
        fun data(context : Context) : List<Food> =
            listOf(
                Food(
                    "Bakso",
                    AssetsUtils.getImage("bakso.jpg", context),
                    AssetsUtils.readTxt("bakso.txt", context)
                ),
                Food(
                    "Donat",
                    AssetsUtils.getImage("donat.jpg", context),
                    AssetsUtils.readTxt("donat.txt", context)
                ),
                Food(
                    "Martabak Har",
                    AssetsUtils.getImage("martabak-har.jpg", context),
                    AssetsUtils.readTxt("martabak-har.txt", context)
                ),
                Food(
                    "Martabak Mesir",
                    AssetsUtils.getImage("martabak-mesir.jpg", context),
                    AssetsUtils.readTxt("martabak-mesir.txt", context)
                ),
                Food(
                    "Mie Goreng",
                    AssetsUtils.getImage("migor.jpg", context),
                    AssetsUtils.readTxt("migor.txt", context)
                ),
                Food(
                    "Nasi Goreng",
                    AssetsUtils.getImage("nasgor.jpg", context),
                    AssetsUtils.readTxt("nasgor.txt", context)
                ),
                Food(
                    "Pempek",
                    AssetsUtils.getImage("pempek.jpg", context),
                    AssetsUtils.readTxt("pempek.txt", context)
                ),
                Food(
                    "Sate Madura",
                    AssetsUtils.getImage("sate-madura.jpg", context),
                    AssetsUtils.readTxt("sate-madura.txt", context)
                ),
                Food(
                    "Sate Padang",
                    AssetsUtils.getImage("sate-padang.jpg", context),
                    AssetsUtils.readTxt("sate-padang.txt", context)
                ),
                Food(
                    "Siomay",
                    AssetsUtils.getImage("siomay.jpg", context),
                    AssetsUtils.readTxt("siomay.txt", context)
                ),
                Food(
                    "Tekwan",
                    AssetsUtils.getImage("tekwan.jpg", context),
                    AssetsUtils.readTxt("tekwan.txt", context)
                )
            )
    }
}