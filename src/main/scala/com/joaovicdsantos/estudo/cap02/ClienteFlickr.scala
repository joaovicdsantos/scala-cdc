package com.joaovicdsantos.estudo.cap02

import scala.io.Source
import com.typesafe.config.ConfigFactory

/*
 * Classe para consumir a api do Flickr
 */
object ClienteFlickr extends App {

  // carrega a configuração que está na pasta resources
  val config = ConfigFactory.load("application.conf")

  // pega a api_key
  val apiKey = config.getString("flickr.api.key")

  // constantes úteis na requisição
  val method = "flickr.photos.search"
  val tags   = "scala"
  val url    = s"https://api.flickr.com/services/rest/?method=$method&api_key=$apiKey&tags=$tags"

  // faz a request retorna os valores e printa cada uma das linhas
  scala.io.Source.fromURL(url).getLines().foreach(println)

}
