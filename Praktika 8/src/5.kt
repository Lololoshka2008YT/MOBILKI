fun main()
{
    println("Введите prob: ")
    val prob= readln().toInt()
    println("Введите prize: ")
    val prize= readln().toInt()
    println("Введите pay: ")
    val pay= readln().toInt()
    println(daun2(prob,prize,pay))
}
fun daun2(prob:Int,prize:Int,pay:Int):Boolean
{
    return prob*prize>pay
}