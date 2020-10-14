fun main(){
    println("Bem vindo ao Bytebank")
    val titular: String = "Alex"
    val numeroConta: Int = 1000
    var saldo = 0.0
    saldo = 100 + 2.0
    saldo += 200
    saldo = -10.0

    println("titular $titular")
    println("número da conta $numeroConta")
    println("saldo da conta $saldo")

    fun testaCondicoes(saldo: Double){
        when {
            saldo > 0.0 -> println("Saldo é positivo")
            saldo == 0.0 -> println("Sem saldo")
            else -> println("Saldo negativo")
        }
    }
}