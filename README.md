# Kotlin 문법 기초 과제 - 계산기


## 기능 요구사항


  > 💡 Goal : 나만의 계산기 만들기
  >
  > - 지금까지 배운 Kotlin 문법을 응용해서 나만의 계산기를 만들어봅니다.
  > - 아래 Lv1 ~ Lv3까지 기본 구현, Lv4는 추가로 만들어봅니다.
  > - 강의자료 기준 1~3주차를 학습하면 계산기를 만들 수 있습니다.
  >

```
 ⚙ features : 필수 구현 기능

- [ ]  Lv1  
    - [ ]  더하기, 빼기, 나누기, 곱하기 연산을 수행할 수 있는 Calculator 클래스를 만들기
    - [ ]  생성한 클래스를 이용하여 연산을 진행하고 출력하기

- [ ]  Lv2
    - [ ]  Lv1에서 만든 Calculator 클래스에 “나머지 연산”이 가능하도록 코드를 추가하고, 연산 진행 후 출력
    - [ ]  ex) 나머지 연산 예시 : 6을 3으로 나눈 나머지는 0 / 5를 3으로 나눈 나머지는 2

        - [ ]  Lv3
    - [ ]  아래 각각 클래스들을 만들고 클래스간의 관계를 고려하여 Calculator 클래스와 관계 맺기
        - [ ]  AddOperation(더하기)
        - [ ]  SubstractOperation(빼기)
        - [ ]  MultiplyOperation(곱하기)
        - [ ]  DivideOperation(나누기)
        - [ ]  관계를 맺은 후 필요하다면 Calculator 클래스의 내부코드를 변경
    - [ ]  `HINT` : 매개변수로 클래스를 주고 받아 객체를 주입하는 것이 핵심!

        ### 선택 구현 기능

- [ ]  Lv4
    - [ ]  아래 연산 클래스들을 AbstractOperation라는 클래스명으로 만들어 사용하여 추상 클래스로 정의하고 Calculator 클래스의 내부 코드를 변경합니다.
        - [ ]  AddOperation(더하기)
        - [ ]  SubtractOperation(빼기)
        - [ ]  MultiplyOperation(곱하기)
        - [ ]  DivideOperation(나누기)
    - [ ]  `HINT` : ‘상속’이라는 키워드로 찾아봅시다!
```
### 구현 단계 
1. Lv2. 간단한 계산 구현
    - 두 가지 변수(num1, num2)에 대한 +, -, *, /, % 계산 가능합니다.
    - 입력을 잘못했다면 "잘못된 입력입니다. 입력을 확인해주세요."라는 알림을 줍니다.
    - calculator class를 이용하여 연산 진행 후 출력 가능합니다.

```
<구현 예시>

첫번째 값은?
        5
골라골라 +, -, *, /, %
        +
두번째 값은?
        3
        8.0
```

## 기능

### 사용자(User) 기능
1. 계산을 원하는 첫 번째 값, 연산자, 두 번째 값 순서로 입력하면 계산 결과를 출력합니다.
2. 입력을 잘못할 경우 "잘못된 입력입니다. 입력을 확인해주세요."라는 알림을 줍니다.

### 관리자(Admin) 기능
1. 차후 추가될 예정입니다.

## 코드 구조

1. 코드는 `caculater` 한 개의 클래스로 작성했습니다.
2. When식을 적용해서 분기점을 나눠 연산자에 맞춰 한가지 갑만 출력되도록 했습니다. 

## class 작성 <br/>
```
class calculator(var n1: Double, var n2: Double) {

    fun Add(): Double = n1 + n2
    fun Sub(): Double = n1 - n2
    fun Multiply(): Double = n1 * n2
    fun Divide(): Double = n1 / n2
    fun remain(): Double = n1 % n2

}
```
## When식 적용
```
val calculator = calculator(n1, n2)
    when (op) {
        "+" -> {
            val Add = calculator.Add()
            println(Add)
        }

        "-" -> {
            val Sub = calculator.Sub()
            println(Sub)
        }

        "*" -> {
            val Multiply = calculator.Multiply()
            println(Multiply)
        }

        "/" -> {
            val Divide = calculator.Divide()
            println(Divide)
        }

        "%" -> {
            val remain = calculator.remain()
            println(remain)
        }

        else -> println("잘못된 입력입니다. 입력을 확인해주세요.")
    }


}
```
* lV3, 4도 기대해주세요.
## *README에 설명 더 추가 예정*

## 환경설정<br/>
Language : Kotlin<br/>
IDLE : IntelliJ community<br/>
JDK : corretto-21 <br/>
