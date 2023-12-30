fun main() {
    val likes = 511
    val people = "Понравилось $likes людям"
    val humans = "Понравилось $likes человеку"


    val correctAnswer = if (likes % 10 == 1 && likes % 100 != 11) humans else people

    println(correctAnswer)
}