fun main(){
    println("== 프로그램 시작 ==")
    print("숫자(띄워쓰기로구분) : ")

    val numbers = readLine()!!.trim().split(" ").map { it.toInt()}.toMutableList()  //Array는 크기조절불가 List는 가능

    bubblesort(numbers)

    print("오름차순 정렬 결과 : ")
    printNumbers(numbers)
    println()
    print("내림차순 정렬 결과 : ")
    printNumbersReverse(numbers)

    println()

    println("== 프로그램 끝 ==")

}

fun bubblesort(numbers : MutableList<Int>) {
    val lastIndex = numbers.size -1
    var raiseCount = 0

    var depth = lastIndex
    while ( depth >= 1 ) {
        println("raiseCount : ${++raiseCount}, depth : ${depth}")

        /*for ( depth in lastIndex downTo 1) {
        println("raiseCount : ${++raiseCount}, depth : ${depth}")*/

        for (i in 0 until depth) {
            println("numbers[$i] vs numbers[${i + 1}]")


            if (numbers[i] > numbers[i + 1]) {
                numbers[i] = numbers[i + 1].also { numbers[i + 1] = numbers[i] }
            }
        }

        depth--
    }
}

fun printNumbers(numbers : List<Int>) {
    numbers.forEach{
        print("${it} ")
    }

}
fun printNumbersReverse(numbers : List<Int>) {
    numbers.withIndex().reversed().forEach {
        print("${it.value} ")
    }
}
