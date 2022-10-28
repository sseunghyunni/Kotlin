/*any - 모든 타입 가능*/
val data1: Any = 10
val data2: Any ="hello"

class User
val data3: Any = User()

/*unit- 반환문이 없는 함수 */
val data4 : Unit = Unit
fun some1() : Unit{
    println(10+20)
}
fun some2(){
    println(10+20)
}
/*실행*/
fun main(){
    some1()
    some2()
}