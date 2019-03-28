class stringmethods {
	String s  =" java";
	String s1 ="code ";
	public static void main(String[] args){
	stringmethods sm = new stringmethods(); //printing a string
        System.out.println(sm.s);
        System.out.println("*******");
		// string concating using + operator
		System.out.println(sm.s+""+sm.s1);
		// using concat()
		String joinstring = sm.s.concat(sm.s1);
		System.out.println(joinstring);
		System.out.println("*******");
		// changing the cases of string
		System.out.println(sm.s.toUpperCase());
		System.out.println(sm.s1.toLowerCase());
		System.out.println("*******");
		//unicode value of character in a string
        System.out.println(joinstring.codePointAt(0));
        System.out.println(joinstring.codePointBefore(3));
        System.out.println("*******");

	   //for comparing two strings
		System.out.println(joinstring.equals("javacode"));
		System.out.println(joinstring.equals("java"));
		System.out.println("*******");
		// startsWith
		System.out.println(joinstring.startsWith("ja"));
		System.out.println(joinstring.startsWith("va"));
		System.out.println("*******");
		//endsWith
		System.out.println(joinstring.endsWith("de"));
		System.out.println(joinstring.endsWith("va"));
		System.out.println("*******");
		//substring
		System.out.println(joinstring.substring(3));
        System.out.println(joinstring.substring(2,6));
        System.out.println(joinstring.substring(0));
        System.out.println("*******");
        // remove whitespaces at extence ends a given string
        System.out.println(joinstring.trim());
        System.out.println("*******");
        // split a string
        String[] k=joinstring.split("a");
        for (int i=0;i<k.length ;i++ ) {
        System.out.println(k[i]);
        }


	}
}