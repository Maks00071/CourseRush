package Module1.Level19.DataBases;

public class TranportDep {
    public void makeWork() {
        DataBase dataBase = DataBase.getInstance();
        dataBase.clients.put("Иван Иванов", 35634645);
        dataBase.clients.put("Петр Петров", 394855839);
    }
}
