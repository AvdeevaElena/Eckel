package Chapter18.Task28;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class BlipCheck implements Externalizable {

    public void writeExternal(ObjectOutput out)
            throws IOException {
        System.out.println("BlipCheck writeExternal");
    }
    public void readExternal(ObjectInput in)
            throws IOException, ClassNotFoundException {
        System.out.println("BlipCheck readExternal");
    }
}