class latihan1{
	
	public static void main(String[] args){
		short x = 6;
		int y = 4;
		int z;
		float a = 12.5f;
		float b = 7f;
	
	//ini contoh komentar 1 baris
		System.out.println("x = " +x+ ",y ="+y);
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " +(x - y));
		System.out.println("x *  y = " + (x*y));
		System.out.println("x / y = " +(x/y));
		System.out.println("x % y = " + (x%y));
		
	
	/* 
	 ini contoh komentar lebih 1 bari
	 lebih 1 baris
	 */
		
		System.out.println("a = " +a + ",b ="+b);
		System.out.println("a / b = " + (a/b));
		
		
		//contoh  salah jika tidak dicasting
		System.out.println("contoh casting dibawah ini" + "    adalah merupakan");
		//perhatikan sebelumnya z bernilai integer namun ada isian 7.0
		z=(int)7.2/3;
		System.out.println("nilai z =" +z);
		
	}
}