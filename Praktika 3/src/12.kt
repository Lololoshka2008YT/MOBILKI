fun main(){
    println("Введите двузначное число ")
    val x = readln().toInt()

    if ((x/10) > (x%10))
        println("Первая цифра больше")
    else if ((x/10) < (x%10))
        println("Вторая цифра больше")
    else println("Цифры одинаковые")
}
