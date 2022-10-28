fun main(){
    print("Enter the score: ")
    val score = readLine()!!.toDouble()
    /*java와 다르게 스케너 객체 생성 안해도됨*/
    var grade: Char ='F'

    if(score >=90.0){
        grade ='A'
    } else if(score >=80.0 && score <=89.9){
        grade = 'B'
    } else if(score>=70.0 && score <=79.9){
        grade='C'
    }

    println("Score:$score,Grade:$grade")
}