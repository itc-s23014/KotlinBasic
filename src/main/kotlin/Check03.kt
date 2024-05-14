import kotlin.random.Random

fun main(args: Array<String>) {
    //勝ちが一割、負けが８．５割、あいこが０．５割となる
    //cpuを実装したじゃんけんを作ってください

    print("1:グー　2:チョキ　3:パーを選んでください:")

    val player = readln().toInt() -1

    val result = when (Random.nextInt(0,100)) {
        in 0 .. 10 -> 1
        in 10 .. 15 -> 2
        else -> 3

    }
    val cpu =( player + result )  % 3

    val judge = when(result) {
        0 -> "あいこ"
        1 -> "勝ち"
        else -> "負け"
    }

    println("cpu : ${cpu + 1} --- $judge")
}