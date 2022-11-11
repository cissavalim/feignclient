package com.example.demo.client;

import com.example.demo.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "demo", url = "${feign.client.config.demo.uri}",
            configuration = FeignConfig.class)
public interface Client {

    @GetMapping
    String getAdvice();

}
