fun main()
{
    println("Введите первое число: ")
    val a= readln().toInt()
    println("Введите второе число: ")
    val b= readln().toInt()
    println(debik(a,b))
}
fun debik(a:Int,b:Int):Boolean
{
    return a+b<100
}