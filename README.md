SmartHome Kotlin DSL
===
Goal of this project is to model a smart home using type-safe builders in kotlin.

Motivation
---
Learn how to use [type-safe builders](https://kotlinlang.org/docs/reference/type-safe-builders.html) in kotlin to create easy to use DSLs.

Example
---

```kotlin
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
```
