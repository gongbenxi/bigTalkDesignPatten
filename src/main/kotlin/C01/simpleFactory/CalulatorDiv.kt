package C01.simpleFactory

import C01.simpleFactory.Calculator


/**
 * 除法計算
 * @author Yan
 */
class CalulatorDiv : Calculator() {
    override val result: Int
        get() = numberA / numberB
}
