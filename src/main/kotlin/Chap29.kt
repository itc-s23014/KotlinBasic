package com.example.chap29



fun main(args: Array<String>) {
    val car1 = Ferrari("赤")
    val car2 = Prius("グレー")
    run {
        diriveByCar(car1)
        diriveByCar(car2)

    }

}

fun diriveByCar(car: Car) {
    car.drive(100.0)

}
open class Car(val color: String){
    var distance = 0.0
    open  fun drive(d: Double){
        distance += d
        println("${color}の車が　${d}km走りました。")
        println("その結果、マイレージは${distance}キロになりました。")
    }
}
        class Ferrari(color: String) : Car(color){
            override fun drive(d: Double) {
                distance = distance + d
                println("${color}のフェラーリが走っています！ブウォォォーン")
                println("おおっ、かっこいい！！！")
                println("マイレージは${distance}キロになったぜい")
            }

            fun drinve(d : Double) {
                distance = distance + d
                println("${color}のフェラーリが走っています！ブウォォォーン")
                println("おおっ、かっこいい！！！")
                println("マイレージは${distance}キロになったぜい！")
            }
        }
class Prius(color: String) : Car(color){
    override fun drive(d: Double) {
        distance = distance + d
        println("${color}のプリウスが走っています！スィーン！")
        println("すごい静かですね！")
        println("マイレージは${distance}キロです。トヨタの車はいっぱい走ってもなかなか故障しません！")

    }
}
