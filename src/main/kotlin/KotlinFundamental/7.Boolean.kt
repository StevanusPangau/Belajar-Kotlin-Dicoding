package KotlinFundamental

fun main(){
//    Conjunction atau AND
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = if (now >= officeOpen && now <= officeClosed){
        true
    } else {
        false
    }

    println("Office is open : $isOpen")

    /*
    * Output : Office is open : false
    * */

//    Disjunction atau OR
    val isClose = now < officeOpen || now > officeClosed

    println("Office is closed : $isClose")
    /*
    * Output : Office is closed : true
    * */

//    Negation atau NOT
    if(!isOpen){
        println("Office is closed")
    } else {
        println("Office is open")
    }
    /*
    * Output : Office is open : false.
    * */
}