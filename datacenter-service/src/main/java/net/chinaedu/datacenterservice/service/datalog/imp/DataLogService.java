package net.chinaedu.datacenterservice.service.datalog.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.chinaedu.datacentercore.domain.DataLog;
import net.chinaedu.datacenterservice.mapper.datalog.DataLogMapper;
import net.chinaedu.datacenterservice.service.datalog.IDataLogService;

@Service
public class DataLogService implements IDataLogService {

    @Autowired
    private DataLogMapper dataLogMapper;

    @Override
    public boolean save(DataLog dataLog) {
        return dataLogMapper.insert(dataLog) > 0;
    }

}
