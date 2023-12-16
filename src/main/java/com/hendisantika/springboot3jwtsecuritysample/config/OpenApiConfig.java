package com.hendisantika.springboot3jwtsecuritysample.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot3-jwt-security-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/16/23
 * Time: 08:45
 * To change this template use File | Settings | File Templates.
 */
@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Hendi Santika",
                        email = "hendisantika@yahoo.co.id",
                        url = "https://s.id/hendisantika/"
                ),
                description = "OpenApi documentation for Spring Security",
                title = "OpenApi specification - Hendi Santika",
                version = "1.0",
                license = @License(
                        name = "Licence name",
                        url = "https://some-url.com"
                ),
                termsOfService = "Terms of service"
        ),
        servers = {
                @Server(
                        description = "Local ENV",
                        url = "http://localhost:8081"
                ),
                @Server(
                        description = "PROD ENV",
                        url = "https://www.linkedin.com/id/hendisantika/"
                )
        },
        security = {
                @SecurityRequirement(
                        name = "bearerAuth"
                )
        }
)
@SecurityScheme(
        name = "bearerAuth",
        description = "JWT auth description",
        scheme = "bearer",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        in = SecuritySchemeIn.HEADER
)
public class OpenApiConfig {
}
