fun main(){
    println("회원관리프로그램 ver 1.0")

    print("회원 수를 입력하세요 : ")
    val membersCount = readLine()!!.trim().toInt()  // 입력을 읽는다, 공백을없앤다, 정수형으로바꾼다.

    val members: Array<Member> = Array<Member?>(membersCount){null} as Array<Member> //as Array<member> 형변환

    println("== ${membersCount}명의 회원정보를 입력합니다. ==")

    for (i in members.indices) {
        val id = i+1
        print("${i+1}번째 회원의 이름 : ")
        val name = readLine()!!.trim()
        print("${i+1}번째 회원의 나이 : ")
        val age = readLine()!!.trim().toInt()
        print("${i+1}번째 회원의 성별 : ")
        val gender = readLine()!!.trim()[0] // [0] 은 Char 형으로한다.

        members[i] = Member(id, name, age, gender)

    }

    sortMembersByAgeAsc(members)

    println("== 입력하신 회원 리스트 ==")
    println("번호/  이름/ 나이 /성별")

    for (member in members){
        println("${member.id}  / ${member.name} / ${member.age}  / ${member.getGenderKor()}")
    }

}

fun isMemberBiggerThan(member: Member, member1: Member):Boolean {
    if (member.age != member1.age) return member.age > member1.age
    return member.name > member1.name
}

fun sortMembersByAgeAsc(members: Array<Member>) {

    val maxDepth = members.size -1

    for ( depth in maxDepth downTo 1) {

        for ( i in 0 until depth){
            if (isMemberBiggerThan(members[i], members[i+1]))      {
                members[i] = members[i+1].also {members[i+1] = members[i]}
            }
        }
    }

}

data class Member(
    val id: Int,
    val name: String,
    val age: Int,
    val gender: Char

) {
    fun getGenderKor(): String = when (gender) {
        'w' -> {
            "여자"
        }
        else -> {
            "남자"
        }
    }

}
