fun main() {
    val likes = 11
    val people = "Понравилось $likes людям"
    val humans = "Понравилось $likes человеку"


    val correctAnswer = if (likes == 1 || likes % 10 == 1 && likes > 20) humans else people

    println(correctAnswer)
}