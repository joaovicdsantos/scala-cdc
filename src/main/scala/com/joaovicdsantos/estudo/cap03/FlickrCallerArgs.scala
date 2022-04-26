package com.joaovicdsantos.estudo.cap03


object FlickrCallerArgs extends App {
  // def buscaFotos(tag: String, userId: String) = ???
  def buscaFotos(tag: String = "", userId: String = "") = ???

  // possíveis formas de uso do método acima:
  
  // posicionamento
  buscaFotos("scala")
  
  // parâmetros nomeados
  buscaFotos(userId = "userid")
  
  // mistura dos dois
  buscaFotos("scala", userId = "userid")

  class FlickrCaller(api: String = "")
  val caller = new FlickrCaller()

}
