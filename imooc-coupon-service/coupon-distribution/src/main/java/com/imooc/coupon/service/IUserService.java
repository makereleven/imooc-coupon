package com.imooc.coupon.service;

import com.imooc.coupon.entity.Coupon;
import com.imooc.coupon.exception.CouponException;
import com.imooc.coupon.vo.AcquireTemplateRequest;
import com.imooc.coupon.vo.CouponTemplateSDK;
import com.imooc.coupon.vo.SettlementInfo;

import java.util.List;

/**
 * 用户服务接口定义
 *
 * @author mai.gq
 * @name Greyson
 * @date 2019/10/17
 */
public interface IUserService {
    /**
     * 根据用户id和优惠券状态查询优惠券信息
     *
     * @param userId 用户id
     * @param status 优惠券状态
     * @return {@link Coupon}s
     * @throws CouponException
     */
    List<Coupon> findCouponByStatus(Long userId, Integer status) throws CouponException;


    /**
     * 根据用户id可以领取到优惠券
     *
     * @param userId 用户id
     * @return {@link CouponTemplateSDK}s
     * @throws CouponException
     */
    List<CouponTemplateSDK> findAvailbleTemplate(Long userId) throws CouponException;

    /**
     * 用户领取优惠券
     *
     * @param request {@link AcquireTemplateRequest}
     * @return {@link Coupon}
     * @throws CouponException
     */
    Coupon acquireTemplate(AcquireTemplateRequest request) throws CouponException;

    /**
     * 结算（核销)优惠券
     *
     * @param info {@link SettlementInfo}
     * @return {@link SettlementInfo}
     * @throws CouponException
     */
    SettlementInfo settlement(SettlementInfo info) throws CouponException;
}
