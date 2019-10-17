package com.imooc.coupon.dao;

import com.imooc.coupon.entity.CouponTemplate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CouponTemplateDao extends JpaRepository<CouponTemplate, Integer> {
    /**
     * 根据模板名称查询模板
     * @param name
     * @return
     */
    CouponTemplate findByName(String name);

    /**
     * 根据可用状态和是否过期查询模板
     * @param available
     * @param expired
     * @return
     */
    List<CouponTemplate> findAllByAvailableAndExpired(Boolean available,Boolean expired);

    /**
     * 根据是否过期查询模板
     * @param expired
     * @return
     */
    List<CouponTemplate> findAllByExpired(Boolean expired);
}
