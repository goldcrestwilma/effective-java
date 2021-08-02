package classandinterface;

public class Complex {

    private final double real;
    private final double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double realPart() {
        return real;
    }

    public double imaginaryPart() {
        return imaginary;
    }

    public Complex plus(Complex complex) {
        return new Complex(real + complex.real, imaginary + complex.imaginary);
    }

    public Complex minus(Complex complex) {
        return new Complex(real - complex.real, imaginary - complex.imaginary);
    }

    public Complex times(Complex complex) {
        return new Complex(real * complex.real - imaginary * complex.imaginary,
                           real * complex.imaginary + imaginary * complex.real);
    }

    public Complex dividedBy(Complex complex) {
        double tmp = complex.real * complex.real + complex.imaginary * complex.imaginary;
        return new Complex((real * complex.real + imaginary * complex.imaginary) / tmp,
                           (imaginary * complex.real - real * complex.imaginary) / tmp);
    }

    @Override
    public String toString() {
        return "Complex{" +
            "real=" + real +
            ", imaginary=" + imaginary +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Complex complex = (Complex) o;

        if (Double.compare(complex.real, real) != 0) {
            return false;
        }
        return Double.compare(complex.imaginary, imaginary) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(real);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(imaginary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
