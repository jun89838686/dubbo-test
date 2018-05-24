package com.dubbo.user.core.service.impl;

import com.dubbo.user.api.entity.User;
import com.dubbo.user.api.face.IUserService;
import com.dubbo.user.core.dao.UserMapper;
import com.dubbo.user.core.service.support.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jun
 * @since 2018-04-25
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User> implements IUserService {
	
}
