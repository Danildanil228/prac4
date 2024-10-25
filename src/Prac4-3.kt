fun main() {
    val iString = "pythonist"
    val count: MutableMap<Char, Int> = mutableMapOf()
    for (char in iString) {
        count[char] = count.getOrDefault(char, 0) + 1
    }
    println("Словарь с количеством вхождений каждой буквы: $count")
}