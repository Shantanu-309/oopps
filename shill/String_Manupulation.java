package com.Skill;

public class String_Manupulation {
	class CharLength {
	    public static void main(String[] args) {
	        String s = "java programs";
	        System.out.println("charAt(2): " + s.charAt(2));  
	        System.out.println("length(): " + s.length());    
	    }
	}

	// 2. Substring & Extraction
	class SubstringExample {
	    public static void main(String[] args) {
	        String s = "Hello World";
	        System.out.println(s.substring(5));         
	        System.out.println(s.substring(2, 7));       
	    }
	}

	// 3. Search & Index
	class SearchIndex {
	    public static void main(String[] args) {
	        String s = "Hello world";
	        System.out.println(s.indexOf(""));        // 2
	        System.out.println(s.lastIndexOf("na"));    // 4
	        System.out.println(s.contains("nan"));      // true
	    }
	}

	// 4. Case Conversion
	class CaseConversion {
	    public static void main(String[] args) {
	        String s = "hello world";
	        System.out.println(s.toUpperCase());   
	        System.out.println(s.toLowerCase());   
	    }
	}

	// 5. Trimming & Whitespace
	class TrimWhitespace {
	    public static void main(String[] args) {
	        String s = "  Hello  ";
	        System.out.println("[" + s.trim() + "]");     
	    }
	}

	// 6. Replace & Modify
	class ReplaceModify {
	    public static void main(String[] args) {
	        String s = "ababab";
	        System.out.println(s.replace('a', 'x'));         
	        System.out.println(s.replace("ab", "xy"));     
	        System.out.println(s.replaceAll("a.", "z"));    
	        System.out.println(s.replaceFirst("ab", "xy")); 
	    }
	}

	// 7. Comparison
	class StringComparison {
	    public static void main(String[] args) {
	        String a = "Java";
	        String b = "java";
	        System.out.println(a.equals(b));             
	        System.out.println(a.equalsIgnoreCase(b));   
	        System.out.println(a.compareTo(b));          
	    }
	}


	// 8. Creation & Joining
	class StringJoinExample {
	    public static void main(String[] args) {
	        String a = "Hello";
	        String b = "World";
	        System.out.println(a.concat(" ").concat(b));  // Hello World
	        String joined = String.join("-", "A", "B", "C");
	        System.out.println(joined);  // A-B-C
	    }
	}

	// 9. Conversion
	class ConversionExample {
	    public static void main(String[] args) {
	        String s = "Java";
	        char[] chars = s.toCharArray();
	        for (char c : chars) System.out.print(c + " ");
	        System.out.println();
	        byte[] bytes = s.getBytes();
	        for (byte b : bytes) System.out.print(b + " ");
	    }
	}


	// 10. Using StringBuilder
	class StringBuilderExample {
	    public static void main(String[] args) {
	        StringBuilder sb = new StringBuilder("Hello");
	        sb.append(" World");
	        sb.insert(5, " Java");
	        sb.delete(0, 5);
	        sb.replace(0, 4, "Hi");
	        sb.reverse();
	        System.out.println(sb);  // Output varies
	    }
	}

	public class ConcatenateStrings {
	    public static void main(String[] args) {
	        String first = "Hello";
	        String second = "World";
	        String result = first + " " + second;
	        System.out.println("Concatenated: " + result);
	    }
	}

	public class SubstringExample {
	    public static void main(String[] args) {
	        String s1 = "JavaProgramming";
	        String sub = s1.substring(4, 11); // "Program"
	        System.out.println("Substring: " + sub);
	    }
	}
	public class ReplaceExample {
	    public static void main(String[] args) {
	        String sentence = "I like C";
	        String newSentence = sentence.replace("C", "java");
	        System.out.println("After Replace: " + newSentence);
	    }
	}

	public class SplitExample {
	    public static void main(String[] args) {
	        String s = "apple,banana,grape,orange";
	        String[] fruits = s.split(",");
	        for(String fruit : fruits) {
	            System.out.println(fruit);
	        }
	    }
	}
	public class TrimExample {
	    public static void main(String[] args) {
	        String raw = "   Welcome to Java!   ";
	        System.out.println("Before Trim: [" + raw + "]");
	        System.out.println("After Trim: [" + raw.trim() + "]");
	    }
	}
}
