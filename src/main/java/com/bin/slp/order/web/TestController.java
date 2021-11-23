package com.bin.slp.order.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * mall-order
 * test
 *
 * @author hons.chang
 * @since 2021/11/23 1:38 下午
 **/
@RequestMapping(value = "/test")
@RestController
public class TestController {

    @GetMapping(value = "/test1")
    public String test1() {
        return "success";
    }
}
