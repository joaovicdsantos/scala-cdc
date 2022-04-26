package com.joaovicdsantos.estudo.cap03


/*
 * Classe abstrata, que define somente
 * as assinaturas.
 */
abstract class AbstractMedia(val value: String)

object Fotos extends AbstractMedia("fotos")
object Videos extends AbstractMedia("videos")
object Todas extends AbstractMedia("all")
