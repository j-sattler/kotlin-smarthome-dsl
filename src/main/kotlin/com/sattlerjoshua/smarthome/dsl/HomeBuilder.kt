package com.sattlerjoshua.smarthome.dsl

class HomeBuilder {
    var id = ""
    var name = ""
    var groups = arrayListOf<Group>()
    var automations = arrayListOf<Automation>()

    fun build(): Home{
        return Home(id, name, groups, automations)
    }
}
