package C01.simpleFactory



/**
 * 減法計算
 * @author Yan
 */
class CalulatorSub : Calculator() {
    override val result: Int
        get() = numberA - numberB
}
