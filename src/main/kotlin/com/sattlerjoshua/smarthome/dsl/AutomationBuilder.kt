package com.sattlerjoshua.smarthome.dsl

class AutomationBuilder {
    var name = ""
    var triggers = arrayListOf<Trigger>()
    var tasks = arrayListOf<Task>()

    fun build(): Automation {
        return Automation(name, triggers, tasks)
    }
}
