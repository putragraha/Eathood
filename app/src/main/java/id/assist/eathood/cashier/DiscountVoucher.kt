package id.assist.eathood.cashier


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version DiscountVoucher, v 1.3.0 2019-12-16 10:42 by Putra Nugraha
 */
class DiscountVoucher(private var currencyAmount: CurrencyAmount) :
    VoucherDecorator(currencyAmount) {

    override fun getAmountDescription(): String {
        currencyAmount.amount = currencyAmount.amount - (currencyAmount.amount * 30 / 100)
        return "Discount 30%\n" + currencyAmount.getAmountDescription()
    }
}