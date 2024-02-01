package models
class Lampada {
    private var color:String="white"
    private var switchon:Boolean=true
    private var intensity:Int=0
    public var room :String=""



    constructor(color:String, switchon:Boolean, intensity:Int, id:String) {
        this.color = color
        this.switchon = switchon
        this.intensity = intensity
        this.room= room

    }
    fun ChangeColor(nextColor: String) {
        color = nextColor

    }
    fun on() {
        switchon = true
    }

    fun Off() {
        switchon = false
    }

    fun changeIntensity(nextintensity: Int) {
        do {
            if (nextintensity in 0..5) {
                intensity = nextintensity
            } else {
                println("ERROR!!!")
            }
        } while (nextintensity > 5)
    }

    override fun toString(): String {
        return (  "lampada: ${if (switchon) "Encensa" else "Apagada"} - Color: $color - Intensidad: $intensity")
    }
}