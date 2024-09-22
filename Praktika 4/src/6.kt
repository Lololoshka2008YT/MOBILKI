fun main()
{
    println("Угадайте число ")
    val num= readln().toInt()
    when(num)
    {
        1488-> println("Вы угадали")
        else-> println("Вы не угадали")
    }
}