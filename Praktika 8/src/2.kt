fun main(){
        println("Введите несколько чисел, разделенных пробелами:")
        val input = readln()
        val numbers = input.split(" ").map { it.toInt() }
        val result = raz(numbers)
        println("Разность максимального и минимального равна: $result")
    }
fun raz(numbers:List <Int>):Int
{
    var razn=0
    val min=numbers.min()
    val max=numbers.max()
    for(number in numbers)
    {
        razn=max-min
    }
    return razn
}
