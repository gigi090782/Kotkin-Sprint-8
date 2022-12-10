package ru.sberschool.hystrix.model

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonSpecie(
    @JsonProperty("count")
    val count: Long? = null,
    @JsonProperty("next")
    val next: Any? = null,
    @JsonProperty("previous")
    val previous: Any? = null,
    @JsonProperty("results")
    val results: List<PokemonSpecieResult> =  ArrayList()
)