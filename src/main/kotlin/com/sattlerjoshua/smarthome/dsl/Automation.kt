package com.sattlerjoshua.smarthome.dsl

import kotlinx.serialization.Serializable

// An automation has a name and consists of one or more triggers that can trigger one or more tasks
@Serializable
data class Automation(
    val name: String,
    val triggers: List<Trigger>,
    val tasks: List<Task>,
) {

}
