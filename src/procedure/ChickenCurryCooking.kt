package procedure

import curry.PlainCurry
import curry.ChickenCurry
import curry.Curry

class ChickenCurryCooking: CurryCooking() {

    override var curry: Curry = ChickenCurry(PlainCurry())

    override fun arrangementCurry(curry: Curry) = println("ひよこが書いてある皿に盛り付けます")
}