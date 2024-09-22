fun main()
{
    print("Введите числа m и n")
    val m=readln().toInt()
    val n=readln().toInt()
    val x=m/n
    if(m%n==0)
        println("Частное от деления равно $x")
    else println("m на n нацело не делится")

}