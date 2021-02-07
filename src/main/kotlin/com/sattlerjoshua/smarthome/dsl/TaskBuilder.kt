package com.sattlerjoshua.smarthome.dsl

class TaskBuilder {
    var name = ""

    fun build():Task{
        return Task(name)
    }
}
