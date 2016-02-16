
public class quadraticEquation {
	private double a;
	private double b;
	private double c;

	quadraticEquation(double coeff1, double coeff2, double coeff3){
		a=coeff1;
		b=coeff2;
		c=coeff3;
	}
	
	public double getA(){
		return a;
	}

	public double getB(){
		return b;
	}

	public double getC(){
		return c;
	}

	public void getSolution(){
		double w;
		double x;
		w=((b*b)-4*a*c);
			if(w<0){
				System.out.println("There is no solution.");
				}	
			else if(w==0){
				x=Math.sqrt(w);
				System.out.println((-b + x)/(2*a));
				}
			else{
				x=Math.sqrt(w);
				System.out.println((-b + x)/(2*a));
				System.out.println((-b - x)/(2*a));
			}
			return;	
	}	
}
