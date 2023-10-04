package com.homework2.homework2.dto;

import com.homework2.homework2.entities.UserRole;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserPutResponseDto {
    private long id;
    private String userName;
    private String email;
    private String telephoneNumber;
    private UserRole userRole;
}
