package spring5_componentscan.di;

@SuppressWarnings("serial")
public class DupulicateMemberException extends RuntimeException{

	public DupulicateMemberException(String message) {
		super(message);
	}
}
