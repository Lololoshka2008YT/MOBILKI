fun main()
{
    println("Введите сколько денег: ")
    val b= readln().toDouble()
    println("Введите валюту и валюту в которую хотите перевести с маленькой буквы: ")
    val a= readln()
    when(a)
    {
        "доллар в рубли"-> println("$b$ = ${b*95.67} RUB")
        "рубли в доллар"-> println("$b RUB = ${b*0.010}$")
        "евро в рубли"-> println("$b EUR = ${b*105.01} RUB")
        "рубли в евро"-> println("$b RUB = ${b*0.0095} EUR")
        "евро в доллар"-> println("$b EUR = ${b*1.10}$")
        "доллар в евро"-> println("$b$ = ${b*0.91} EUR")
    }
}