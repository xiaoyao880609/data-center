package net.chinaedu.datacenterservice.service.datalog;

import net.chinaedu.datacentercore.domain.DataLog;

public interface IDataLogService {

    boolean save(DataLog dataLog);
}
