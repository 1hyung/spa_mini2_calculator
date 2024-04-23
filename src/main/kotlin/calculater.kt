package org.example

fun main() {
    //Int, Double는 숫자라 !! 필요, String은 문자라서 !! 필요 없음
    //친절함 +1
    println("첫번째 값은?")
    var num1 = readLine()!!.toDouble()
    println("골라골라 +, -, *, /, %")
    var operator = readLine().toString()
    println("두번째 값은?")
    var num2 = readLine()!!.toDouble()
    //Int로 하면 소수점 계산하려면 Double
//lv2
    if (operator == "+") {
        println("${num1 + num2}")
        //${ }이 뭐지
        // 덧셈일 때
    } else if (operator == "-") {
        // 뺄셈일 때
        println("${num1 - num2}")
    } else if (operator == "*") {
        // 곱셈일 때
        println("${num1 * num2}")
    } else if (operator == "/") {
        // 나눗셈일 때
        println("${num1 / num2}")
    } else if (operator == "%") {
        // 나머지연산일 때
        println("${num1 % num2}")
    } else {
        // 잘못된 연산자 일 때
        println("잘못된 연산입니다.")
    }
    //자동실행이 됐으면 좋겠다!!
}