package com.sattlerjoshua.smarthome.dsl


// Home DSL extension + receiver functions (Entry Point)
fun home(name: String, init: HomeBuilder.() -> Unit): Home {
    return HomeBuilder().apply { this.name = name }.apply(init).build();
}


// Room DSL extension + receiver functions
fun HomeBuilder.room(name: String, init: GroupBuilder.() -> Unit) {
    groups.add(GroupBuilder().apply { this.name = name }.apply(init).build())
}

fun HomeBuilder.room(init: GroupBuilder.() -> Unit) {
    groups.add(GroupBuilder().apply(init).build())
}


// Group DSL extension + receiver functions
fun HomeBuilder.group(name: String, init: GroupBuilder.()-> Unit) {
    groups.add(GroupBuilder().apply { this.name = name }.apply(init).build())
}

fun HomeBuilder.group(init: GroupBuilder.()-> Unit) {
    groups.add(GroupBuilder().apply(init).build())
}


// Device DSL extension + receiver functions
fun GroupBuilder.device(name: String, init: DeviceBuilder.() -> Unit) {
    devices.add(DeviceBuilder().apply { this.name = name }.apply(init).build())
}

fun GroupBuilder.device(init: DeviceBuilder.() -> Unit){
    devices.add(DeviceBuilder().apply(init).build())
}


fun HomeBuilder.automation(name: String, init: AutomationBuilder.() -> Unit){
    automations.add(AutomationBuilder().apply { this.name = name }.apply(init).build())
}

fun AutomationBuilder.startOn(init: TriggerBuilder.() -> Unit){
    triggers.add(TriggerBuilder().apply(init).build())
}

fun AutomationBuilder.execute(init: TaskBuilder.() -> Unit){
    tasks.add(TaskBuilder().apply(init).build())
}
