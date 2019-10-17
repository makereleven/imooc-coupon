package com.imooc.coupon.converter;

import com.imooc.coupon.constant.CouponCategory;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * 优惠券分类属性转换器
 * AttributeConverter<X,Y>
 * X:实体类属性类型
 * Y:数据库字段类型
 * @author mai.gq
 * @name Greyson
 * @date 2019/10/12
 */
@Converter
public class CouponCategoryConverter implements AttributeConverter<CouponCategory, String> {

    /**
     * 将实体类X属性转换为数据库字段属性Y，插入和更新数据
     * @param couponCategory
     * @return
     */
    @Override
    public String convertToDatabaseColumn(CouponCategory couponCategory) {
        return couponCategory.getCode();
    }

    /**
     * 将数据库字段属性Y转换为实体类X属性，读取数据
     * @param s
     * @return
     */
    @Override
    public CouponCategory convertToEntityAttribute(String s) {
        return CouponCategory.of(s);
    }
}
