package id.assist.eathood.cashier

import android.os.Bundle
import android.text.TextUtils
import androidx.appcompat.app.AppCompatActivity
import id.assist.eathood.R
import kotlinx.android.synthetic.main.activity_cashier.*


/**
 * @author Putra Nugraha (putra.nugraha@dana.id)
 * @version CashierActivity, v 1.3.0 2019-12-16 10:51 by Putra Nugraha
 */
class CashierActivity: AppCompatActivity() {

    private var currencyAmount: CurrencyAmount? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cashier)
        initView()
    }

    private fun initView() {
        btn_calculate.setOnClickListener {
            val amount = et_total_amount.text.toString()

            if (!TextUtils.isEmpty(amount)) {
                currencyAmount = IndonesianCurrency()
                currencyAmount?.amount = Integer.parseInt(amount)

                if (cb_cashback_voucher.isChecked) {
                    currencyAmount = CashbackVoucher(currencyAmount!!)
                }

                if (cb_discount_voucher.isChecked) {
                    currencyAmount = DiscountVoucher(currencyAmount!!)
                }

                calculate()
            }
        }
    }

    private fun calculate() {
        if (currencyAmount == null) {
            return
        }

        tv_total_amount.text = currencyAmount?.getAmountDescription()
        currencyAmount = null
    }
}