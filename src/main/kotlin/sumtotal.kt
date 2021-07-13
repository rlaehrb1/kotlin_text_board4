fun main(){
    println("== 프로그램 시작 =")

    print("숫자 개수")
    val numCount = readLine()!!.toInt()
    println("${numCount}개의 숫자를 입력 받습니다.")

    var sum = 0

    for (i in 0 until numCount){
        print("${i+1}번째 숫자 : ")
        sum += readLine()!!.toInt()

    }
    println("입력하신 숫자의 합은 $sum 입니다.")


    println("== 프로그램 끝 =")

}