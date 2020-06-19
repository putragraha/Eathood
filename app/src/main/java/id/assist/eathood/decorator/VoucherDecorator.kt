package id.assist.eathood.decorator


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version VoucherDecorator, v 1.3.0 2019-12-16 10:37 by Putra Nugraha
 */
abstract class VoucherDecorator(currencyAmount: CurrencyAmount): CurrencyAmount() {
    abstract override fun getTotalAmount(): Int
}