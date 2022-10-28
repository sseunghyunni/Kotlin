fun main(){
    var str1 : String? = "Hello Kotlin"
    str1 = null
    /*null 허용한 변수 아니니 오류발생
    * 해결 원하면 String뒤에 ?넣어주기*/
    println("str1: $str1")
}