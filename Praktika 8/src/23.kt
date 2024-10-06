fun main()
{
    println("Введите строку: ")
    val a= readln()
    println("Символов в строке: ${Simvol(a)}")
}
fun Simvol(a:String):Int
{
    return a.count()
}