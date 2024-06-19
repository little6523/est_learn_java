import java.util.Objects;

public class Student {
    int no;
    String name;

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return no == student.no && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, name);
    }
}
