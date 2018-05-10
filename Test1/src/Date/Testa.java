package Date;

public class Testa {
	public static void main(String[] args) {
		Sun s=new Sun();
		s.add();
		s.up(s);
		Father f=new Sun();
		f.add();
		f.up(s);
	}
}
