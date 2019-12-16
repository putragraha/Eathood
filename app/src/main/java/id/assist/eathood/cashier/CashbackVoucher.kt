package id.assist.eathood.cashier


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version DiscountVoucher, v 1.3.0 2019-12-16 10:42 by Putra Nugraha
 */
class CashbackVoucher(private var currencyAmount: CurrencyAmount) :
    VoucherDecorator(currencyAmount) {

    override fun getAmountDescription(): String {
        return "Cashback 30%\n" + currencyAmount.getAmountDescription()
    }
}