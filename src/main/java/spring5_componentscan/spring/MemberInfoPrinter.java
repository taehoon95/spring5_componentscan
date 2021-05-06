package spring5_componentscan.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberInfoPrinter {

	@Autowired
	private MemberDao memDao;
	@Autowired
	private MemberPrinter printer;
	
	public void printMemberInfo(String email) {
		Member member = memDao.selectByEmail(email);
		if(member == null) {
			throw new MemberNotFoundException("데이터 없음");
		}
		printer.print(member);
		System.out.println();
	}
	
}
