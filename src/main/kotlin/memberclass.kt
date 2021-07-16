import java.lang.reflect.Member

fun main(){
    println("회원관리프로그램 ver.1.0")

    print("회원 수를 입력하세요 : ")
    val membersCount = readLine()!!.trim().toInt()

    val members = Array<member?>(membersCount){null}

    println("== ${membersCount}명의 회원정보를 입력합니다. ==")

    for (i in 0 until membersCount) {
        val id = i+1
        print("${i+1}번째 회원의 이름 : ")
        val name = readLine()!!.trim()
        print("${i+1}번째 회원의 나이 : ")
        val age = readLine()!!.trim().toInt()
        print("${i+1}번째 회원의 성별 : ")
        val gender = readLine()!!.trim()[0]

        val member = member(id, name, age, gender)
        members[i] = member

    }

    println("== 입력하신 회원 리스트 ==")
    println("번호/  이름/ 나이 /성별")

    for (member in members){
        println("${member?.id}  / ${member?.name} / ${member?.age}  / ${member?.getGenderKor()}")
    }

}

data class member(
    val id: Int,
    val name: String,
    val age: Int,
    val gender: Char

) {
    fun getGenderKor(): String {
        if (gender == 'w') {
            return "여자"
        }
        return "남자"
    }
}
