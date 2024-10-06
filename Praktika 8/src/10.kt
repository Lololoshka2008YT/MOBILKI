fun main()
{
    println("Введите число повторений ")
    val n= readln().toInt()
    println("Введите строку ")
    val txt= readln()
    println(stroka(txt,n))
}
fun stroka(txt:String,n:Int,):String
{
    return if (n <= 0)
    {
      ""
    }
    else {
        txt + stroka(txt, n - 1)
    }
}
