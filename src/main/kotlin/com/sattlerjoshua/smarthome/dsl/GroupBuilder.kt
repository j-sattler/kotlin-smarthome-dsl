package com.sattlerjoshua.smarthome.dsl

class GroupBuilder {
    var id = ""
    var name = ""
    var subgroups = arrayListOf<Group>()
    var devices = arrayListOf<Device>()

    fun build(): Group {
        return Group(id, name, subgroups, devices)
    }

    operator fun Device.unaryPlus(){
        devices.add(this)
    }
}
