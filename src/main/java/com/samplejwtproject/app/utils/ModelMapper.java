package com.samplejwtproject.app.utils;

import org.springframework.stereotype.Component;

import com.samplejwtproject.app.dtos.UserDto;
import com.samplejwtproject.app.entities.UserEntity;



@Component
public class ModelMapper {
	
	public UserEntity mapToUserEntity(UserDto userDto) {
		return new UserEntity(userDto.getId(), userDto.getUsername(), userDto.getPassword());
	}
	
	public UserDto mapToUserDto(UserEntity userEntity) {
		return new UserDto(userEntity.getId(), userEntity.getUsername(), userEntity.getPassword());
	}
}
