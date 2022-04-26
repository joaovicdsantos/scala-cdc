package com.joaovicdsantos.estudo.cap02

// classesinha de Foto padrão
class Foto(val id: Long, val owner: String, val title: String, val farm: Int)

/*
 * Classe para "parseiar" imagens para objetos
 * isso não acontece pois tá tudo meio posto na mão.
 * Nessa altura do livro, não temos conhecimento suficiente, ou
 * ao menos não se espera que tenha, para escrever a função certinha
 */
object ContaFotos extends App {

  val resultadoServico =
    """
    |<rsp stat="ok">
    |  <photos page="1" pages="774" perpage="100" total="77360">
    |      <photo id="52027880205" owner="51388540@N05" secret="158a8c937c" server="65535" farm="66" title="12125 - Stairs" ispublic="1" isfriend="0" isfamily="0" />
	|    <photo id="52024070861" owner="12167448@N05" secret="dbae14946e" server="65535" farm="66" title="2021.11.19.112 FONTAINEBLEAU - Le château - l'escalier du roi" ispublic="1" isfriend="0" isfamily="0" />
	|    <photo id="52024316624" owner="12167448@N05" secret="c11338a07e" server="65535" farm="66" title="2021.11.19.113 FONTAINEBLEAU - Le château - l'escalier du roi" ispublic="1" isfriend="0" isfamily="0" />
	|    <photo id="52024582560" owner="12167448@N05" secret="2ac322de09" server="65535" farm="66" title="2021.11.19.114 FONTAINEBLEAU - Le château - l'escalier du roi" ispublic="1" isfriend="0" isfamily="0" />
	|    <photo id="52022461776" owner="12167448@N05" secret="0cddf8955e" server="65535" farm="66" title="2021.11.19.108 FONTAINEBLEAU - Le château - l'escalier du roi" ispublic="1" isfriend="0" isfamily="0" />
	|    <photo id="52022974560" owner="12167448@N05" secret="225a69d6f9" server="65535" farm="66" title="2021.11.19.109 FONTAINEBLEAU - Le château - l'escalier du roi, le plafond." ispublic="1" isfriend="0" isfamily="0" />
	|    <photo id="52022710779" owner="12167448@N05" secret="003808e783" server="65535" farm="66" title="2021.11.19.110 FONTAINEBLEAU - Le château - l'escalier du roi" ispublic="1" isfriend="0" isfamily="0" />
    |  </photos>
    |</rsp>
    """.stripMargin

    def parseiaResultado(resultado: String): List[Foto] = List(
      new Foto(52027880205L, "51388540@N05", "12125 - Stairs", 66),
      new Foto(52024070861L, "12167448@N05", "Le château", 66),
      new Foto(52024316624L, "12167448@N05", "Le château", 2),
      new Foto(52024582560L, "12167448@N05", "Le château", 2),
      new Foto(52022461776L, "12167448@N05", "Le château", 66),
      new Foto(52022974560L, "12167448@N05", "Le château", 2)
    )

    val fotos = parseiaResultado(resultadoServico)
    val countFotosFarm2 = fotos.count(foto => foto.farm == 2)

    println(s"count: $countFotosFarm2")

}
