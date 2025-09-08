package com.finance.tracker.service;

import com.finance.tracker.dto.UserRequestDto;
import com.finance.tracker.dto.UserResponseDto;

public interface UserService {

    UserResponseDto createUser(UserRequestDto userRequestDto);

    UserResponseDto getUserById(Long id);

    UserResponseDto updateUser(Long id, UserRequestDto userRequestDto);

    void deleteUser(Long id);
}
