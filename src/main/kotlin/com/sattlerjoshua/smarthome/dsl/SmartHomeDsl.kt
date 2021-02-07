package com.sattlerjoshua.smarthome.dsl

fun home(name: String, init: HomeBuilder.() -> Unit): Home {
    return HomeBuilder().apply { this.name = name }.apply(init).build();
}

fun HomeBuilder.room(name: String, init: GroupBuilder.() -> Unit) {
    groups.add(GroupBuilder().apply { this.name = name }.apply(init).build())
}

fun HomeBuilder.room(init: GroupBuilder.() -> Unit) {
    groups.add(GroupBuilder().apply(init).build())
}

fun HomeBuilder.group(name: String, init: GroupBuilder.()-> Unit) {
    groups.add(GroupBuilder().apply { this.name = name }.apply(init).build())
}

fun HomeBuilder.group(init: GroupBuilder.()-> Unit) {
    groups.add(GroupBuilder().apply(init).build())
}

fun GroupBuilder.device(name: String, init: DeviceBuilder.() -> Unit) {
    devices.add(DeviceBuilder().apply { this.name = name }.apply(init).build())
}

fun GroupBuilder.device(init: DeviceBuilder.() -> Unit){
    devices.add(DeviceBuilder().apply(init).build())
}
