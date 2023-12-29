package dev.commandos.apiexception.controller;

import dev.commandos.apiexception.exception.BadRequestException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/api/{id}")
    public void getMember(@PathVariable String id){
        if(id.equals("admin")){
            throw new IllegalArgumentException("관리자는 안돼요");
        } else if(id.equals("bad")){
            throw new BadRequestException("옳지 않은 요청!!");
        }
    }

}
