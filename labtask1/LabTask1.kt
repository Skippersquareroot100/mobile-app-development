fun main() {
    val one = 12
    val seco = 20
    val thr = 10

    val ans = if (one > seco) {
        if (one > thr) one else thr
    } else {
        if (seco > thr) seco else thr
    }

    println("Max value is: $ans")
}
