package net.chinaedu.datacenterapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"net.chinaedu"})
@MapperScan(basePackages = {"net.chinaedu.datacenterservice.mapper"})
public class DatacenterApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatacenterApiApplication.class, args);
	}

}
