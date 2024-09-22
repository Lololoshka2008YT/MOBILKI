fun main() {
    val a = true
    val b = false
    val c = false
    println("A = $a\nB = $b\nC = $c")
    println("А или не (А и В) или С = ${a or !(a and b) or c}")
    println("не А или А и (В или С) = ${!a or a and (b or c)}")
    println("(А или В и не С) и С = ${(a or b and !c) and c}")
}
