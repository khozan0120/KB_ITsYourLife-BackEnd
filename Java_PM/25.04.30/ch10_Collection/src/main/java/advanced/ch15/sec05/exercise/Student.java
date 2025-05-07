package advanced.ch15.sec05.exercise;

public class Student implements Comparable<Student> {

    public int no;
    public String name;
    public  String email;
    public String gitmail;

    public Student(int no, String name, String email, String gitmail) {
        this.no = no;
        this.name = name;
        this.email = email;
        this.gitmail = gitmail;
    }

    @Override
    public int compareTo(Student o) {
        if(this.no < o.no) {
            return -1;
        } else if (this.no == o.no) {
            return 0;
        } else return 1;
    }
}
