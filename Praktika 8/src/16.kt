fun main()
{
    println("Введите число")
    val a= readln().toInt()
    println(maga(a))
}
fun maga(a:Int):Boolean
{
    return a%2==0
}