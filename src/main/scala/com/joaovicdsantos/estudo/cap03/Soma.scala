package com.joaovicdsantos.estudo.cap03

/*
 * Classe para exemplificar funções dentro da classe
 * com o funcionamento dos seus retornos.
 */
object Soma extends App {
  
  // função normal, sem return e sem tipo de retorno definido
  def soma(x: Int, y: Int) = x + y

  // retorno explícito, return opcional
  def somaExplicita(x: Int, y: Int): Int = x + y

  // alterando o tipo de retorno "sem querer", retornar float, ou double
  // em vez de Int como era esperado de início.
  def somaAlterada(x: Int, y: Int) = x + y + 1.0

}
