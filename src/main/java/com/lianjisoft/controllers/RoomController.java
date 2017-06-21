package com.lianjisoft.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Rooms controller.
 */
@RequestMapping("/rooms")
@Controller
public class RoomController {

    @RequestMapping("/")
    String index() {
        return "rooms";
    }
}
