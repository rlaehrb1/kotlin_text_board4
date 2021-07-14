fun main(){
    println("== 프로그램시작 ==")

    val numvers = IntArray(100) {0}

    print("숫자 개수 : ")
    val numCount = readLine()!!.trim().toIntOrNull()//toInt()
    println("${numCount}개의 숫자를 입력 받습니다.")

    if (numCount == null) {
        print("잘못 입력 하셨습니다.")
        return
    }else{
        print("\"${numCount}개의 숫자를 입력 받습니다.\"")
    }

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