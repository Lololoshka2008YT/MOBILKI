fun main()
{
    println("Введите два вещественных числа ")
    val x= readln().toDouble()
    val y= readln().toDouble()
    if(x>y)
        println("$x больше $y")
    else print("$y больше $x")
    if(x<y)
        println(" \n$x меньше $y")
    else print(" \n$y меньше $x")
}