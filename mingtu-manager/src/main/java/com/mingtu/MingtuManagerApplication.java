package com.mingtu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.mingtu.common.mapper")//注意MapperScan要导tk的包，不然会报NoSuchMethodException
/*修改启动类，继承SpringBootServletInitializer类并重写configure方法 */
public class MingtuManagerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MingtuManagerApplication.class, args);
	}

//	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MingtuManagerApplication.class);
	}
}
