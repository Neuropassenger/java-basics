import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.IllegalFormatException;
import java.util.Objects;

/**
 * Created by turge on 013 13.10.16.
 */
public class DeserializeByteArrayApp {
    public static void main(String[] args) {

    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(data);
        try {
            ObjectInputStream oIn = new ObjectInputStream(inputStream);
            int sizeObjectArray = oIn.readInt();

            Animal[] animalArray = new Animal[sizeObjectArray];

            for (int i = 0; i < sizeObjectArray; i++)
                animalArray[i] = (Animal) oIn.readObject();

            return animalArray;
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
}

class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }
}
