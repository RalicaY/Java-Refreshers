public class Count_Duplicate_Characters {
	public static void main(String[] args) {
        String myChars = new String();		
        for (int i=0; i < args.length; ++i) {
           //  System.out.println(args[i]);
	    myChars = myChars.concat(args[i]);
	}
	String matched = new String();
	System.out.println(myChars);
	for (int j=0; j<myChars.length(); ++j) {
		for (int k=0; k < myChars.length(); ++k) {
	        	if (myChars.charAt(j) == myChars.charAt(k) & k!=j) 
				 {       
					
					for (int n=0; n<matched.length(); ++n) {
					       if (matched.charAt(n) != myChars.charAt(k)) 	
                                 	{System.out.println("Found duplicate: " + myChars.charAt(j));}}
					// System.out.println("myChars.charAt(j) is " + myChars.charAt(j));
					// System.out.println("myChars.charAt(k) is " + myChars.charAt(k));
					 matched = matched + myChars.charAt(j);
					// System.out.println("matched contains so far: " + matched);		 
				 } 
		} 

	} 
        }
	}

