package com.sattlerjoshua.smarthome.dsl

class GroupBuilder {
    lateinit var id: String
    lateinit var name: String
    var subgroups = arrayListOf<Group>()
    lateinit var devices: ArrayList<Device>

    fun build(): Group {
        return Group(id, name, subgroups, devices)
    }

    operator fun Device.unaryPlus(){
        devices.add(this)
    }
}
