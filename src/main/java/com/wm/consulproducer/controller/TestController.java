package com.wm.consulproducer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 王锰
 * @date 11:16 2019/6/4
 */
@RestController
@Slf4j
public class TestController {

    @GetMapping("/{id}")
    public String get1(@PathVariable("id") String id) {
        log.info("进入producer，id:{}",id);
        return "hello" + id;
    }
}
