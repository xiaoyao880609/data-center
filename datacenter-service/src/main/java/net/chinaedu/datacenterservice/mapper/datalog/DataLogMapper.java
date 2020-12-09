package net.chinaedu.datacenterservice.mapper.datalog;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import net.chinaedu.datacentercore.domain.DataLog;

@Mapper
public interface DataLogMapper extends BaseMapper<DataLog> {
    List<DataLog> listAll();
}
