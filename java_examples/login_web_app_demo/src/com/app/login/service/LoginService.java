package com.app.login.service;

import com.app.exception.BusinessException;
import com.app.user.User;


public interface LoginService {

	boolean isValidUserCredentials(User user) throws BusinessException;
}
