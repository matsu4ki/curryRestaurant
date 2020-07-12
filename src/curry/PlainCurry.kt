package curry

import curry.enum.Flavor

class PlainCurry: Curry {
    private var name = "カレー"
    private var price = 100

    override fun chooseHotFlavor(): String {
        return Flavor.REGULAR.jaName
    }

    override fun getCurryName(): String {
        return name
    }

    override fun howMuch(): Int {
        return price
    }
}