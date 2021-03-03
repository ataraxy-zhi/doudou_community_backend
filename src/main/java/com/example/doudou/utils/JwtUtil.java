package com.example.doudou.utils;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.util.*;

/**
 * @ClassName JwtUtil
 * @Description
 * @Author
 * @Date 2021/3/3 19:23
 */
public class JwtUtil {
    private static final Logger logger = LoggerFactory.getLogger(JwtUtil.class);

    public static final long EXPIRATION_TIME = 3600_000_000L;
    public static final String SECRET = "ThisIsASecret";
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String USER_NAME = "userName";

    public static String generateToken(String userId) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(USER_NAME, userId);
        String jwt = Jwts.builder()
                .setClaims(map)
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS512, SECRET)
                .compact();
        return jwt;
    }
}
