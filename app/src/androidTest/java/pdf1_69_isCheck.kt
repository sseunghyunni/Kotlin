fun main(){
    val num =250/*스마트 캐스트 완료*/
    if( num is Int){
        print(num) /*if 구문으로 들어옴*/
    } else if (num !is Int){
        print("Not a Int")
    }
}