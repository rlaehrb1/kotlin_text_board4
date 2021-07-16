import com.sun.xml.internal.bind.v2.runtime.unmarshaller.IntData

fun main(){
    println("== 프로그램 시작 ==")
    print("숫자(띄워쓰기로구분) : ")

    bubblesort(numbers)

    val numbers = readLine()!!.trim().split(" ").map { it.toInt()}.toMutableList()  //Array는 크기조절불가 List는 가능

    print("오름차순 정렬 결과 : ")
    printNumbers(numbers)
    println()
    print("내림차순 정렬 결과 : ")
    printNumbersReverse(numbers)

    println()

    println("== 프로그램 끝 ==")

}

fun bubblesort(numbers : MutableList<Int>) {

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