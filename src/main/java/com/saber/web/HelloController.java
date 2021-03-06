package com.saber.web;

import com.saber.pojo.People;
import com.saber.service.peopleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@Slf4j
@RestController
@RequestMapping("people")
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private peopleService peopleservice;

    @GetMapping("hello.do")
    public String hello(){
        log.debug("66666666");
        System.out.println("hello method is running");
        return "hello,Spring boot"+dataSource;
    }

    @GetMapping("{id}")
    public People fun(@PathVariable("id") Integer id){
        return peopleservice.queryByid(id);
    }

}
