 class Student {

     private var id: Int = 0
    private var name: String = ""
    private var cgpa: Float = 0.0f

    constructor()
    {
        println("this is constructor of Student class ")
    }
    
    
    fun setId(id: Int) {
        this.id = id
    }

    fun setName(name: String) {
        this.name = name
    }

    fun setCGPA(cgpa: Float) {
        this.cgpa = cgpa
    }

    fun getId() : Int = id
    fun getName() : String = name
    fun getCGPA() : Float = cgpa

    fun showDetails() {
        println("ID: $id\nName: $name\nCGPA: $cgpa")
    }



 }


 fun  main(args: Array<String>) {

    val obj = Student()
    obj.setId(101)
    obj.setName("Maruf Hasan Anik")
    obj.setCGPA(3.75f)
    obj.showDetails()
}