package Module1.Level19.DataBases;

public class TopManager {
    public static void main(String[] args) {
        TranportDep tranportDep1 = new TranportDep();
        tranportDep1.makeWork();

        SalesDep salesDep1 = new SalesDep();
        salesDep1.makeWork();

        DataBase dataBase = DataBase.getInstance();
        System.out.println(dataBase.clients);
    }
}
