fun main()
{
    println("Введите число: ")
    val a= readln().toInt()
    println(debik2(a))
}
fun debik2(a:Int):Boolean
{
    return a%100==0
}