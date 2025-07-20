fun leapYear(year: Int): Boolean {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
}

fun main()
{
    var input = readLine()!!
    var year = input.toInt()
    if(leapYear(year))
    {
        println("it is a leap year")
    }
    else
    {
        println("it is not a leap year")
    }
}