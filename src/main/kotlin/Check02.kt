import kotlin.random.Random
import kotlin.random.nextUInt

fun main(args: Array<String>) {
    print("1:グー　2:チョキ　3:パー　を選んでください")
    //　入力は１，２，３ですが、０，１，２となるよう工夫してください↓
    val player = readln().toInt() -1


    // CPUの手をランダムで決める
    val cpu = Random.nextInt(0,3) // ０，１，２のどれかになる

    // 勝敗判定
//    val judge = when {
//        player == cpu
//        -> "あいこ"
//
//        player == 0 && cpu == 1 || player == 1 && cpu == 2 || player == 2 && cpu == 0
//        -> "かち"
//
//        player == 0 && cpu == 2 || player == 1 && cpu == 0 || player == 2 && cpu == 1
//        -> "まけ"
//
//        else -> "エラー"

   val diff = (player - cpu + 3) % 3
   val judgg = when(diff){
       0 ->"あいこ"
       1 -> "負け"
       2 -> "勝ち"
       else -> "?"
    }
    println(judgg)
    //  勝敗の結果表示
    //    勝ち
    //    負け
    //    あいこ

}
