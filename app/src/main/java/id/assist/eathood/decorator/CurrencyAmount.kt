package id.assist.eathood.decorator


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version CurrencyAmount, v 1.3.0 2019-12-16 09:47 by Putra Nugraha
 */
abstract class CurrencyAmount {

    abstract fun getCurrency(): String

    abstract fun getTotalAmount(): Int

    abstract fun getDescription(): String
}