package com.sattlerjoshua.smarthome.dsl

import kotlinx.serialization.Serializable

@Serializable
data class Group(
    val id: String,
    val name: String,
    val subgroups: Collection<Group>,
    val devices: Collection<Device>,
) {

}
