fun main(args: Array<String>) {
    val a: IntRange = 0..6
    val b: IntRange = 7..12
    val c: IntRange = 13..15
    println(a)
    println(b)
    println(c)

    val age2: Int = 10

    val range1: IntRange = 0..6
    val range2: IntRange = 7..12
    val range3: IntRange = 13..15

    val flag21 = age2 in range1
    val flag22 = age2 in range2
    val flag23 = age2 in range3

    println("${age2}歳の子供は就学前 ${flag21}")
    println("${age2}歳の年齢は小学生 ${flag22}")
    println("${age2}歳の子供は中学生 ${flag23}")

    println("---not verion")

    val flag31 = age2 !in range1
    val flag32 = age2 !in range2
    val flag33 = age2 !in range3

    println("${age2}歳の子供は就学前 ${flag31}")
    println("${age2}歳の年齢は小学生 ${flag32}")
    println("${age2}歳の子供は中学生 ${flag33}")

    val rangeA: LongRange = 0..10000000000L
    val rangeB: CharRange = 'A'..'E'
    val rangeC: CharRange = 'あ'..'お'

    val flag_a = 500 in rangeA
    val flag_b = 'D' in rangeB
    val flag_c = 'え' in rangeC

    println("flag_a == ${flag_a}")
    println("flag_b == ${flag_b}")
    println("flag_c == ${flag_c}")

    println("---10.a---")
    val rangeD: IntRange = 0 until 6
    val rangeE: IntRange = 0 ..<6
    println(rangeD)
    println(rangeE)
}