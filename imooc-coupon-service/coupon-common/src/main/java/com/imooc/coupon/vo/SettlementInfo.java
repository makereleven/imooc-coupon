package com.imooc.coupon.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 结算信息对象定义
 * @author mai.gq
 * @name Greyson
 * @date 2019/10/18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SettlementInfo {
    /**
     * 用户id
     */
    private Long userId;

    /**
     * 商品信息
     */
    private List<GoodsInfo> goodsInfos;

    /**
     * 是否使结算生效，即核销（true:核销，false:结算)
     */
    private Boolean employ;

    /**
     * 结果结算金额
     */
    private Double cost;

    /**
     * 优惠券列表
     */
    private List<CouponAndTemplateInfo> couponAndTemplateInfos;

    /**
     * 优惠券和模板信息
     */
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CouponAndTemplateInfo {
        private Integer id;
        private CouponTemplateSDK template;

    }
}
