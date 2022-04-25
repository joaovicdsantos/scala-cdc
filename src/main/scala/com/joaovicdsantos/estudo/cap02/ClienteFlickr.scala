package com.joaovicdsantos.estudo.cap02

import scala.io.Source
import com.typesafe.config.ConfigFactory


object ClienteFlickr extends App {

  val config = ConfigFactory.load("application.conf")

  val apiKey = config.getString("flickr.api.key")
  val method = "flickr.photos.search"
  val tags   = "scala"
  val url    = s"https://api.flickr.com/services/rest/?method=$method&api_key=$apiKey&tags=$tags"

  scala.io.Source.fromURL(url).getLines().foreach(println)

}
