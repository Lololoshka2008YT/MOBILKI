fun main()
{
   val a= readln().toInt()
    println(prostata(a))
}
fun prostata(a:Int):Boolean {
    if (a <= 1) return false
    for (i in 2 until a) {
        if (a % i == 0) {
            return false
        }
    }
    return true
}