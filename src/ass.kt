fun main(){
    words("sabdio", "sarah", "waunita", "diana")
    println()
    words(3)
    words(12)
    words(20)
    var name = "wato"
    var age=19
}
fun words(age:Int){
    if(age<=6){
        println("serve a glass of milk for the student")
    }
    else if(age in 6..15){
        println("serve a bottle of fanta orange for the student")
    }
    else
        println("serve a bottle of coka cola for the student")
}
fun words(name1:String, name2:String, name3:String, name4:String,):Array<String> {
    var names = arrayOf(name1, name2, name3, name4)
    for (name in names)
        if (name.length > 5) {
            println(name)
        }
    return names
}

    fun add() {
        val a = 12
        val b = 38
        val add = (a + b)
        println(add)
    }


