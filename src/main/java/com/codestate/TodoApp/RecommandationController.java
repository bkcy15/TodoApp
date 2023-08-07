package com.codestate.TodoApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommandationController {
    @GetMapping("/")
    public String helloworld(){
        return "To-do Application !";
    }
}
