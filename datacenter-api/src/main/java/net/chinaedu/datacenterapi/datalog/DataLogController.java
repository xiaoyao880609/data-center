package net.chinaedu.datacenterapi.datalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.chinaedu.datacentercore.domain.DataLog;
import net.chinaedu.datacenterservice.service.datalog.IDataLogService;

@RestController
@RequestMapping("datalog")
public class DataLogController {
    @Autowired
    private IDataLogService dataLogService;

    @RequestMapping("/save")
    public String save(@RequestBody DataLog dataLog){
        try {
            if (dataLogService.save(dataLog)) {
                return "success";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "fail";
    }
}
