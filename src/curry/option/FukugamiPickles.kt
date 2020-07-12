package curry.option

import curry.Curry

class FukugamiPickles(val curry: Curry) : Curry {

    override fun chooseHotFlavor(): String {
        return curry.chooseHotFlavor()
    }

    override fun getCurryName(): String {
        return curry.getCurryName() + "で福神漬け付き"
    }

    override fun howMuch(): Int {
        return curry.howMuch() + 150
    }
}

