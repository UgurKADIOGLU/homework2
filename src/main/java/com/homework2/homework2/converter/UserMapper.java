package com.homework2.homework2.converter;

import com.homework2.homework2.dto.ProductPutResponseDto;
import com.homework2.homework2.dto.UserPutRequestDto;
import com.homework2.homework2.dto.UserPutResponseDto;
import com.homework2.homework2.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
    UserMapper INSTANCE=Mappers.getMapper(UserMapper.class);
    User map(UserPutRequestDto userPutRequestDto);
    UserPutResponseDto map(User user);
}
