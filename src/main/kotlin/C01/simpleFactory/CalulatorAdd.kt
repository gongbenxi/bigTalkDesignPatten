package C01.simpleFactory




/**
 * 加法計算
 * @author Yan
 */
class CalulatorAdd : Calculator() {
    override val result: Int
        get() = numberA + numberB
}
