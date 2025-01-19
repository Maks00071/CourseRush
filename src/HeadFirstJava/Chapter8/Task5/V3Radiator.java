package HeadFirstJava.Chapter8.Task5;

import java.util.ArrayList;


public class V3Radiator {

    V3Radiator(ArrayList lglist) {
        //super(lglist);
        for (int x = 0; x < 10; x++) {
            lglist.add(new SimUnit("V3Radiator"));
        }
    }
}
