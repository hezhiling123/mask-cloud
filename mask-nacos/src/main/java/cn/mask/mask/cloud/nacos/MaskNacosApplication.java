package cn.mask.mask.cloud.nacos;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.boot.SpringApplication;

@DubboService(group = "dev", version = "1.0.0")
public class MaskNacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(MaskNacosApplication.class, args);
    }

}
