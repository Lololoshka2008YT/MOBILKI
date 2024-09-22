fun main()
{
    print("Введите трёхзначное число: ")
    val num = readln().toInt()
    val number=num
    val x=number/10
    val y=number%10
    val z=x+y
    val f=x*y
    println("Число десятков в числе:$x")
    println("Число единиц в числе:$y")
    println("Сумма цифр числа:$z")
    println("Произведение цифр числа:$f")

}