package dev.commandos.apiexception.controller;

import dev.commandos.apiexception.exception.BadRequestException;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExceptionHandlerController {

    /*@ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(IllegalArgumentException.class)
    public ApiResponse illegalExHandle(IllegalArgumentException e) {
        return new ApiResponse("BAD", e.getMessage());
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler
    public ApiResponse exHandle(Exception e) {
        return new ApiResponse("EX", "내부 오류");
    }*/

    @GetMapping("/api/v2/{id}")
    public void getMember(@PathVariable String id){
        if(id.equals("admin")){
            throw new IllegalArgumentException("관리자는 안돼요");
        } else if(id.equals("bad")){
            throw new BadRequestException("옳지 않은 요청!!");
        }
    }
}
