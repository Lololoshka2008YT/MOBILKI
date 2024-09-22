fun main()
{
    println("Введите стороны треугольника ")
    val x=readln().toInt()
    val y=readln().toInt()
    val z=readln().toInt()
    if((x>y+z) or (y>x+z) or (z>x+y))
        println("Такой треугольник не существует")
    else println("Такой треугольник существует")
}