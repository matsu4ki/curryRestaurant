import procedure.ChickenCurryCooking
import procedure.KeemaCurryCooking
import procedure.MuttonCurryCooking
import curry.option.FukugamiPickles
import curry.option.Sweet
import curry.option.VerySpicy

fun main() {
    println("注文をどうぞ")

    // 注文
    val muttonCurryCooking = MuttonCurryCooking()
    muttonCurryCooking.curry = VerySpicy(muttonCurryCooking.curry)

    val chickenCurryCooking = ChickenCurryCooking()
    chickenCurryCooking.curry = FukugamiPickles(Sweet(chickenCurryCooking.curry))

    val keemaCurryCooking = KeemaCurryCooking()

    // カレーを作る
    muttonCurryCooking.makeCurry()
    chickenCurryCooking.makeCurry()
    keemaCurryCooking.makeCurry()

    println("お客に持っていきました")

    println("==================")
    println("お会計")
    println(muttonCurryCooking.curry.getCurryName() + "は" + muttonCurryCooking.curry.howMuch() + "円")
    println(chickenCurryCooking.curry.getCurryName() + "は" + chickenCurryCooking.curry.howMuch().toString() + "円")
    println(keemaCurryCooking.curry.getCurryName() + "は" + keemaCurryCooking.curry.howMuch().toString()  + "円")

    keemaCurryCooking.curry.howMuch().let { println(it)}
}