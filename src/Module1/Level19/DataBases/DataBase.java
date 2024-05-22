package Module1.Level19.DataBases;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    String name = "База данных клиентов";
    Map<String, Integer> clients = new HashMap<>();
    private static final DataBase INSTANCE = new DataBase();

    private DataBase() {

    }

    public static DataBase getInstance() {
        return INSTANCE;
    }
}
