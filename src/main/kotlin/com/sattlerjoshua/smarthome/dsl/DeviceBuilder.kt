package com.sattlerjoshua.smarthome.dsl

class DeviceBuilder {
    lateinit var id: String
    lateinit var name: String

    fun build():Device{
        return Device(id, name)
    }
}
