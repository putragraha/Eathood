package id.assist.eathood.cashier


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version DiscountVoucher, v 1.3.0 2019-12-16 10:42 by Putra Nugraha
 */
class CashbackVoucher(private var currencyAmount: CurrencyAmount) :
    VoucherDecorator(currencyAmount) {

    override fun getTotalAmount(): Int = currencyAmount.getTotalAmount()

    override fun getCurrency(): String = currencyAmount.getCurrency()

    override fun getDescription(): String {
        return "Cashback 30%\n" + currencyAmount.getDescription()
    }
}