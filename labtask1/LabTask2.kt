fun minVal(arr:Array<Int>):Int
{
     var min = arr[0];
     for(i in arr)
     {
        if(i<min)
        {
            min=i
        }
     }
     return min
}

fun main()
{
    var arr = arrayOf(1,2,3,4,5,6,7,8,9,10)
    var min= minVal(arr)
    println("Minmum value is : $min")
}