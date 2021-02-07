package com.sattlerjoshua.smarthome.dsl

data class Group(
    val id: String,
    val name: String,
    val subgroups: Collection<Group>,
    val devices: Collection<Device>,
) {

}
