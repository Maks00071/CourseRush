package Module1.Level23.Tasks.CanNotClose;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class MyStream extends ByteArrayInputStream {

    public MyStream(byte[] buf) {
        super(buf);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Метод close() вызван!");
        super.close();
    }
}
