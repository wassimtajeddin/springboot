package com.example.springboot;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Vector;

@RestController("/names")
public class PersonController {
    List<String> names = new Vector<>();
    @GetMapping("/{id}")
    String getANme(@PathVariable int id){
        return names.get(id);

    }

    @GetMapping
    List<String> getNames(){
        return names;
    }
    @PostMapping
String addName (@RequestBody String name){
        names.add(name);
        return name;
    }
    @GetMapping("/lang")
    String preferredLanguage(@RequestHeader(HttpHeaders.ACCEPT_LANGUAGE)String lang){
        return lang;
    }
}
