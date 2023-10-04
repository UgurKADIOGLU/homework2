package com.homework2.homework2.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductPutRequestDto {
    private long id;
    private String productName;
}
