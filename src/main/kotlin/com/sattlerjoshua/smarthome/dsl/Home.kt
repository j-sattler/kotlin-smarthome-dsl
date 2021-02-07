package com.sattlerjoshua.smarthome.dsl

import kotlinx.serialization.Serializable

@Serializable
data class Home(
    val id: String,
    val name: String,
    val groups: Collection<Group>,
) {

}
