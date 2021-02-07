package com.sattlerjoshua.smarthome.dsl

import org.junit.jupiter.api.Test

class SmartHomeDslTests {

    @Test
    fun `Build Smart Home with DSL`(){
        println("Hello World")
        home("Joshua's Home") {
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
        }
    }
}
