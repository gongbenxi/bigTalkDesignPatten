package C02.strategy.simpleFac

class CashReturn(private val moneyCoundition: Double, private val moneyReturn: Double) : CashSuper() {
    /**
     * 紅利收費，利如說滿300送100
     */
    override fun acceptCash(money: Int): Int {
        var result = money

        // 收的錢比設定的條件還大，扣掉紅利優惠
        if (money > moneyCoundition) {
            result = (money - Math.floor(money / moneyCoundition) * moneyReturn).toInt()
        }
        return result
    }
}