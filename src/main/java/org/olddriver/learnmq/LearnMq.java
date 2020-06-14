package org.olddriver.learnmq;

/**
 * 20200607
 * part 1
 */
public class LearnMq {
    /*
     * 消息(Message)
     * 消息指应用间传递的数据
     * 简单消息可以是字符串，json等
     *
     * 消息队列中间件(Message Queue Middleware)
     * 消息队列中间件作为独立运行的服务端程序，负责接收存储转发消息
     * RabbitMQ是多种消息队列产品中的一种
     *
     * RabbitMQ
     * RabbitMQ服务器采用erlang开发，实现AMQP协议(Advanced Message Queuing Protocol)
     * RabbitMQ模型
     * Producer 生产者，负责生产消息
     * Consumer 消费者，负责消费消息
     * Broker 中介，RabbitMQ服务实例
     * Connection   链接，Producer，Consumer与Broker通信，必须建立链接
     * Channel  通道
     * Exchange 交换机
     */
}
