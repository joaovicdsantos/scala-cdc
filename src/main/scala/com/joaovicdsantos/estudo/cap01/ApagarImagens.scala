package com.joaovicdsantos.estudo.cap01

import java.io.File


object ApagarImagens extends App {

  val arquivos = new File(".").listFiles
  val extensoesImgs = List(".jpg", ".jpeg", ".gif", ".png")

  def ehImagem(nomeArq: String) = extensoesImgs.exists(nomeArq.endsWith(_))
  
  arquivos.filter(arq => ehImagem(arq.getName)).foreach(_.delete)

}
