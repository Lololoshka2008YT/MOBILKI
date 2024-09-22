fun main()
{
    print("Введите число: ")
    val num=readln().toDouble()
    println("Введите степень: ")
    val step=readln().toDouble()
    val result=Math.pow(num,step)
    println("Число $num в степени $step равно $result")
}