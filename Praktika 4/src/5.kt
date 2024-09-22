
fun main(){
    print("Введите число ")
    val num= readln().toInt()
    when(num)
    {
        in 1..99999999->println("Число положительное")
        in -99999999..-1->println("Число отрицательное")
        else->println("Ноль")
    }


}
