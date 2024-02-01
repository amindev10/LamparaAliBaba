import models.Lampada

fun main() {
    val lampara1 = Lampada("blanco", true, 0, "menjador")
    val lampara2 = Lampada("blanco", true, 0, "cocina")

    println()
    println("Menjador")

    lampara1.changeIntensity(1)
    println("${lampara1}")
    lampara1.on()
    println("${lampara1}")
    lampara1.ChangeColor("amarillo")
    println("${lampara1}")
    lampara1.Off()
    println("${lampara1}")
    lampara1.ChangeColor("rosa")
    println("${lampara1}")
    lampara1.changeIntensity(2)
    println("${lampara1}")
    lampara1.ChangeColor("rojo")
    println("${lampara1}")


    println()


    println("Cocina")
    lampara2.on()
    println("${lampara2}")
    lampara2.changeIntensity(5)
    println("${lampara2}")
    lampara2.Off()
    println("${lampara2}")
    lampara2.ChangeColor("azul")
    println("${lampara2}")
    lampara2.on()
    println("${lampara2}")
    lampara2.ChangeColor("narnaja")
    println("${lampara2}")
    lampara2.changeIntensity(4)
    println("${lampara2}")
    lampara2.ChangeColor("verde")
    println("${lampara2}")
}
