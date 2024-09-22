fun main()
{
    println("Введите стороны треугольника ")
    val x=readln().toInt()
    val y=readln().toInt()
    val z=readln().toInt()
    val a = when
    {
        x==y && y==z-> "равносторонний"
        x == y || y == z || y == z -> "равнобедренный"
        else-> "разносторонний"

    }
    println("Треугольник $a")
}