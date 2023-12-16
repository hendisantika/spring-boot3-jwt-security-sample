package com.hendisantika.springboot3jwtsecuritysample.repository;

import com.hendisantika.springboot3jwtsecuritysample.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot3-jwt-security-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/16/23
 * Time: 08:34
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface TokenRepository extends JpaRepository<Token, Integer> {

    @Query(value = """
            select t from Token t inner join User u\s
            on t.user.id = u.id\s
            where u.id = :id and (t.isExpired = false or t.isRevoked = false)\s
            """)
    List<Token> findAllValidTokensByUser(Integer id);

    Optional<Token> findByToken(String token);
}
