package C01.simpleFactory



/**
 * SimpleFactory Pattern
 * 使用Calculator Factory來產生對應的計算類別<br></br>
 * 缺點是程式碼被拆的很散，不是適合簡單的小功能<br></br>
 * 優點是容易擴充與維護，因為毎個計算類別都是獨立的
 * 因此寫程式的人只要專注在一個計算類別是就好<br></br>
 * 要擴充時也只要新增類別，並且來這個SimpleFactory增加switch選相即可
 * @author Yan
 */
object CalculatorFactory {
    fun getCalculator(operator: Char): Calculator {
        var calculator: Calculator? = null
        when (operator) {
            '+' -> calculator = CalulatorAdd()
            '-' -> calculator = CalulatorSub()
            '*' -> calculator = CalulatorMul()
            '/' -> calculator = CalulatorDiv()
            else -> throw Exception("輸入錯誤")
        }
        return calculator
    }
}
