public class IT26102460Lab2Q1{
	
	public static void main(String[] args){
		
		int Perimeter = 100;
		//Perimeter= 2*(length+width)
		//L=length, w=width, P=Perimeter
		//100=2*(L+w)
		//w=0.75*length or w=3/4*length
		
		//100=2*(L+0.75*L)
		//100=2*(L*(1+0.75))
		//L= 100/2*(1+0.75)
		double length= 2.0*Perimeter/7.0; 
		double width=3.0*length/4.0;
		System.out.println("Length is: "+ length);
		System.out.println("Width is:" + width);
	}
}