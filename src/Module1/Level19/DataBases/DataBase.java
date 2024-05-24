package Module1.Level19.DataBases;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    String name = "База данных клиентов";
    Map<String, Integer> clients = new HashMap<>();
    private static DataBase INSTANCE;

    private DataBase() {
    }

    public static DataBase getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DataBase();
        }
        return INSTANCE;
    }
}
