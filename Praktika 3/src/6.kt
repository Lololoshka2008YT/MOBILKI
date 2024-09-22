fun main(){
    println("Введите год ")
    val year = readln().toInt()
    if ((year % 400 == 0) or ((year % 100 != 0) and (year % 4 == 0)))
        println("Год високосный")
    else
        println("Год не високосный")
}