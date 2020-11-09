package io.seata.sample;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;

/**
 * 库存服务
 * @author wangzhongxiang
 */
@SpringBootApplication
@MapperScan("io.seata.sample.dao")
@EnableAutoDataSourceProxy
public class StorageServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StorageServerApplication.class, args);
	}

}
