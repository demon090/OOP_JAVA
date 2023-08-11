package seminar_07;

public class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex Add(Complex other){
        double realSum = this.real + other.real;
        double imaginarySum = this.imaginary + other.imaginary;

        return new Complex(realSum, imaginarySum);
    }

    public Complex Multiply(Complex other){
        double realProduct = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryProduct = this.real * other.imaginary + this.imaginary * other.real;

        return new Complex(realProduct, imaginaryProduct);
    }

    public Complex divide(Complex other){
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double realQuotient = (this.real * other.real + this.imaginary * other.imaginary) / denominator;

        return new Complex(realQuotient, realQuotient);
    }

    @Override

    public String toString(){
        if (imaginary >= 0) {
            return real + "+" + imaginary + "i";
        }
        else{
            return real + "-" + Math.abs(imaginary) + "i";
        }
    }
}
