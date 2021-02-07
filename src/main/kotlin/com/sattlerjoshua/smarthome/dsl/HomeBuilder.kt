package com.sattlerjoshua.smarthome.dsl

class HomeBuilder {
    lateinit var id:String
    lateinit var name: String
    lateinit var groups: ArrayList<Group>

    fun build(): Home{
        return Home(id, name, groups)
    }
}
