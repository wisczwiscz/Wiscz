package com.bookstore.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@TableName("book")
public class Book {
    
    @TableId(type = IdType.AUTO)
    private Long id;
    
    private String name;
    
    private String author;
    
    private String category;
    
    private BigDecimal price;
    
    private String description;
    
    private Integer favoriteCount;
    
    private LocalDateTime createTime;
    
    private LocalDateTime updateTime;
} 