package com.zhuzb.gitee.domain;

import lombok.Data;

import java.util.Date;

/**
 * @Author: 朱政彬
 * @Date: 2020/6/9 23:51
 * @Description:
 */
@Data
public class LogDefine {
    private Long logId;
    private String logInfo;
    private Date createTime;
    private Date lastModifyTime;
}
