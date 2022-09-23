package Punto_3

import java.lang.Math.PI
import java.lang.Math.tan

class Poligono {
    private var l_p: Int = 3
    private var t_l_p: Double = 0.0
    private var c_x:Double =0.0
    private var c_y:Double = 0.0


    constructor()
    constructor(l_p: Int, t_l_p: Double) {
        this.l_p = readLine()!!.toInt()
        this.t_l_p = readLine()!!.toDouble()
    }


    constructor(l_p: Int, t_l_p: Double, c_x: Double, c_y: Double) {
        this.l_p = l_p
        this.t_l_p = t_l_p
        this.c_x = c_x
        this.c_y = c_y

    }

//analizadores get
fun getlados() = this.l_p
fun gettamanoLados() = this.t_l_p
fun getcoordenadaX() = this.c_x
fun getcoordenadaY() = this.c_y

//modificadores set
fun setlados(nuevo_lados: Int) {
    if (nuevo_lados != 0) {
        this.l_p = nuevo_lados
    }
}

fun settamanoLados(nuevo_tamanoLados: Double) {
    if (nuevo_tamanoLados != 0.0) {
        this.t_l_p = nuevo_tamanoLados
    }
}

fun setcoordenadaX(nuevo_coordenadaX: Double) {
    if (nuevo_coordenadaX != 0.0) {
        this.c_x= nuevo_coordenadaX
    }
}
fun setcoordenadaY(nuevo_coordenadaY: Double) {
    if (nuevo_coordenadaY != 0.0) {
        this.c_y= nuevo_coordenadaY
    }
}



}

fun main() {
    var l_p = 3
    var t_l_p = 0.0
    var c_x = 0.0
    var c_y = 0.0
    var opc = Int
    do {
        println("Ingrese el numero de lados del poligono:")
        print("3.Triangulo\n 4.Cuandrado \n5.Pentagono\n 6.Hexagono\n 7. Heptagono\n")
        opc = readLine()!!.toString()
    }



        fun getPerimetro(): Double = l_p.toDouble() * t_l_p

        fun getArea(): Double {
            var area = 0.0
            var numerador = l_p * Math.pow(getPerimetro(), 2.0)
            var denominador = 4 * tan(PI / l_p)
            area = numerador / denominador
            return area

        }
        return opc
    }
}