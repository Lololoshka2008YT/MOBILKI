
fun main() {
    println("Введите строку: ")
    val a = readln().toCharArray()
    for(i in 0..a.size - 1){
        if (a[i].isUpperCase()) a[i] = a[i].lowercaseChar()
        else a[i] = a[i].uppercaseChar()
    }
    println(a)
}