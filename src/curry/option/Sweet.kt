package curry.option

import curry.Curry
import curry.enum.Flavor

class Sweet(val curry: Curry) : Curry {

    override fun chooseHotFlavor(): String {
        return Flavor.SWEET.jaName
    }

    override fun getCurryName(): String {
        return chooseHotFlavor() + "の" + curry.getCurryName()
    }

    override fun howMuch(): Int {
        return curry.howMuch() + 50
    }
}
