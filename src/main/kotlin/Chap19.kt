fun main(args: Array<String>) {
    println("---19.1---")
    val map: Map<String,String> = mapOf("Pen" to "ペン","Apple" to "アップル", "Pineapple" to "パイナップル")

    val value1 = map["Pen"]
    val value2 = map["Pineapple"]
    val value3 = map["Apple"]
    val value4 = map["Pen"]
    println("${value1},${value2},${value3},${value4}")
    println("---19.2---")
    val map1: Map<Char,Int> = mapOf('a' to 1,'b' to 2,'c' to 3, 'z' to 26)
    println(map1['a'])
    println(map1['b'])
    println(map1['c'])
    println(map1['z'])
    println("----19.4---")
    val map2: MutableMap<String,String> = mutableMapOf("Pen" to "ペン")
    map2.put("Apple","アップル")
    map2+= "Pineapple" to "パイナップル"
    val value12 = map2["Pen"]
    val value22 = map2["Pineapple"]
    val value32 = map2["Apple"]
    val value42 = map2["Pen"]
    println("${value12},${value22},${value32},${value42}")
    println("---19.2---")
    run {
        val map2: MutableMap<String,String> = mutableMapOf("Pen" to "ペン")
        map2.put("Apple","アップル")
        map2+= "Pineapple" to "パイナップル"
        map2 -= "Pen"

        val value12 = map2["Pen"]
        val value22 = map2["Pineapple"]
        val value32 = map2["Apple"]
        val value42 = map2["Pen"]
        println("${value12},${value22},${value32},${value42}")
    }
}