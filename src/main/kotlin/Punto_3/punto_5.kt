package Punto_3

class Cliente {
    private var t: Int = 0
    private var s: String = ""
    private var a:Int =0
    private var p:Boolean = false


    constructor()
    constructor(t: Int, s: String) {
        this.t = t
        this.s = s
    }

    }


fun main(){
    var t=0
    var s=""
    var a=0
    var p=false
    var opc:Int
    do {
        println("Ingrese su edad:")
        a= readLine()!!.toInt()
        println("Ingrese su sexo:")
        s= readLine()!!.toString()
        println("Esta en estado de embarazo:")
        if (p!=false){
            p=true
        }
        println("Que transaccion desea realizar:")
        print("0.salir\n1.Consignacion\n 2.Pago\n 3.Retiro")
        opc = readLine()!!.toInt()
        when(opc){
            1->{
                if (a<65){
                    t=4
                }else if (a in 65..80){
                    t=4+(64-a)
                }else t=8


            }
            2->{
                if (a<65){
                    t=4
                } else if (a in 65..80){
            t=4+(64-a)
        }else t=6


            }
            3->{
                t==3

            }

        }
        for (a in 65..80){
            t=t+1
        }

    }while (opc!=0)



}


class Cajero {
    private var t: Int = 0
    private var s: String = ""
    private var a:Int =0
    private var p:Boolean = false


    constructor()
    constructor(t: Int, s: String) {
        this.t = t
        this.s = s
    }

}