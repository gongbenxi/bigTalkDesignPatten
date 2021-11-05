package C01.simpleFactory




class CalculatorClient {


    /**
     * 業物邏輯與UI拆開的簡易計算機測試
     */
    fun calculatorA() {
        println(">>>> calculatorA 測試 <<<< ")

        // 輸入值
        val numberA = 10
        val numberB = 2
        val operator = '+'
        try {
            // 計算並輸出
            println("輸入:$numberA$operator$numberB")
            val calculator = CalculatorA()
            val result = calculator.calculate(numberA, numberB, operator)
            println("計算結果：$numberA$operator$numberB=$result")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    fun CalculatorFactory() {
        println(">>>> CalculatorFactory 測試 <<<< ")

        // 輸入值
        val numberA = 10
        val numberB = 2
        val operator = '-'
        try {
            println("輸入:$numberA$operator$numberB")
            val calculator = CalculatorFactory.getCalculator(operator)
            calculator.setNumber(numberA, numberB)
            val result: Int = calculator.result
            println("計算結果：$numberA$operator$numberB=$result")
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }
    }
    /**
     * 使用簡單工廠模式(SimpleFactory Pattern)實現簡易計算機
     */

}
fun main(args: Array<String>) {
    CalculatorClient().calculatorA()
    CalculatorClient().CalculatorFactory()
}