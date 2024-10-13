fun main() {
    println("Введите высоту пирамиды: ")
    val n = readln().toInt()
    println(generatePyramid(n))
}

fun generatePyramid(n: Int): String {
    var pyramid = ""
    for (i in 1..n) {
        val space = " ".repeat((n - i) * 2)
        val reshotka = "#".repeat(i * 2 - 1)
        pyramid += "$space$reshotka$space\n" 
    }
    return pyramid
}