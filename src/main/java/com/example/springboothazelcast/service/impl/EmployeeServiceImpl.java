package com.example.springboothazelcast.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboothazelcast.dao.EmployeeMapper;
import com.example.springboothazelcast.entity.Employee;
import com.example.springboothazelcast.service.IEmployeeService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author loulvlin
 * @since 2020-11-04
 */
@Service
@CacheConfig(cacheNames = "employees")
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {


    @Override
//    @Cacheable
    public List<Employee> list() {
        return this.baseMapper.selectList(Wrappers.emptyWrapper());
    }
}
