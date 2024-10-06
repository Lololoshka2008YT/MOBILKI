fun main()
{
    println("Введите N: ")
    val n= readln().toInt()
    println("Сумма от 1 до $n равна ${SUMMA1(n)}")
}
fun SUMMA1(N: Int): Int = (1..N).sum()