/*Array-배열표현*/
fun main(){
    val data1: Array<Int> = Array(3,{ 0 })
    data1[0] = 10
    data1[1] = 20
    data1.set(2,30)
 /*[]이용해 배열 데이터 접근 가능 & set(),get()함수 이용해 배열 데이터 접근 가능*/
    println(
        """
            array size: ${data1.size}
            array data: ${data1[0]},${data1[1]},${data1.get(2)}
        """.trimIndent()
    )
}