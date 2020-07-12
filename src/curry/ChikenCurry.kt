package curry

import curry.enum.CurryType

class ChikenCurry(val curry: Curry): Curry {
    override fun chooseHotFlavor(): String {
        return curry.chooseHotFlavor()
    }

    override fun getCurryName(): String {
        return CurryType.Chiken.jaName + curry.getCurryName()
    }

    override fun howMuch(): Int {
        return curry.howMuch() + 100
    }
}