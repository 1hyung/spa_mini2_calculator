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

/*//리스트 안의 숫자 접근 방법
fun main(){ // 변수를 만들 때는 var
    //Int형이 들어갈 수 있는 MutableList <타입>을 알려줌, 1,2,3이 들어간 mutableList가 하나 만들어짐
    var mutableList: MutableList<Int> = mutableListOf(1,2,3)

    println(mutableList)
    // 두번째 있는 값에 접근하고 싶다면 []안에 숫자 1 입력, [] 안의 index는 0부터 시작
    println(mutableList[1])
}*/

/*
fun main(){ //
    var mutableList: MutableList<Int> = mutableListOf(1,2,3)
//MutableList에 추가하는 방법
    mutableList.add(5)
    //MutableList에 요소를 지우는 방법
    mutableList.remove(1)

    println(mutableList)
}*/

/*
fun main() { //key의 형태는 string이다. value의 형태는 int다.
    val fruitCounts: MutableMap<String, Int> = mutableMapOf("apple" to 5, "banana" to 3, "orange" to 8)
    // apple이란 변수 만들고 5 넣고, banana라는 변수 만들고 3 넣고 orange라는 변수 넣고 8 넣고 변수를 각각 넣을 수 있지만 하나의 변수로
    //묶은 것이 바로 map, map도 값을 추가하고, 삭제하고, 수정하고 가능
    println(fruitCounts)
    //map 조회하기
    println(fruitCounts["apple"])
    //추가 lemon이라는 key로 값을 넣은 것이다.
    fruitCounts["lemon"] = 12
    println(fruitCounts)
    //지우기
    fruitCounts.remove("banana")
    println(fruitCounts)

    val appleCount = fruitCounts["apple"]  // 5
}*/

/*
fun main() { //람다 표현식{a와 b를 받아서 -> 곱한 값을 반환하는 함수}을 multiply라는 변수에 넣는다.
    //형태는 int 값 2개를 받아서 int를 반환하는 이름 없는 함수가 multifly라는 변수 안에 들어간다.
    //람다 표현식은 { }가 끝 이 안에 함수가 동작해야하는 것들을 써줄 것임. 받을 값 두개 a, b 입력, 매개변수에 타입 입력해줘도 됨!
    //함수 만들 때 매개변수 사용한 것이랑 같음, 함수의 본문을 쓰기 위해 ->
    //a, b 값 2개를 받아서 *한 다음 반환 하는 함수가 만들어 진 것
    val multiply: (a: Int, b: Int) -> Int = { a, b -> a * b }
    println(multiply(3, 4))

    val result = multiply(5, 3) // 결과: 15
    println(result)


    val numbers = listOf(1, 2, 3, 4, 5)
// forEach는 컬렉션의 각 요소에 대해 주어진 람다 표현식을 실행합니다.
    //forEach 고차함수 람다 표현식 하나를 받아야 함
    //value 하나를 받아서 출력하는 람다표현식 그것을 forEach에게 전달하는 예제 코드
//1
    val printFunction: (Int) -> Unit = { value -> println(value) }
    numbers.forEach { printFunction }
//2
    numbers.forEach { value -> println(value) }
    //3 기본적으로 it이라는 이름으로 받아오기 때문에 똑같은 과정이 시작됨
    numbers.forEach { println(it) }
//forEach는 람다표현식을 받아야 하는 고차함수고 여러방식 람다표현식을 만든 다음에 전달해줘서 리스트에 forEach 반복문을 썼다.
}
*/
/*
//collection 변화
fun main() {
    val list = listOf("apple", "banana", "orange")
    println(list)

    val mapFromList = list.associateWith { it.length }
    println(mapFromList)

    val map = mapOf("apple" to 5, "banana" to 3, "orange" to 8)
    println(map)

    val listFromMap = map.toList()
    println(listFromMap)
}*/


/*
//고차함수 활용
fun main() {
    val people = listOf(
        mapOf("name" to "김르탄", "age" to 27),
        mapOf("name" to "이스파", "age" to 18),
        mapOf("name" to "최개발", "age" to 54),
        mapOf("name" to "박코딩", "age" to 32),
    )
//    println(people[1])
    //→ [{name=김르탄, age=27}, {name=이스파, age=18}, {name=최개발, age=54}, {name=박코딩, age=32}]
   // []리스트 안에 {} 맵이 들어있음! 맵을 모아서 리스트 1개 만들었다!

    //map 하나하나 따로 출력하고 싶음
    //v1.
    for (person in people) {
        println(person)
    }
//v2. List 고차함수 사용, 람다 표현식
    people.forEach { println(it) }

    //v3.나이를 가져온다. filter라는 고차함수도 people에서 하나씩 아이템을 하나씩 때운다. 김르탄, 아스퍼 등등
    people.filter {
        val age = it["age"] as Int
        age < 30
    }
    //v4. 다시 필터한테 전달 됨, 고차함수 안의 람다표현식의 마지막에 써준 값은 람다표현식의 반항값으로 처리됨.
    //값을 계산해서 filter에게 true or false로 전달. filter라는 값은 true를 받으면 남기고 false를 받으면 없애버림
    // filter를 통해 걸러주고 forEach를 통해 남은거만 출력한 것
    people.filter {
        val age = it["age"]
        if (age is Int) {
            age < 30
        } else {
            false
        }
    }.forEach { println(it) }
}*/
/*
//nullable type
fun main() {
    val nullableString1: String? = "this is nullalble string"

    if (nullableString1 != null) {
        println(nullableString1.length)
    }

    val nullableString2: String? = null

    println((nullableString2 ?: "").length)

    val nullableString3: String? = "this is nullalble string"

    nullableString3?.let {
        println(it.length)
    }
}
*//**/

// exception 예시
fun main() {
    val result = divide(10, 0)
    println(result)
}

fun divide(a: Int, b: Int): Int {
    return a / b
}