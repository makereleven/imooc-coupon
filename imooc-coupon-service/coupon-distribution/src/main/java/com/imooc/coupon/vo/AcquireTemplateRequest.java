package com.imooc.coupon.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 获取优惠券请求定义
 *
 * @author mai.gq
 * @name Greyson
 * @date 2019/10/17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AcquireTemplateRequest {

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 优惠券模板信息
     */
    private CouponTemplateSDK templateSDK;
}
