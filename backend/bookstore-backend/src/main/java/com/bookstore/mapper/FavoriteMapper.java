package com.bookstore.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bookstore.entity.Favorite;
import org.apache.ibatis.annotations.Mapper;
 
@Mapper
public interface FavoriteMapper extends BaseMapper<Favorite> {
} 