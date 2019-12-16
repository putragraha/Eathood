package id.assist.eathood.cashier


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version CurrencyAmount, v 1.3.0 2019-12-16 09:47 by Putra Nugraha
 */
abstract class CurrencyAmount {

    protected lateinit var currency: String

    var amount: Int = 0

    abstract fun getAmountDescription(): String
}