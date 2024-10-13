
fun main() {
    val n = readln().toInt()
    val a = if (n == 0) IntArray(0) else IntArray(n) { it + 1 }
    println(a.reversed().joinToString(" "))
}