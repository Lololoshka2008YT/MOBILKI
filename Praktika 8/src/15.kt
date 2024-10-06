fun main()
{
    println("Первое число ")
    val a= readln().toInt()
    println("Второе число ")
    val b= readln().toInt()
    println(Srav(a,b))
}
fun Srav(a:Int,b:Int):Int
{
    return if(a<b)
    {
        b
    }
    else{
        a
    }
}