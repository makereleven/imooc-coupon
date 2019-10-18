package com.imooc.coupon.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;

import java.util.function.Consumer;

/**
 * Kafka相关接口定义
 *
 * @author mai.gq
 * @name Greyson
 * @date 2019/10/17
 */
public interface IKafkaService {
    /**
     * 消费优惠券Kafka消息
     * @param record {@link ConsumerRecord}
     */
    void consumeCouponKafkaMassage(ConsumerRecord<?, ?> record);
}
