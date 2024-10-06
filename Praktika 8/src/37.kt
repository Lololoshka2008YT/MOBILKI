fun main()
{
    println("Введите число")
    val a= readln().toInt()
    println(Tabl(a))
}
fun Tabl(a:Int)
{
    for(i in 1..10)
    {
        println("$a * $i = ${a * i}")
    }
}