fun main()
{
    val a= readln().toInt()
    println(factorial(a))
}
fun factorial(a:Int):Int
{
    return if(a<=0)
    {
        1
    }
    else
    {
        a*factorial(a-1)
    }
}