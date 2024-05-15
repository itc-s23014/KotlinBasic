fun main(args: Array<String>) {
    println("---21.1---")
    val answer: Int = getThreeetimes(5)
    println(answer)
    run {
        println("---21.2---")
        val answer: Int = getTimes(2, 3)
        println(answer)
    }
    run {
        println("---21.3---")
        val answer = getTimes(2,3,4)
        println("変数　answerの値:" + answer)
        printTimes(2,3,4)
        printTimes(5,8,10)
        printTimes(1,2,100)
    }
    run {
        println("---21.4---")
        printTimes1(2,3)
        printTimes1(5,10,20)
        printTimes1(1,10,100,1000)
        printTimes1(2,2,2,2,2,2,2)
    }
}
//fun getThreeetimes(value: Int): Int {
//    return value * 3
// 21.4
  fun getThreeetimes(value: Int): Int = value * 3
 //21.8
fun getTimes(x: Int,y: Int)= x * y
//21.10
fun getTimes(x: Int,y: Int,z: Int): Unit {
    println("パラメータとして、${x}と${y}と${z}を受け取りました。")
    println("これらの値を全部掛け算した答えは ${x*y*z}です。")
}
//21.13
fun printTimes(x: Int, y: Int, z: Int) {
    println("----------------------------------------------")
    println("パラメータとして、${x}と${y}と${z}を受け取りました。")
    println("これらの値を全部掛け算した答えは ${x*y*z}です。")
    println("---------------------------------------------")
}
//21.14
fun printTimes1(vararg numbers: Int) {
    var result = 1
    for (x in numbers) result *= x
    println("すべての数値を掛け算した結果は${result}")
}