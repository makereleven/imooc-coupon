package com.imooc.coupon.converter;

import com.imooc.coupon.constant.ProductLine;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * 生产线属性转换器
 * @author mai.gq
 * @name Greyson
 * @date 2019/10/12
 */
@Converter
public class ProductLineConverter implements AttributeConverter<ProductLine, Integer> {


    @Override
    public Integer convertToDatabaseColumn(ProductLine productLine) {
        return productLine.getCode();
    }

    @Override
    public ProductLine convertToEntityAttribute(Integer integer) {
        return ProductLine.of(integer);
    }
}

