package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.Counter;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SaveTMapper {
  Object getObject(@Param("id") Integer id);

  void upsertCount(Counter counter);

  void clearCount(@Param("id") Integer id);
}
