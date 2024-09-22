fun main()
{
    println("Введите делитель ")
    val a= readln().toInt()
    println("Введите делимое ")
    val b= readln().toInt()
    if(b%a==0)
        println("Число $a является делителем числа $b")
    else println("Число $a НЕ является делителем числа $b")
}