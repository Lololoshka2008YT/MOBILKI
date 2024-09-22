fun main()
{
    println("Введите большее и меньшее числа")
    val x=readln().toInt()
    val y=readln().toInt()
    val ost=x%y
    if(x%y== 0)
        println("$x делится без остатка на $y")
    else println("Не делится без остатка. Остаток $ost")


}