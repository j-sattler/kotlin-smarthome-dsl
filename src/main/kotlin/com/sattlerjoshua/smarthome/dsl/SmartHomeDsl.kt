package com.sattlerjoshua.smarthome.dsl

fun home(name: String, init: HomeBuilder.() -> Unit): Home{
    return HomeBuilder().apply(init).build();
}

fun HomeBuilder.room(name: String, init: GroupBuilder.() -> Unit){
    groups.add(GroupBuilder().apply(init).build())
}

fun GroupBuilder.device(init: DeviceBuilder.()->Unit){
    devices.add(DeviceBuilder().apply(init).build())
}
