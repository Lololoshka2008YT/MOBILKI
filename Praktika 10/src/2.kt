fun main()
{
    println("Введите строку: ")
    val a= readln()
    val glas=a.filter {it in "АОУЫЭЕЁИЮЯаоуыэеёиюя" }.length
    val sogl=a.filter { it in "БВГДЖЗЙКЛМНПРСТФЧЦЧШЩбвгджзйклмнпрстфхцчшщ" }.length
    println("В строке $a: $glas гласных и $sogl согласных")
}
