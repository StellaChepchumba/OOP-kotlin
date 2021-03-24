fun main(){
var foodWeight=Human("STELLA",23,55.3.toFloat())
foodWeight.eat(2)
    println(foodWeight.weight)
    foodWeight.speak("This is kotlin class")
    foodWeight.birthday()
    var details=Human.User("stella","perita","stellac@gmail.com","07015520",242334)
    println(details.phoneNumber)
    println(details.email)
}
class Human(var name:String,var age:Int,var weight:Float){

fun eat(foodWeight:Int):Float{
    println("iam eating $foodWeight kgs of food")
    weight=weight+foodWeight
    return weight
    age++
}
    fun speak(speech:String){
        println("$speech")

    }
    fun birthday(){
        age++
        println(age)
    }
    class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:Int ){

    }

}

















