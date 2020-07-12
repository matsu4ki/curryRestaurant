package curry

import curry.enum.CurryType

class MuttonCurry(val curry: PlainCurry) : Curry {

    override fun chooseHotFlavor(): String {
        return curry.chooseHotFlavor()
    }


    override fun getCurryName(): String {
        return CurryType.Mutton.jaName + curry.getCurryName()
    }

    override fun howMuch(): Int {
        return curry.howMuch() + 200
    }
}

