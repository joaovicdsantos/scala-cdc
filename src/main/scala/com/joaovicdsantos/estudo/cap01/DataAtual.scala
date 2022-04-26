package com.joaovicdsantos.estudo.cap01

import org.joda.time


object DataAtual extends App {

  // Usa a lib pra pegar a data atual, coisa tranquila
  val hoje = new time.LocalDate()

  // exibe o valor.
  println(hoje)

}
