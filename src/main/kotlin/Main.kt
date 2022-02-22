import.kotlin.math.pow

fun main(args: Array<String>) {

    print("Digite o diâmetrodo círculo: ")
    val diametro = readLine()!!.toDouble()
    val raio = diametro / 2
    val pi = 3.14
    val area = pi * raio.pow(2)
    val perimetro = 2 * pi * raio

    println("Para o diâmetro com o valor $diametro, a área do círculo é $area e o perímetro é $perimetro")

}