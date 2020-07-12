package procedure

import curry.Curry
import curry.PlainCurry

abstract class CurryCooking {

    open var curry: Curry = PlainCurry()

    // 野菜炒めとルー入れは必須
    private fun preparetion() = println("野菜を炒めます")
    private fun useCurryRoux(curry: Curry) = println(curry.chooseHotFlavor() + "のルーを入れます")
    // 盛り付ける皿は自由
    protected open fun arrangementCurry(curry: Curry) = println("普通の皿に盛り付けます")

    // カレーは変更可能
    private fun chooseCurry(): Curry = curry

    fun makeCurry() {
        val curry = chooseCurry()
        println(curry.getCurryName() + "を作ります")
        preparetion()
        useCurryRoux(curry)
        arrangementCurry(curry)
    }
}