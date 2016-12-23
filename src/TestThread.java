
public class TestThread {
public static void main(String[] args) {
	MyThreadEven even = new  MyThreadEven();
	MyThreadOdd odd = new MyThreadOdd();
	even.start();
	odd.start();
}
}
