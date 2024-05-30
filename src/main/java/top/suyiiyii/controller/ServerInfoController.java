package top.suyiiyii.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.suyiiyii.dto.ServerInfoDto;

@RestController
public class ServerInfoController {

    @GetMapping("/server_info")
    ServerInfoDto serverInfo() {
        ServerInfoDto info = new ServerInfoDto();
        info.setMessage("SpringBoot101 server by suyiiyii.");
        return info;
    }
}
