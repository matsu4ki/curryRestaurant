package curry.option

import curry.Curry
import curry.enum.Flavor

class VerySpicy(val curry: Curry) : Curry {

    override fun chooseHotFlavor(): String {
        return Flavor.VERYSPICY.jaName
    }


    override fun getCurryName(): String {
        return chooseHotFlavor() + "の" + curry.getCurryName()
    }

    override fun howMuch(): Int {
        return curry.howMuch() + 100
    }
}

