package C01.simpleFactory


/**
 * 簡單的計算機，只留下計算(業物邏輯)的部分。UI介面顯示則交由client端(CalculatorTest)處理
 * 優點是開發迅速。
 * 缺點是如果要新增計算方法，例如說新增a^b的計算方法，
 * 這樣就要進來修改計算邏輯的程式，不符合開放-關閉的開發模式。
 * 如果將+,-,*,/這些方法各字抽出成為一個運算類別，
 * 這樣開發人員要新增計算方法只要新增類別就可以，不會也不需要看到+,-,*,/這些運算類別裡面寫什麼
 * @author Yan
 */
class CalculatorA {
    /**
     * 計算方法，輸入數字a,b，運算方法operator，進行相對應的計算
     * @param a
     * @param b
     * @param operate
     * @return
     * @throws Exception
     */
    fun calculate(a: Int, b: Int, operator: Char): Int {
        when (operator) {
            '+' -> result = a + b
            '-' -> result = a - b
            '*' -> result = a * b
            '/' -> result = a / b
            else -> throw Exception("輸入錯誤")
        }
        return result
    }

    companion object {
        private var result = 0
    }
}
