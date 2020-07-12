package procedure

import curry.PlainCurry
import curry.ChikenCurry
import curry.Curry

class ChickenCurryCooking: CurryCooking() {

    override var curry: Curry = ChikenCurry(PlainCurry())

    override fun arrangementCurry(curry: Curry) = println("ひよこが書いてある皿に盛り付けます")
}