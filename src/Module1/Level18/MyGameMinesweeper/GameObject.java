package Module1.Level18.MyGameMinesweeper;

/*
Так как в нашей игре будут использоваться игровые объекты (ячейки), создадим для их
описания отдельный класс "GameObject".
 */
public class GameObject {
    public int x;
    public int y;
    public boolean isMine; //является ли ячейка миной
    public int countMineNeighbors; //количество "заминированных" соседей ячейки

    public GameObject(int x, int y, boolean isMine) {
        this.x = x;
        this.y = y;
        this.isMine = isMine;
    }
}