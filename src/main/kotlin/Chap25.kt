package com.example.chap25

fun main(args: Array<String>) {
    run {
        println("---25.2---")
        val p = Person2("タケシ",5)
        p.greet()
    }
    run {
        println("---25.5---")
        val p = Person2(name = "タケシ",age = 5)

    }
    run {
        println("---25.6---")
        val p = Person2(age = 5, name = "タケシ")
    }
    run {
        println("---25.6.1---")
        val p = Person2(name = "タケシ")
    }
    run {
        println("---25.6.2---")
        val p = Person2(age = 5)
    }
    run {
        println("---25.7---")
        val p1 = Person3()
        val p2 = Person3(name = "タケシ")
        val p3 = Person3(age = 7)
        p1.greet()
        p2.greet()
        p3.greet()

    }
    run {
        val p1 = Person8("タケシ",7)
        val p2 = Person8(name = "タケシ",age = 7)
        val p3 = Person8(age = 8,name ="タケシ")
        p1.greet()
        p2.greet()
        p3.greet()


    }
    run {
        val p1 = Person9("タケシ",7)
    }
}
    class Person2 (val name: String = "",var age: Int = 0) {
        fun greet() {
            println("${name}です。　${age}歳です。")
    }
    }
    class Person3 (val name: String = "名無しさん",var age: Int = 20) {
        fun greet() {
            println("${name}です。${age}歳です。")
        }
    }
    class Person8(val name:String ,var age: Int) {
        fun greet() {
            println("${name}です。${age}歳です。")
        }
    }
    class Person9(val name: String, var age: Int) {
        init {
            println("コンストラクタのイニシャライズが呼ばれました。")
            greet()

        }
        fun greet(){
            println("${name}です。${age}歳です。")
        }
    }
