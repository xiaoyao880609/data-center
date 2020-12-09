package net.chinaedu.datacenterprovider.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import net.chinaedu.datacentercore.domain.DataLog;

@FeignClient(qualifier = "dataLogFeignClient", name = "datacenter-provider", url = "http://172.16.94.128:8081")
public interface DataLogFeignClient {

    @PostMapping("/datalog/save")
    public String save(@RequestBody DataLog dataLog);
}
