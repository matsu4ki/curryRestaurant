package procedure

import curry.Curry
import curry.KeemaCurry
import curry.PlainCurry

class KeemaCurryCooking: CurryCooking() {

    override var curry: Curry = KeemaCurry(PlainCurry())
}