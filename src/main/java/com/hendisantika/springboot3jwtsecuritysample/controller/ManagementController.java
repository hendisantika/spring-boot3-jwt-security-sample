package com.hendisantika.springboot3jwtsecuritysample.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot3-jwt-security-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/16/23
 * Time: 08:51
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/api/v1/management")
@Tag(name = "Management")
public class ManagementController {
    @PostMapping
    public String post() {
        return "POST:: management controller";
    }
}
