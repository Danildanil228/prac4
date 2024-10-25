import kotlin.random.Random
fun main() {
    val ranlist1: List<Int> = List(10000) { Random.nextInt(1, 100) }
    val ranlist2: List<Int> = List(10000) { Random.nextInt(1, 100) }
    val numbers: MutableList<Int> = mutableListOf()
    for (i in ranlist1) {
        if (ranlist2.contains(i)) {
            numbers.add(i)
        }
    }
    numbers.sort()
    println("Первый список: $ranlist1")
    println("Второй список: $ranlist2")
    if (numbers.size != 0) {
        println("Совпадения: $numbers")
    }
    else {
        println("Совпадений нет")
    }
}