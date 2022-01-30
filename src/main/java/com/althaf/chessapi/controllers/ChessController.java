package com.althaf.chessapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChessController {
    
    @GetMapping("/getOpeningFen")
    public String getFenForChessOpening(@RequestParam String openingName){
            return "Success";
    }

}
