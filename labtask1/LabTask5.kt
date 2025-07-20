 class Car {

     private  var model: String
    private var numberOfWheels: Int =0  
    private var fuelCapacity: Float =0.0f
   
    constructor()
    {
        println("this is constructor of Car class ")
    }
    
    
    fun setModel(model: String) {
        this.model = model
    }

    fun setNumberOfWheels(numberOfWheels: Int) {
        this.numberOfWheels = numberOfWheels
    }

    fun setFuelCapacity(fuelCapacity: Float) {
        this.fuelCapacity = fuelCapacity
    }

    fun getModel() : String = model
    fun getNumberOfWheels() : Int = numberOfWheels
    fun getFuelCapacity() : Float = fuelCapacity

    fun showDetails() {
        println("Model of this car: $model\nNumber of wheels: $numberOfWheels\nFuel capacity of this car: $fuelCapacity liters")
       
    }



 }


 fun  main(args: Array<String>) {

    val obj = Car()
    obj.setModel("Gorur Gari")
    obj.setNumberOfWheels(2)
    obj.setFuelCapacity(0.0f)
    obj.showDetails()
}