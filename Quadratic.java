package second;

public class Quadratic {

    public static void main(String[] args) { 
        double x= Double.parseDouble(args[0]);
        
        double y = Double.parseDouble(args[1]);
        
        double equation = x*x +4.0*y;
        double sqrt= Math.sqrt(equation);
        double firstroot= (-x+sqrt)/2.0;
        double secondroot= (-x-sqrt)/2.0;
        
        System.out.println(firstroot);
        System.out.println(secondroot);


  
    }
		
	}


	

