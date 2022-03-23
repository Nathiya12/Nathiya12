package topics.java;
enum Level {
	BEGINNER(1), INTERMEDIATE(2), ADVANCED(3);
	 int a;
	Level(int a) {
		this.a = a;
	}
}
public class EnumANDEnumMethods {
	
public static void main(String[] args) {
		
		Level l1 = Level.BEGINNER;
		Level l2 = Level.INTERMEDIATE;
		Level l3 = Level.ADVANCED;
		System.out.println("============================");
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		System.out.println("==============================");
		System.out.println(l1.a);
		System.out.println(l2.a);
		System.out.println(l3.a);
	  System.out.println("==============================");	
		Level[]lvl = Level.values();
		for(int i =0;i<lvl.length;i++) {
			System.out.println(lvl[i]);
		}
		System.out.println("==============================");
		System.out.println(l1.ordinal());
		System.out.println(l2.ordinal());
		System.out.println(l3.ordinal());
		System.out.println("==============================");
		System.out.println(l1.valueOf("BEGINNER"));
		
		System.out.println(l2.name());
}
	
	
	
	

}
