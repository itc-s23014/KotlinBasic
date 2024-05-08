package org.example

fun main(args: Array<String>) {
    val a: Char = 'え'
    val b: Char = 'び'
    val c: Char = 'し'
    println(a)
    println(b)
    println(c)
    println("----5.5----")
    val a5 = "こんにちは"
    val b5 = "世界！"
    val message5 = a5 + b5
    println(message5)
    println("こんにちは$b5")
    println("---5.8---")
    val h = 8
    val message = "本日働いた時間は,${h}hours"
    val message2 = "このペースで１ヶ月毎日働くと、,${h* 30}hours の労働になります"
    val message3 = "このペースで１年間働くと、${h*365}hours の労働になります"
    println(message)
    println(message2)
    println(message3)
    println("---5.9---")
    val messages = """|
        |こんにちは、世界！
        |私は、Kotlinに関して勉強しています。
        |Kotlinでは、とても簡潔なプログラムを書くことができます。
        |皆さん、一緒に楽しくプログラミングしましょう！
        """.trimMargin()
    println(messages)
    val message13 = """
        こんにちは、世界！
        私は、Kotlinに関して勉強しています。
        Kotlinでは、とても簡潔なプログラムを書くことができます。
        みなさん、一緒に楽しくプログラミングしましょう。
       """.trimIndent()
    println(message13)


}