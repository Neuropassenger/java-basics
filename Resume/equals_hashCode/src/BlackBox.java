/**
 * Created by turge on 006 06.10.16.
 * Класс с overriding методами equals() и hashCode()
 */
public class BlackBox {
    int varA;
    int varB;

    BlackBox(int varA, int varB) {
        this.varA = varA;
        this.varB = varB;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + varA;
        result = prime * result + varB;
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
        BlackBox other = (BlackBox) object;
        if (varA != other.varA)
            return false;
        if (varB != other.varB)
            return false;
        return true;
    }
}
