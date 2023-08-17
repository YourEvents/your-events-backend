package com.yourevents.controller

import com.yourevents.model.Event
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class EventController {

    @QueryMapping
    fun eventById(@Argument id: Long): Event {
        return Event(id)
    }
}