package spring5_componentscan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring5_componentscan.di.ChangePasswordService;
import spring5_componentscan.di.MemberDao;
import spring5_componentscan.di.MemberInfoPrinter;
import spring5_componentscan.di.MemberListPrinter;
import spring5_componentscan.di.MemberPrinter;
import spring5_componentscan.di.MemberRegisterService;
import spring5_componentscan.di.VersionPrinter;

@Configuration
public class AppCtx {

	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}
	
	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService(/* memberDao() */);
	}

	@Bean
	public ChangePasswordService changePwdSvc() {
		ChangePasswordService pwdSvc = new ChangePasswordService();
//		pwdSvc.setMemberDao(memberDao());
		return pwdSvc;
	}

	@Bean
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}

	@Bean
	public MemberListPrinter memberListPrinter() {
		return new MemberListPrinter(/* memberDao(), memberPrinter() */);
	}
	
	@Bean
	public MemberInfoPrinter memberInfoPrinter() {
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
//		infoPrinter.setMemDao(memberDao());
//		infoPrinter.setPrinter(memberPrinter());
				
		return infoPrinter;
	}
	
	@Bean
	public VersionPrinter versionPrinter() {
		VersionPrinter versionPrinter = new VersionPrinter();
		versionPrinter.setMajorVersion(5);
		versionPrinter.setMinorVersion(0);
		return versionPrinter;
	}
	/*
	 * @Bean public selectService showList() { selectService list = new
	 * selectService(); list.setMemberDao(memberDao()); return list; }
	 */
	
}
