fun main() {
    print("Введите четырёхзначное число ")
    val number = readln().toInt()
    val thousands = number / 1000
    val hundreds = (number / 100) % 10
    val tens = (number / 10) % 10
    val units = number % 10

    if (thousands + hundreds == tens + units)
        println("Сумма цифр $thousands и $hundreds равна сумме $tens и $units")

    else
        println("Сумма цифр $thousands и $hundreds не равна сумме $tens и $units")

    if ((thousands + hundreds + tens + units) % 3 == 0)
        println("Сумма цифр кратна 3")

    else
        println("Сумма цифр не кратна 3")

    if ((thousands * hundreds * tens * units) % 4 == 0)
        println("Произведение цифр кратно 4")

    else
        println("Произведение цифр не кратно 4")

    if ((thousands * hundreds * tens * units) % thousands == 0)
        println("Произведение цифр кратно $thousands")

    else
        println("Произведение цифр не кратно $thousands")

}