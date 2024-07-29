package Module2.Level3.Lesson.InterfaceStudent;

class StudentImpl implements Student {
    private String name;

    public StudentImpl(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
