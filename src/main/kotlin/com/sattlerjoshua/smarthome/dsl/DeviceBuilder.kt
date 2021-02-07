package com.sattlerjoshua.smarthome.dsl

class DeviceBuilder {
    var id = ""
    var name = ""

    fun build():Device{
        return Device(id, name)
    }
}
