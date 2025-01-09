public class ComplexNumber extends RealNumber{
    
    public double imaginary;
    public ComplexNumber(){
        super(1.0);
        imaginary = 1.0;
        
    }
    public ComplexNumber(double a, double b){
        super(a);
        imaginary = b;
    }

    @Override
    public String toString(){
        return super.toString() + "\nImaginaryPart: "+ imaginary;
    }
}
