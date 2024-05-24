package Module1.Level19.DataBases;

public class SalesDep {
    public void makeWork() {
        DataBase dataBase = DataBase.getInstance();
        dataBase.clients.put("Ирина Сидорова", 353664);
        dataBase.clients.put("Галина Кузнецова", 45675876);
    }
}
