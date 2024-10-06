fun main()
{
    println("Введите строку ")
    val a= readln()
    println("Длина строки равна ${size(a)}")
}
fun size(a:String):Int
{
    return a.length
}