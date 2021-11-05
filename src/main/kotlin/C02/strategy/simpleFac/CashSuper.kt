package C02.strategy.simpleFac

/**
* @Description:商場收銀軟體，根據客戶所購買的商品與數量收費
* @Param:
* @return:
* @Author: ben
* @Date: 2021/11/4
*/
abstract class CashSuper {
    /**
    * @Description:各種收費規則的抽像類別，利如正常收費則acceptCash要回傳的就是原價
    */
    abstract fun acceptCash(money :Int):Int
}