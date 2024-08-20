fun main() {
    var continuar = true

    while (continuar) {
        println("""Acción a realizar
            |1. Suma
            |2. Resta
            |3. Multiplicación
            |4. División
            |5. Raíz
            |6. Cuadrado
            |7. Salir
        """.trimMargin())

        print("Selecciona el número de la operación a realizar: ")
        val opcion = readln().toInt()

        when (opcion) {
            1 -> suma()
            2 -> resta()
            3 -> println(multi(9.3, 3.7))
            4 -> division(9.3, 3.7)
            5 -> println("La raíz es: ${raiz()}")
            6 -> println("El cuadrado es: ${cuadrado(3.8)}")
            7 -> {
                println("Vuelve cuando quieras")
                continuar = false
            }
            else -> println("Ingresa un número válido")
        }

        if (continuar) {
            print("¿Desea continuar con el menú? (1. Sí / 2. No): ")
            continuar = readln().toInt() == 1
        }
    }
}

var n1 = 9
var n2 = 5
var n3 = 7.8

fun suma() {
    println("La suma es ${n1 + n2}")
}

fun resta() {
    println("La resta es ${n1 - n2}")
}

fun multi(n1: Double, n2: Double): String {
    return "La multiplicación es ${n1 * n2}"
}

fun division(n1: Double, n2: Double) {
    println("La división es ${n1 / n2}")
}

fun raiz(): Double {
    return Math.sqrt(n3)
}

fun cuadrado(n: Double): Double {
    return Math.pow(n, 2.0)
}