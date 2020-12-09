package net.chinaedu.datacenterprovider.datalog;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.chinaedu.datacentercore.domain.DataLog;
import net.chinaedu.datacenterprovider.feignclient.DataLogFeignClient;
import net.chinaedu.datacenterservice.service.datalog.IDataLogService;

@Controller
@RequestMapping("datalog")
public class DataLogController {
    @Autowired
    private IDataLogService dataLogService;
    @Autowired
    private DataLogFeignClient dataLogFeignClient;

    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        try {
            Random random= new Random();
            for (int i=1;i<=10000000;i++) {
                int  dataType = random.nextInt(10) + 1;
                DataLog log = new DataLog();
                log.setId(UUID.randomUUID().toString());
                log.setDataType(dataType);
                log.setRemark("this is " + dataType + " remark");
                log.setCreateTime(new Date());
                if (dataLogService.save(log)) {
                    dataLogFeignClient.save(log);
                }
            }
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "fail";
    }
}
