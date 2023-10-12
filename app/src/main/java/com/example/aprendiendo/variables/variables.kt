package com.example.aprendiendo.variables

fun main() {
    val stringer = "holas";
    print(stringer + " como andas ")

    getTrimestre(30)
}
fun getTrimestre (month:Int) {
    when (month) {
        in 1..6 -> println("Primer trimestre")
        in 7..12 -> println("Segundo trimestre")
        else -> println("no existe")
    }
}