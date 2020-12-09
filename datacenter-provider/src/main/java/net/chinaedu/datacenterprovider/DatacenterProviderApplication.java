package net.chinaedu.datacenterprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"net.chinaedu"})
@MapperScan(basePackages = {"net.chinaedu.datacenterservice.mapper"})
@EnableFeignClients
public class DatacenterProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatacenterProviderApplication.class, args);
	}

}
