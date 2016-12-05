import java.util.DoubleSummaryStatistics;

/**
 * Created by turge on 006 06.10.16.
 * Класс со степика для задания
 *
 * Дан класс ComplexNumber. Переопределите в нем методы equals()
 * и hashCode() так, чтобы equals() сравнивал экземпляры ComplexNumber
 * по содержимому полей re и im, а hashCode() был бы
 * согласованным с реализацией equals().
 */
public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public int hashCode() {
        int prime = 28;
        int result = 1;
        long reToBits = Double.doubleToLongBits(re);
        long imToBits = Double.doubleToLongBits(im);
        result = prime * result + (int) (reToBits - (reToBits >>> 32));
        result = prime * result + (int) (imToBits - (imToBits >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        ComplexNumber other = (ComplexNumber) object;
        if (re != other.getRe())
            return false;
        if (im != other.getIm())
            return false;
        return true;
    }
}
