package com.joaovicdsantos.estudo.cap03

// Apenas uma demonstração do funcionamento de um construtor

class FlickrCallerCVal(val apiKey: String)

object FlickrCallerCMain extends App {

  val caller = new FlickrCallerCVal("apikey")
  println(caller.apiKey)

}
