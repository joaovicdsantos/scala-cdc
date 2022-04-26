package com.joaovicdsantos.estudo.cap03


object MediaUsage extends App {
  // não compila, pois Media é um object
  // val m = new Media()
  
  // Funcionam, pois como Media é singleton
  // é como se já existisse uma instância dele
  // não sendo necessário instânciar um objeto
  println(Media.fotos)
  println(Media.videos)
  println(Media.todas)
}
