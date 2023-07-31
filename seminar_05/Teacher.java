package seminar_05;

public class Teacher {
    private String name;
    private String subject;
    private Integer teacher_id;

    public String getName(){
        return name;
    }

    public String getSubject(){
        return subject;
    }

    public int getTeacher_id(){
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id){
        this.teacher_id = teacher_id;
    }
}
