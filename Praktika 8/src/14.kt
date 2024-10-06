fun main()
{
    println("Первое число ")
    val a= readln().toInt()
    println("Второе число ")
    val b= readln().toInt()
    println(SUMMA(a,b))
}
fun SUMMA(a:Int,b:Int):Int
{
    return a+b
}