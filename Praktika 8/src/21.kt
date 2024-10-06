fun main()
{
    println("Введите числа, разделенные пробелом:")
    val input = readLine() ?: ""
    val a = input.split(" ").map { it.toInt() }.toTypedArray()
    println(Sort(a).joinToString(" "))
}
fun Sort(a:Array<Int>):Array<Int>
{
    return a.sortedArray()
}