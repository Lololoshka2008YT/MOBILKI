fun main()
{
    println("Введите расстоянние в километрах ")
    val km=readln().toInt()
    println("Введите расстоянние в футах ")
    var fut=readln().toDouble()
    fut=fut*0.305/1000
    if(km>fut)
        println("Расстояние в километрах больше, чем в футах")
    else println("Расстояние в футах больше, чем в километрах")
}