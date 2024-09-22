fun main(){
    print("Введите оценку ")
    val ocenka = readln().toInt()
    when (ocenka) {
        1-> println("Кол")
        2-> println("Двойка")
        3-> println("Тройка")
        4-> println("Четвёрка")
        5-> println("Пятёрка")
        else-> println("Пятёрка - максимальный балл")
    }
}