package C01.simpleFactory

/**
 * 毎一種計算邏輯(+,-,*,/)各自獨立抽出一個"計算class"，Calculator class規範"計算class"應該有哪些方法
 * @author Yan
 */
abstract class Calculator {
    protected var numberA = 0
    protected var numberB = 0
    fun setNumber(a: Int, b: Int) {
        numberA = a
        numberB = b
    }

    /**
     * 這個方法需要被overwrite，計算的方法請在這邊實作
     * @return
     */
    abstract val result: Int
}
