fun main(args: Array<String>){
    //val startValue = 2 //seems like a final
    //startValue++
    //var startValue2 = 33 //regular var
    //startValue2++
    /*val perfectSquares = Array(10, { k -> k * startValue2 })
    for (i in perfectSquares){
        println(i)
    }*/
    //println(perfectSquares)

    // val oneToNine = 1..9
    //val list = listOf(1, 2, 3, 4)

    //var x = null

    //var x = "Any"
    //var x1 = "Nothing"
    var x1 = "Hello"
    var y1 = "World"

    var result = when(x1 to y1){
        "Hello" to "World" -> "$x1 $y1"
        else -> false
    }

    println(result)
}