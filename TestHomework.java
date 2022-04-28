public class TestHomework{
	public static void main(String[] args) {
		int a=4,b=5;
		String word;
		byMethod m = new byMethod();
		int result = m.method(a, b);
		System.out.println("By Method A+B = "+ result);
		System.out.println("===============================================");
		
		byConstructor con = new byConstructor("What's up Doc!!!");
		System.out.println("I said: "+con.y);
		System.out.println("===============================================");
		
		byReferenceVariable Var = new byReferenceVariable();
        Var.GG();
  }
}