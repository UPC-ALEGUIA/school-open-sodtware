package com.example.school.domain.interfaces.services;

import com.example.school.domain.dtos.LoginUserDto;

public interface IUserService {

    LoginUserDto GetLogin(String userName, String password, String type); // type = student | teacher | employee

}
