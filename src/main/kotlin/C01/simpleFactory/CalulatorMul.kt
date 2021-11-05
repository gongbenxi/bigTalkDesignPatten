package C01.simpleFactory


/**
 * 乘法計算
 * @author Yan
 */
class CalulatorMul : Calculator() {
    override val result: Int
        get() = numberA * numberB
}
