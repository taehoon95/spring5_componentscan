package spring5_componentscan.spring;

@SuppressWarnings("serial")
public class MemberNotFoundException extends RuntimeException{

	public MemberNotFoundException() {
	}

	public MemberNotFoundException(String message) {
		super(message);
	}

	
}
