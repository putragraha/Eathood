package id.assist.eathood.decorator


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version IndonesianCurrency, v 1.3.0 2019-12-16 09:56 by Putra Nugraha
 */
class IndonesianCurrency(var amount: Int) : CurrencyAmount() {

    override fun getCurrency(): String = "Rp "

    override fun getTotalAmount(): Int = amount

    override fun getDescription(): String = ""
}