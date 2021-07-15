fun main() {
    println("== 프로그램시작 ==")

    val numbers = IntArray(10) { 0 }
    var numCount = 0

    while (true) {     // 무한하게 입력받는다.

        print("숫자 개수 : ")
        numCount = readLine()!!.trim().toInt()

        if (numCount > numbers.size) {
            println("${numbers.size}이하의 숫자를 입력하세요.")
        }   else  {
            break
        }
    }
    println("${numCount}개의 숫자를 입력 받습니다.")


    for (i in 0 until numCount) {
        print("${i+1}번째 숫자 : ")
        numbers[i] = readLine()!!.trim().toInt()
    }

    var average = numbers.sum()/numCount

    println("입력하신 숫자의 합은 ${numbers.sum()} 입니다.")
    println("입력하신 숫자의 평균은 ${average} 입니다.")


    println("== 프로그램끝 ==")

}