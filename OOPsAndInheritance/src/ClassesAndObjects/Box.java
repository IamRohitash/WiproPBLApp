package ClassesAndObjects;

public class Box {
	double width,hight,lenght;
	Box(double width,double hight,double lenght){
	
		this.width=width;
		this.hight=hight;
		this.lenght=lenght;
	}
	public double Volume() {
		double val=width*hight*lenght;
		return val;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box obj=new Box(3.5,7.5,8.6);
		double val=obj.Volume();
		System.out.println("The valume of Box is:"+val);

}
}
