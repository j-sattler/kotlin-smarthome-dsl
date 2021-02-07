SmartHome Kotlin DSL
===
Goal of this project is to model a smart home using type-safe builders in kotlin.

Motivation
---
Learn how to use [type-safe builders](https://kotlinlang.org/docs/reference/type-safe-builders.html) in kotlin to create
easy to use DSLs.

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

    group("Smart Plugs") {
        device {
            id = "SP1"
            name = "Philips Smart Plug"
        }
        device {
            id = "SP2"
            name = "Ikea Smart Plug"
        }
    }

    automation("Fetch Weather Information") {

        startOn {
            name = "person enters room"
        }

        execute {
            name = "GET https://weatherinfo.com/berln"
        }
    }
}
```

JSON output:

```json
{
  "id": "H1",
  "name": "Joshua's Home",
  "groups": [
    {
      "id": "R1",
      "name": "Living Room",
      "subgroups": [
      ],
      "devices": [
        {
          "id": "D1",
          "name": "Philips Hue Light Strip"
        }
      ]
    },
    {
      "id": "R2",
      "name": "Bedroom",
      "subgroups": [
      ],
      "devices": [
        {
          "id": "D2",
          "name": "Philips Hue Motion Sensor"
        },
        {
          "id": "D3",
          "name": "Ceiling Light"
        }
      ]
    },
    {
      "id": "",
      "name": "Smart Plugs",
      "subgroups": [
      ],
      "devices": [
        {
          "id": "SP1",
          "name": "Philips Smart Plug"
        },
        {
          "id": "SP2",
          "name": "Ikea Smart Plug"
        }
      ]
    }
  ],
  "automations": [
    {
      "name": "Fetch Weather Information",
      "triggers": [
        {
          "name": "person enters room"
        }
      ],
      "tasks": [
        {
          "name": "GET https://weatherinfo.com/berln"
        }
      ]
    }
  ]
}
```
