package com.hendisantika.springboot3jwtsecuritysample.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot3-jwt-security-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/16/23
 * Time: 08:36
 * To change this template use File | Settings | File Templates.
 */
@Getter
@Setter
@Builder
public class AuthenticationRequest {
    private String email;
    private String password;
}
