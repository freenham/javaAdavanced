package javaAdvanced;

public class Students {
	String name;
	String number;
	int birthYear;
	
	
	public static void main(String[] args) {
		Students s1 = new Students();
		s1.name = "홍길동";
		s1.number = "1234";
		s1.birthYear = 1995;
		
		Students s2 = new Students();
		s2.name = "홍길동";
		s2.number = "1234";
		s2.birthYear=1995;
		
		if(s1.equals(s2)) 
			System.out.println("s1 == s2");
		else
			System.out.println("s1 != s2");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1);
		System.out.println(s1.toString());
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Students [name=" + name + ", number=" + number + ", birthYear=" + birthYear + "]";
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

}
