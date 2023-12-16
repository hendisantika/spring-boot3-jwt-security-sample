package com.hendisantika.springboot3jwtsecuritysample.config;

import com.hendisantika.springboot3jwtsecuritysample.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot3-jwt-security-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/16/23
 * Time: 08:46
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {

    private final UserRepository repository;
}
