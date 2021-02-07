package com.sattlerjoshua.smarthome.dsl

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.junit.jupiter.api.Test

class SmartHomeDslTests {

    @Test
    fun `Build Smart Home with DSL`(){
        val json = Json{ prettyPrint = true}

        val home = home("Joshua's Home") {
            id = "H1"
            room("Living Room") {
                id = "R1"
                device {
                    id = "D1"
                    name = "Philips Hue Light Strip"
                }
            }
            room("Bedroom") {
                id = "R2"
                device {
                    id = "D2"
                    name = "Philips Hue Motion Sensor"
                }
                device {
                    id = "D3"
                    name = "Ceiling Light"
                }
            }

            group("Smart Plugs"){
                device {
                    id = "SP1"
                    name = "Philips Smart Plug"
                }
                device {
                    id = "SP2"
                    name = "Ikea Smart Plug"
                }
            }
        }

        println(json.encodeToString(home))
    }
}
