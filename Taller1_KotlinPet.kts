// ========================================== Punto 1

val nombrePaciente: String = "Pepe"
val sexoPaciente: Char = 'M'
var edadPaciente: Int = 2
var pesoPaciente: Float = 8.5f
var estaVacunado: Boolean = true

// Simulación de cumpleaños y aumento de peso
edadPaciente += 1
pesoPaciente = 9.8f

println("- Punto 1")
println("Paciente: $nombrePaciente | Sexo: $sexoPaciente | Edad: $edadPaciente años | Peso: ${pesoPaciente} kg | Vacunado: $estaVacunado")
println()

// ========================================== Punto 2
val edad: Int = 8
val esUrgencia: Boolean = false

val categoria: String = when (edad) {
    in 0..1 -> "Cachorro"
    in 2..7 -> "Adulto"
    in 8..100 -> "Senior"
    else -> "Edad no válida"
}

println("- Punto 2")
println("Categoría del paciente: $categoria")

if (esUrgencia || categoria == "Senior") {
    println("Nivel de Prioridad: Prioridad Alta")
} else {
    println("Nivel de Prioridad: Atención Regular")
}
println()

// ========================================== Punto 3

val listaMascotas: List<String> = listOf("Kira", "Sasha", "Coco", "Maya")

println("- Punto 3")
println("Pacientes en sala de espera:")
for (index in listaMascotas.indices) {
    println("Turno #${index + 1}: ${listaMascotas[index]}")
}

println("\nMinutos faltantes para abrir la clínica:")
for (minuto in 5 downTo 1) {
    println("$minuto minuto(s)...")
}
println()

// ========================================== Punto 4

val contactoEmergencia: String? = null

// Uso de llamada segura.
val longitudContacto: Int? = contactoEmergencia?.length

// Uso del operador Elvis:
val contactoFinal: String = contactoEmergencia ?: "Sin contacto registrado"

println("- Punto 4")
println("Longitud del número (Llamada segura): $longitudContacto")
println("Contacto registrado: $contactoFinal")
println()

// ========================================== Punto 5

// Precios base enteros en pesos colombianos: Consulta ($50.000), Baño ($35.000), Desparasitación ($25.000)
val preciosBase: List<Int> = listOf(50000, 35000, 25000)

// Lambda que calcula el 10% de recargo y lo retorna redondeado como entero (.toInt())
val calcularRecargoNocturno = { precio: Int -> (precio * 1.10).toInt() }

println("- Punto 5")
println("Tarifas de servicios con recargo nocturno (COP):")
preciosBase.forEach {
    val precioFinal = calcularRecargoNocturno(it)
    println("Precio base: $$it COP | Con recargo nocturno: $$precioFinal COP")
}