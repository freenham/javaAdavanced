package javaAdvanced;

public class StringBufferExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("world");
		
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("hello").append("sb2도 계속 축척되나보네");
		if(sb2 == sb3)
			System.out.println("sb2 == sb3");
		System.out.println(sb2);
		System.out.println(sb3);
		
		String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
		System.out.println(str2);
		
	}

}
