/*
package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main1() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
}

// 어디 있든지 main에서 시작함
fun main() {
    val dataNumber = readLine()!!.toInt()
    val sum = dataNumber + 3
    println("입력은 ${dataNumber}인데 3을 더해서 ${sum}이예요!")
}*/
//fun main() {
//    if (false) {
//        println("if문 안에 들어왔어요")
//    }
//}
fun main() {

    /*    val value = 123

        when (value) {
            3 -> {
                println("값이 3입니다")
            }

            5 -> {
                println("값이 5입니다")
            }

            else -> {
                println("값이 3과 5가 아닙니다")
            }
        }*/
    /*//특정 이름을 가진 사람일때 축하메시지를 띄워줘요
        var eventName = "참새"
        var myName = "참새"

        if (myName == eventName) {
            println("환영합니다 ${myName}님! 이벤트에 당첨됐어요!")
        } else {
            println("환영합니다 ${myName}님!")
        }*/

    /*
        //티켓 100개가 전부 매진되면 더 이상 구매할 수 없다고 알림창을 띄워줘요의 예시입니다.

        var ticketCount = 0

        if (ticketCount > 0) {
            println("티켓을 구매했어요")
        } else {
            println("티켓이 모두 매진되었습니다")
        }
    */
    /*    //기말고사 평균점수 등급 나누기

        val koreanScore = readLine()!!.toInt()
        val englishScore = readLine()!!.toInt()
        val mathScore = readLine()!!.toInt()

        val average = (koreanScore + englishScore + mathScore) / 3

        if (average >= 90) {
            println("당신의 등급은 A입니다.")
        } else if (average >= 80) {
            println("당신의 등급은 B입니다.")
        } else if (average >= 70) {
            println("당신의 등급은 C입니다.")
        } else {
            println("당신의 등급은 F입니다.")
        }*/


    /*    //행운의 숫자를 뽑아 운세를 알려주기
        var todayNumber = readLine()!!.toInt()

        when (todayNumber) {
            1 -> {
                println("재물이 들어올것입니다")
            }

            2 -> {
                println("검정색을 조심하세요")
            }

            3 -> {
                println("지인과의 관계에 조심하세요")
            }

            else -> {
                println("물을 조심하십시오...")
            }
        }*/
    /*//조건식에서 값을 반환하기
        val age = 25

        val isAdult = if (age >= 19) {
            true
        } else {
            false
        }*/

/*    // for의 구조 코틀린의 for 반복문은 다양한 형태가 존재합니다.

// 리스트(묶음)에서 하나의 요소들을 반복해서 가져오는 경우입니다
    for (요소 in 리스트) {
        소스코드(로직)
    }

// 숫자의 범위를 기준으로 반복하는 경우입니다
// 시작값이 0이고, 마지막값이 5라면 인덱스는 0,1,2,3,4이므로 총 5번 반복해요
// until을 생략해서 시작값..마지막값으로 사용할수도 있어요
    for (인덱스 in 시작값 until 마지막값) {
        소스코드(로직)
    }*/

    //내 이름을 10번 출력해요 (for)의 예시입니다

// 1부터 10까지 변화하는 i변수
            for(i in 1..10) {
                println("${i}번째: 내 이름은 참새")
            }

    var i = 0

    while(i <= 10) {
        println("${i}번째: 내 이름은 참새")
        i++
    }
}
