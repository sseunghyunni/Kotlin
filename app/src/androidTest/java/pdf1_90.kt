/*DefaultParameter*/

fun main(){
    val name="김승현"
    val email = "rlatmd98@naver.com"

    add(name)
    add(name,email)
    add("둘리","ksh_9804@naver.com")
    defaultArgs()
    defaultArgs(200)
}

fun add(name:String, email: String ="default"){
    val output ="${name}님의 이메일은 ${email}입니다."
    println(output)
}

fun defaultArgs(x:Int =100, y:Int = 200){
    println(x+y)
}