package com.homework2.homework2.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.homework2.homework2.entities.Product;
import com.homework2.homework2.entities.User;
import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommentSaveRequest {
    Long productId;
    Long userId;
    String text;
}
