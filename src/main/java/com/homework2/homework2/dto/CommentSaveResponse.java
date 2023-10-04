package com.homework2.homework2.dto;

import com.homework2.homework2.entities.Product;
import com.homework2.homework2.entities.User;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommentSaveResponse {
    Long id;
    Long productId;
    Long userId;
    String text;
}
