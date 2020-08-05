package hello;

public class Javatest {
	private static volatile Javatest javatest;
	private Javatest(){}
	public static Javatest getjavatest() {
		if (null==javatest) {
			synchronized(Javatest.class) {
				javatest=new Javatest();
			}
		}
		return javatest;
	}
}
