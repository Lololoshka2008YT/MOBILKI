fun main()
{
    println("Введите число повторений ")
    val n= readln().toInt()
    println(Google(n))
}
fun Google(n:Int):String
{
    return "G"+"o".repeat(n)+"gle"
}
