fun main()
{
    println("Введите строку: ")
    val a= readln()
    println("Строка наоборот: ${NAOB(a)}")
}
fun NAOB(a:String):String=a.reversed()