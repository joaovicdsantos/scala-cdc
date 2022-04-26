package com.joaovicdsantos.estudo.cap03

import _root_.com.joaovicdsantos.estudo.cap02.Foto

/**
  * Classe para exemplificar formas de se criar uma função
  */
class FlickCaller {

  val apikey = "key"

  // sem chaves, implementação com apenas uma linha
  def buscaFotosUmaLinha(tag: String): Seq[Foto] = ???

  def buscaFotos(tag: String): Seq[Foto] = {
    // algoritmo de acesso ao Flickr aqui
    ???
  }

  // usando return, evite!
  def buscaFotosReturn(tag: String): Seq[Foto] = {
    // algoritmo de acesso Flickr aqui
    // Repare que o uso do return só é possível por
    // conta da definição do tipo de retorno
    return ???
  }

  // com 'return' mas sem tipo de retorno, não compila
  // def buscaFotosReturnBroken(tag: String) = {
  //  algoritmo de acesso ao Flickr aqui
  //  return ???
  // }

}
