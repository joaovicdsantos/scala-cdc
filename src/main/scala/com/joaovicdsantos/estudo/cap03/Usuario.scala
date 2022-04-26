package com.joaovicdsantos.estudo.cap03

/*
 * Classe para exemplificar um pouco do
 * uso de pattern matching
 */
object Usuario extends App {

  // Option, portanto pode ser Some(alguma_coisa) ou None
  val usuarioOpt: Option[String] = None

  // Retornará o usuário, caso exista, ou "anônimo", caso este não esteja definido
  def usuarioAtual() = usuarioOpt match {
    case Some(usuario) => usuario
    case None => "anônimo"
  }

  // idem
  def usuarioAtualUniforme = usuarioOpt match {
    case Some(usuario) => usuario
    case None => "anônimo"
  }

  println(s"Usuario: ${usuarioAtual()}")

}
