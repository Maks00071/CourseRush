package Module2.Level28.Lesson.CreateDevice;

public class OpticalSplitter extends Splitter {
    String mode;
    int fiberLength;
    SplitBoard splitBoard;

    public OpticalSplitter(String name, Label label) {
        super(name, label);
        // создаем композицию - жесткую связь, т.е. OpticalSplitter управляет жизненным циклом SplitBoard
        splitBoard = new SplitBoard();
    }
}
