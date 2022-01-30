package com.althaf.chessapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChessOpeningsController {

    @GetMapping("/getopeningFen")
    public String getOpeningFen(@RequestParam String opening) {

        switch (opening) {
            case "RUY_LOPEZ":
                return "RuyLopez";
            default:
                return "Failure";
        }

    }
}
