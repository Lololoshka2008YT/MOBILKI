fun main(){
    print("Введите количество натуральных чисел: ")
    val n = readln().toInt()
    print("Список: ${Bee(n)}")
}

fun Bee(n: Int) : List<Any>{
    val slova = mutableListOf<Any>()
    for(i in 1..n)
    {
        when{
            i % 3 ==0 && i%5==0->slova.add("ВизллБизлл")
            i % 3==0->slova.add("Физллл")
            i % 5==0 -> slova.add("Бизллл")
            else -> slova.add(i)
        }
    }
    return slova
}