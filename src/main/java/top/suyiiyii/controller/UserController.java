package top.suyiiyii.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import top.suyiiyii.utlis.JwtUtils;

@RestController
public class UserController {

    @Value("${jwt.secret}")
    private String secret;

    @PostMapping("/login")
    public LoginResponse login(@ModelAttribute LoginForm form) {
        LoginResponse response = new LoginResponse();
        response.setAccess_token(JwtUtils.generateToken(form.getUsername(), secret));
        response.setToken_type("Bearer");
        return response;

    }

    @Data
    public static class LoginForm {
        private String grant_type;
        private String username;
        private String password;
    }

    @Data
    public static class LoginResponse {
        private String access_token;
        private String token_type;
    }
}
