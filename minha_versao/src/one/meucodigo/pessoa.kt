package one.meucodigo

class pessoa {
    var nome: String = "Daniel"
    var cpf: String = "123.413.123-12"
}

fun main() {
    val daniel = pessoa()

    println(daniel.nome)
    println(daniel.cpf)
}