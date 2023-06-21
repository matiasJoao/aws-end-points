package com.example.awsProject.controller;

import com.example.awsProject.DTO.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping("/main")
public class Controller {
    private final Logger log = Logger.getLogger(Controller.class.getName());
    @GetMapping("/get/{name}")
    public ResponseEntity<?> main(@PathVariable String name){
        log.info("message send {"+ name+"}");
        return ResponseEntity.ok("Name: "+ name);
    }
    @PostMapping("/post")
    public ResponseEntity<?> post(@RequestBody ResponseDTO responseDTO){
        log.info("body of {"+ responseDTO + "}");
        ResponseEntity res = ResponseEntity.status(HttpStatus.OK).body(responseDTO);
        return  res;
    }
}
