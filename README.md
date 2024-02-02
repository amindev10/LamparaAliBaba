![lamp](https://github.com/amindev10/LamparaAliBaba/blob/main/gsc_116924023_1609949_1.jpeg)

# Clase Lampada

La clase `Lampada` representa una lámpara con propiedades como color, estado encendido/apagado, intensidad y asociación a una habitación. Proporciona métodos para cambiar el color, encender/apagar la lámpara y ajustar la intensidad.

## Definición de la Clase

### Atributos

- **color** (*privado*): String - Representa el color de la lámpara, el valor predeterminado es "blanco".
- **switchon** (*privado*): Boolean - Indica si la lámpara está encendida (`true`) o apagada (`false`).
- **intensity** (*privado*): Int - Representa el nivel de intensidad de la lámpara, con valores de 0 a 5.
- **room** (*público*): String - Representa la habitación en la que se encuentra la lámpara.

### Métodos

- **Constructor**: Inicializa el objeto `Lampada` con el color, estado de encendido, intensidad y habitación especificados.
- **ChangeColor(nextColor: String)**: Cambia el color de la lámpara al valor especificado.
- **on()**: Enciende la lámpara.
- **Off()**: Apaga la lámpara.
- **changeIntensity(nextIntensity: Int)**: Cambia el nivel de intensidad de la lámpara dentro del rango de 0 a 5.
- **toString()**: Devuelve una representación en cadena del estado de la lámpara, incluyendo si está encendida o apagada, el color y la intensidad.

## Ejemplo de Uso

```kotlin
// Crea un objeto Lampada
val lampara = Lampada(color = "azul", switchon = true, intensity = 3, room = "Sala de Estar")

// Apaga la lámpara
lampara.Off()

// Cambia el color de la lámpara a rojo
lampara.ChangeColor("rojo")

// Ajusta el nivel de intensidad
lampara.changeIntensity(2)

// Muestra el estado de la lámpara
println(lampara.toString())
