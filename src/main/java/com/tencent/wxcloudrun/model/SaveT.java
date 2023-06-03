package com.tencent.wxcloudrun.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class SaveT implements Serializable {

  private Object object;

  private Integer baiyu;

  private Integer caiyu;

  private Integer tiaozhan;
}
