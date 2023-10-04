package com.homework2.homework2.converter;

import com.homework2.homework2.dto.CommentSaveRequest;
import com.homework2.homework2.dto.CommentSaveResponse;
import com.homework2.homework2.dto.ProductPutRequestDto;
import com.homework2.homework2.dto.ProductPutResponseDto;
import com.homework2.homework2.entities.Comment;
import com.homework2.homework2.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CommentMapper {
    CommentMapper INSTANCE= Mappers.getMapper(CommentMapper.class);
    @Mapping(target = "product.id", source = "productId")
    @Mapping(target = "user.id", source = "userId")
    Comment map(CommentSaveRequest commentSaveRequest);
    @Mapping(target = "productId", source = "product.id")
    @Mapping(target = "userId", source = "user.id")
    CommentSaveResponse map(Comment comment);
}
