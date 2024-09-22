fun main(){
    print("Введите страну ")
    val nuts= readln()
    when (nuts) {
        "США" -> println("Америкосы")
        "Россия" -> println("Русские")
        "Япония" -> println("Японцы")
        "Таджикистан" -> println("Таджики")
        "Армения"->println("Армяне!!!!")
        "Израиль"->println("Евреи")
        else->println("Нет такой страны")
    }
}