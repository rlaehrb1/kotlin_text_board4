fun main() {
    println("== 프로그램시작 ==")

    val numvers = IntArray(10) { 0 }
    var numCount = 0


    while (true) {

        print("숫자 개수 : ")
        numCount = readLine()!!.trim().toInt()

        if (numCount > numvers.size) {
            println("${numvers.size}이하의 숫자를 입력하세요.")
        }
        else {
            break
        }
    }
    println("${numCount}개의 숫자를 입력 받습니다.")


    for (i in 0 until numCount) {
        print("${i+1}번째 숫자 : ")
        numvers[i] = readLine()!!.trim().toInt()
    }

    var sum = 0

    for (i in 0 until numCount) {
        sum += numvers[i]
    }

    var average = sum / numCount

    println("입력하신 숫자의 합은 ${sum} 입니다.")
    println("입력하신 숫자의 평균은 ${average} 입니다.")


    println("== 프로그램끝 ==")

}