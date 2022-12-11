public class ComplexNumbers {
	// Complete this class
    private int real;
    private int imaginary;
    
    public ComplexNumbers(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    public void plus(ComplexNumbers c) {
        this.real = this.real + c.real;
        this.imaginary = this.imaginary + c.imaginary;
    }
    
    public void multiply(ComplexNumbers c) {
        int real = (this.real * c.real) - (this.imaginary * c.imaginary);
        int imaginary = (this.real * c.imaginary) + (this.imaginary * c.real);
        this.real = real;
        this.imaginary = imaginary;
    }
    
    public void print() {
        System.out.print(this.real + " + i" + this.imaginary);
    }
	
}