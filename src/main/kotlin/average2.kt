fun main() {
    println("== 프로그램시작 ==")

    print("숫자개수 : ")
    val numCount = readLine()!!.trim().toInt()    // IntArray 값을 직접 입력받음.
    var numbers = IntArray(numCount) {0}

    println("${numCount}개의 숫자를 입력받습니다.")

    for (i in 0 until numCount) {
        print("${i+1}번째 숫자 : ")
        numbers[i] = readLine()!!.trim().toInt()
    }

    /*var sum = 0

    for (i in 0 until numCount) {
        sum += numbers[i]
    }

    val avg = sum / numCount*/               //IntArray  값을 직접 입력받으면 변수없이 아래처럼 할수 있다.

    println("입력하신 숫자의 합은 ${numbers.sum()}입니다.")
    println("입력하신 숫자의 평균은 ${numbers.average().toInt()}입니다.")

    println("== 프로그램 끝 ==")


}