package String;

public class String1 {

	public static void main(String[] args) {
		
String s1= "java program";
String s2 = "Amin";

System.out.println(s1.toUpperCase());
System.out.println(s1.toLowerCase());
System.out.println(s1.charAt(6));    //r
System.out.println(s1.endsWith("a"));  // false
System.out.println(s1.endsWith("m"));   // true
System.out.println(s1.equals(s1));      // true    // here we can use object name also
System.out.println(s1.equals(s2)); // false
System.out.println(s2.concat(" sayyad"));            // amin sayyad // joining statement 
System.out.println(s1.concat(" "+s2));      // join 
System.out.println(s2.compareToIgnoreCase("p"));
System.out.println(s1.contains("p"));   // true       // this letter contain or not
System.out.println(s1.contains("z"));    // false
System.out.println(s1.contentEquals(s2));


	}

}
