package com.sattlerjoshua.smarthome.dsl

import kotlinx.serialization.Serializable

@Serializable
data class Device(
    val id: String,
    val name: String,
) {

}
