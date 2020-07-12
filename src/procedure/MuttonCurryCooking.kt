package procedure

import curry.Curry
import curry.MuttonCurry
import curry.PlainCurry

class MuttonCurryCooking: CurryCooking() {

    override var curry: Curry = MuttonCurry(PlainCurry())

    override fun arrangementCurry(curry: Curry) = println("羊の絵が書いてある皿に盛り付けます")
}