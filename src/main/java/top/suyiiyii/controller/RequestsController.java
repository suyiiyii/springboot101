package top.suyiiyii.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import top.suyiiyii.utlis.JwtUtils;

@RestController
public class RequestsController {

    @Value("${jwt.secret}")
    private String secret;

    @GetMapping("/request")
    Boolean request(@RequestHeader("Authorization") String jwt) {
        if (jwt == null || jwt.isEmpty()) {
            throw new IllegalArgumentException("Authorization header is missing");
        }
        jwt = jwt.replace("Bearer ", "");
        JwtUtils.parseToken(jwt, secret);

        return true;
    }
}
