package io.seata.sample;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;

/**
 * 订单服务
 * @author wangzhongxiang
 */
@SpringBootApplication
@MapperScan("io.seata.sample.dao")
@EnableDiscoveryClient
@EnableFeignClients
@EnableAutoDataSourceProxy
public class OrderServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServerApplication.class, args);
	}

}
