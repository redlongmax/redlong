package com.itlaobing.mapper;
import com.itlaobing.entity.User;
import org.springframework.stereotype.Repository;
@Repository
public interface UserMapper {
    /**
     * 保存用户对象到数据库中并返回受SQL影响的纪录数目
     * @param user 需要被保存的对象
     * @return
     */
    int save( User user );
}