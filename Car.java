class Car {
	private int year ;
	private String make ;
	private double speed ;
	
	Car (int y , String m , double s){
		this.year = y ;
		this.make = m ;
		this.speed = s ;
		
	}
	
	void getYear() {
		System.out.println(this.year);
	}
	
	void getSpeed() {
		System.out.println(this.speed);
	}
	
	void getMake() {
		System.out.println(this.make);
	}
	
	void accelerate(){
		this.speed ++ ;
	}
}