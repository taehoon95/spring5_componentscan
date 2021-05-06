package spring5_componentscan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring5_componentscan.di.MemberDao;
import spring5_componentscan.di.MemberPrinter;

@Configuration
public class Appconf1 {
	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}

	@Bean
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}
}
