package com.joaovicdsantos.estudo.cap01

import java.io.File


// importação de App para não ser necessário a criação de um método main
// e também pra dar uma cara de função.
object ApagarImagens extends App {

  // pega todos os arquivos do diretório onde o script está sendo executado
  val arquivos = new File(".").listFiles
  // Extensões que queremos buscar
  val extensoesImgs = List(".jpg", ".jpeg", ".gif", ".png")

  // função que verifica se o nome do arquivo termina com uma das extenões que queremos
  def ehImagem(nomeArq: String) = extensoesImgs.exists(nomeArq.endsWith(_))
  
  // faz uso da função acima para pegar todos arquivos que queremos e deletá-los
  arquivos.filter(arq => ehImagem(arq.getName)).foreach(_.delete)

}
