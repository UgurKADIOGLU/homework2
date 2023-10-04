package com.homework2.homework2.converter;

import com.homework2.homework2.dto.ProductPutRequestDto;
import com.homework2.homework2.dto.ProductPutResponseDto;
import com.homework2.homework2.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductMapper {
    ProductMapper INSTANCE= Mappers.getMapper(ProductMapper.class);
    Product map(ProductPutRequestDto productPutRequestDto);
    ProductPutResponseDto map(Product product);

}
