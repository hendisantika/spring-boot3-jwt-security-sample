package com.hendisantika.springboot3jwtsecuritysample.service;

import com.hendisantika.springboot3jwtsecuritysample.entity.Token;
import com.hendisantika.springboot3jwtsecuritysample.exception.InvalidTokenException;
import com.hendisantika.springboot3jwtsecuritysample.exception.TokenNotFoundException;
import com.hendisantika.springboot3jwtsecuritysample.repository.TokenRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot3-jwt-security-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/16/23
 * Time: 08:43
 * To change this template use File | Settings | File Templates.
 */
@Service
@RequiredArgsConstructor
public class LogoutService implements LogoutHandler {

    private final TokenRepository tokenRepository;

    @Override
    public void logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {
        final String authorization = request.getHeader("Authorization");

        if (authorization == null) {
            throw new InvalidTokenException("Token is missing");
        } else if (!authorization.startsWith("Bearer ")) {
            throw new InvalidTokenException("Token is invalid");
        }

        final String jwt = authorization.substring(7);

        Token storedToken = tokenRepository.findByToken(jwt)
                .orElseThrow(() -> new TokenNotFoundException("Token not found"));

        if (storedToken != null) {
            storedToken.setIsExpired(true);
            storedToken.setIsRevoked(true);
            tokenRepository.save(storedToken);
            SecurityContextHolder.clearContext();
        }
    }
}
