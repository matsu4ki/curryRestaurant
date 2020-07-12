package curry

import curry.enum.CurryType

class KeemaCurry(val curry: Curry): Curry {

    override fun chooseHotFlavor(): String {
        return curry.chooseHotFlavor()
    }

    override fun getCurryName(): String {
        return CurryType.Keema.jaName + curry.getCurryName()
    }

    override fun howMuch(): Int {
        return curry.howMuch() + 50
    }
}

