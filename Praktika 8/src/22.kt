fun main()
{
    println("Напишите слово с маленькой буквы: ")
    val a= readln()
    println(Palidr(a))
}
fun Palidr(a:String):Boolean
{
    if(a==a.reversed())
    {
        return true
    }
    else return false
}