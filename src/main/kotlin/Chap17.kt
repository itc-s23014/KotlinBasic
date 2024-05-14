fun main(args: Array<String>) {
    println("---1 :7.2---")
    val a: List<Int> = listOf(1000, 1200, 1500)

    println("1年目の時給は${a[0]}円です。")
    println("2年目の時給は${a[1]}円です。")
    println("3年目の時給は${a[2]}円です。")

    for (money in a) {
        println("時給は${money}円です。")

    }
    for ((index, money) in a.withIndex()) {
        println("${index+1}年目の時給${money}円です。")
    }
    println("---17.e3")
    val a3 = listOf<Boolean>(true,false,true)
    val a4 = listOf<Byte>(2,4,8)
    val a5 = listOf<Short>(100,101,102)
    val a6 = listOf<Int>(1000,1200,1500)
    val a7 = listOf<Long>(1000000L,120000L,150000L)
    val a8 = listOf<Float>(1.0f,1.1f,1.2f)
    val a9 = listOf<Double>(1.0,10.0,100.0)
    val a10 = listOf<String>("こんにちは","Kotlin","よろしく")
    println("---17.7---")
    val a1: MutableList<String> = mutableListOf("こんにちは","Kotlin","よろしく")
    a1.add("どうぞ")
    a1.add("お願いします")
    for((i,x) in a1.withIndex())  {
        println("${i} : ${x}")
    }
    println("---17.8---")
    val a100 : MutableList<String> = mutableListOf("こんにちは","Kotlin","よろしく")
    a100.add(2,"どうぞ")
    a100.add(0,"はじめまして!")
    for((i,x) in a100.withIndex()) {
        println("${i} : ${x}")
    }
    println("---17.9---")
    val a300 = mutableListOf("こんにちは","Kotlin","どうぞ","よろしく")

    a300.removeAt(2)
    for((i,x)in a300.withIndex()) {
        println("${i} : ${x}")
    }

}