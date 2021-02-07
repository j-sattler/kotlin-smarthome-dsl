package com.sattlerjoshua.smarthome.dsl

class TriggerBuilder {
    var name = ""

    fun build(): Trigger {
        return Trigger(name)
    }
}
