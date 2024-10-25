import kotlin.random.Random
fun main() {
    val ranlist: MutableList<Int> = mutableListOf()
    for (i in 1..10) {
        val rannum = Random.nextInt(1,100)
        ranlist.add(rannum)
    }
    println("Исходный список: $ranlist")
    val ireplace = ranlist.indexOf(20)
    if (ireplace != -1) {
        ranlist[ireplace] = 200
        println("Число 20 изменено на 200")
        println("Обновленный список: $ranlist")
    }
    else{
        println("Число 20 не найдено")
    }
}
