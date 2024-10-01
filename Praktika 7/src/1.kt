fun main()
{
    println("Введите действие(+,-,*,/) ")
    val n= readln()
    println("Введите первое число: ")
    val num1= readln().toInt()
    println("Введите второрн число: ")
    val num2= readln().toInt()
    when(n)
    {
        "+"-> println("$num1 + $num2 = ${num1+num2}")
        "-"->println("$num1 - $num2 = ${num1-num2}")
        "*"-> println("$num1 * $num2 = ${num1*num2}")
        "/"-> println("$num1 / $num2 = ${num1/num2}")
    }
}
