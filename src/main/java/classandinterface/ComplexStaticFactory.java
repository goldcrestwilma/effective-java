package classandinterface;

public class ComplexStaticFactory {

    private final double real;
    private final double imaginary;

    private ComplexStaticFactory(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static ComplexStaticFactory valueOf(double real, double imaginary) {
        return new ComplexStaticFactory(real, imaginary);
    }

    public double realPart() {
        return real;
    }

    public double imaginaryPart() {
        return imaginary;
    }

    public ComplexStaticFactory plus(ComplexStaticFactory complex) {
        return new ComplexStaticFactory(real + complex.real, imaginary + complex.imaginary);
    }

    public ComplexStaticFactory minus(ComplexStaticFactory complex) {
        return new ComplexStaticFactory(real - complex.real, imaginary - complex.imaginary);
    }

    public ComplexStaticFactory times(ComplexStaticFactory complex) {
        return new ComplexStaticFactory(real * complex.real - imaginary * complex.imaginary,
                                        real * complex.imaginary + imaginary * complex.real);
    }

    public ComplexStaticFactory dividedBy(ComplexStaticFactory complex) {
        double tmp = complex.real * complex.real + complex.imaginary * complex.imaginary;
        return new ComplexStaticFactory((real * complex.real + imaginary * complex.imaginary) / tmp,
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

        ComplexStaticFactory complex = (ComplexStaticFactory) o;

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
