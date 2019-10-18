package com.imooc.coupon.service;


import com.imooc.coupon.constant.CouponStatus;
import com.imooc.coupon.entity.Coupon;
import com.imooc.coupon.exception.CouponException;

import java.util.List;

/**
 * Redis相关操作服务
 *
 * @author mai.gq
 * @name Greyson
 * @date 2019/10/17
 */
public interface IRedisService {
    /**
     * 根据用户id和优惠券状态返回缓存列表数据
     *
     * @param userId 用户id
     * @param status {@link CouponStatus} 优惠券状态
     * @return {@link Coupon}
     */
    List<Coupon> getCachedCoupons(Long userId, Integer status);

    /**
     * 保存空的优惠券列表到缓存
     *
     * @param userId 用户id
     * @param status 优惠券状态列表
     */
    void saveEmptyCouponListToCache(Long userId, List<Integer> status);

    /**
     * 尝试从Cache中获取一个优惠码
     *
     * @param templateId 优惠券模板id
     * @return 优惠券码
     */
    String tryToAcquireCouponCodeFromCache(Integer templateId);

    /**
     * 将优惠券保存到Cache中
     * @param userId 用户Id
     * @param coupons {@link Coupon}
     * @param status 优惠券状态
     * @return 保存成功个数
     * @throws CouponException
     */
    Integer addCouponToCache(Long userId, List<Coupon> coupons, Integer status) throws CouponException;

}
