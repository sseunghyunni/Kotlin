fun main(){
    val a1: Int = 128
    val b1: Int = 128
    println(a1 == b1)
    println(a1 === b1)

    /*참조주소 달라지는 경우*/
    val a3: Int = 128
    val b3: Int? = 128
    println(a3 == b3)
    println(a3 === b3)
    /*값 같아도 null 허용 여부에 따라 주소가 다르다고 생각하기
    * 실제로는 주소는 같지만 다름*/
}