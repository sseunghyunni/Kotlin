fun main(){
    val a : Int = 128
    val b = a

    println(a === b)
    val c: Int ? = a /*128객체 생성후 주소를 c에 넣음*/
    val d: Int ? = a/*128객체 스캔후 주소를 b에 넣음 --> null허용이니 다른 객체 생성*/
    val e: Int ? = c/*스캔했는데 값&형&null허용 여부 다 일치하는 주소인  c의 주소를 넣음*/
    println(c == d)
    println(c === d)
    println(c === e)
}