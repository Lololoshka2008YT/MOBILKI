fun main(){
    print("Введите код ошибки ")
    val error= readln().toInt()
    when (error) {
        100 -> println("Ошибка сети")
        0->println("Ошибка стоп 0000000")
        200 -> println("Ошибка в коде")
        404 -> println("Не найдены данные")
        14->println("Ошибка природы")
        88->println("Ошибка прикола")
        else->println("Нет информации об этой ошибке")
    }
}