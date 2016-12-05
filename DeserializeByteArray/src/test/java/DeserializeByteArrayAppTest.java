import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import static org.junit.Assert.*;

/**
 * Created by turge on 013 13.10.16.
 */
public class DeserializeByteArrayAppTest {
    @Test
    public void deserializeAnimalArray() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream oOut = new ObjectOutputStream(out);
        Animal[] srcArray = new Animal[3];
        Animal[] result;
        srcArray[0] = new Animal("Cat");
        srcArray[1] = new Animal("Dog");
        srcArray[2] = new Animal("Elephant");

        oOut.writeInt(3);
        oOut.writeObject(srcArray[0]);
        oOut.writeObject(srcArray[1]);
        oOut.writeObject(srcArray[2]);

        DeserializeByteArrayApp main = new DeserializeByteArrayApp();
        result = main.deserializeAnimalArray(out.toByteArray());

        assertEquals(true, srcArray[0].equals(result[0]));
        assertEquals(true, srcArray[1].equals(result[1]));
        assertEquals(true, srcArray[0].equals(result[0]));
    }

}