package top.suyiiyii;

import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

    @GetMapping("/health")
    String health() {
        return "OK";
    }

    @GetMapping("/server_info")
    ServerInfo serverInfo() {
        ServerInfo info = new ServerInfo();
        info.setMessage("SpringBoot101 server by suyiiyii.");
        return info;
    }

    @Data
    public static class ServerInfo {
        private String message;
    }

}
