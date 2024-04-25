/*
fun main() {
    val student1Score = 95
    val student2Score = 27
    val student3Score = 88

    val student1Rank = checkRank(student1Score)
    val student2Rank = checkRank(student2Score)
    val student3Rank = checkRank(student3Score)

    println("학생 1의 등급은: ${student1Rank}")
    println("학생 2의 등급은: ${student2Rank}")
    println("학생 3의 등급은: ${student3Rank}")
}

fun checkRank(score: Int): String {
    return when (score) {
        in 90..100 -> return "A"
        in 80..89 -> return "B"
        in 70..79 -> return "C"
        else -> return "D"
    }
}
//    Kotlin 컨벤션을 따르지 않은 형태
//    if(score >= 90) {
//        return "A"
//    } else if(score >= 80) {
//        return "B"
//    } else if(score >= 70) {
//        return "C"
//    } else {
//        return "D"
//    }
// }*/
fun main(){ // 변수를 만들 때는 var
    //Int형이 들어갈 수 있는 MutableList <타입>을 알려줌, 1,2,3이 들어간 mutableList가 하나 만들어짐
    var mutableList: MutableList<Int> = mutableListOf(1,2,3)

    println(mutableList)
    // 두번째 있는 값에 접근하고 싶다면 []안에 숫자 1 입력, [] 안의 index는 0부터 시작
    println(mutableList[1])
}