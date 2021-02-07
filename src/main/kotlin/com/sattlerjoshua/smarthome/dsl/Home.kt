package com.sattlerjoshua.smarthome.dsl

data class Home(
    val id: String,
    val name: String,
    val groups: Collection<Group>,
) {

}
