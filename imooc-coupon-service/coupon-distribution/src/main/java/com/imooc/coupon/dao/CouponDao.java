package com.imooc.coupon.dao;

import com.imooc.coupon.constant.CouponStatus;
import com.imooc.coupon.entity.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author mai.gq
 * @name Greyson
 * @date 2019/10/17
 */

public interface CouponDao extends JpaRepository<Coupon, Integer> {
    /**
     * 根据用户id和优惠券状态查找
     * @param userId 用户id
     * @param status {@link CouponStatus} 优惠券状态
     * @return {@link Coupon}
     */
    List<Coupon> findAllByUserIdAndStatus(Long userId, CouponStatus status);
}
