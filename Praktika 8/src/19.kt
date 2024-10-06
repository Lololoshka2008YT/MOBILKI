fun main()
{
    println("Введите числа, разделенные пробелом:")
    val input = readLine() ?: ""
    val a = input.split(" ").map { it.toInt() }.toTypedArray()
    println("Сумма: ${Sum(a)}")
}
fun Sum(a:Array<Int>):Int
{
    return a.sum()
}