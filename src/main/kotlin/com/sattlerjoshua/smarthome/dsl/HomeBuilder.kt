package com.sattlerjoshua.smarthome.dsl

class HomeBuilder {
    var id = ""
    var name = ""
    var groups = arrayListOf<Group>()

    fun build(): Home{
        return Home(id, name, groups)
    }
}
