package com.najim.rabbit.service.impl;

import com.najim.rabbit.entity.User;
import com.najim.rabbit.mapper.UserMapper;
import com.najim.rabbit.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author NaJim
 * @since 2021-10-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
