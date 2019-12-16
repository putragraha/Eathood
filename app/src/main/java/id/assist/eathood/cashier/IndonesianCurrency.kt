package id.assist.eathood.cashier


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version IndonesianCurrency, v 1.3.0 2019-12-16 09:56 by Putra Nugraha
 */
class IndonesianCurrency : CurrencyAmount() {

    init {
        currency = "Rp "
    }

    override fun getAmountDescription(): String = currency + amount
}