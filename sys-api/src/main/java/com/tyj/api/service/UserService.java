package com.tyj.api.service;

import com.tyj.api.entity.User;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;


import java.util.Iterator;

/**
 * Created by tyj on 2019/03/01.
 */

@CacheConfig(cacheNames = "areas")
public interface UserService {
    /** 删除 */
    public void delete(int id);
    /** 增加*/
    public void insert(User user);
    /** 更新*/
    public int update(User user);
    /** 查询单个*/
    @Cacheable(key = "#p0")
    public User selectById(int id);
    /** 查询全部列表*/
    @Cacheable(value="areas-list", key = "#p0+-+#p1")
    public Iterator<User> selectAll(int pageNum, int pageSize);
}
