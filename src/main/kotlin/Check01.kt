fun main(args: Array<String>) {
    val score = readln().toInt()

    val socorehantei =when(score) {
        in 0..59 -> "D"
        in 60..69 -> "C"
        in 70..79 -> "B"
        in 80..89 -> "A"
        in 90..100 -> "S"
        else -> "エラー"
    }
    println(socorehantei)
}