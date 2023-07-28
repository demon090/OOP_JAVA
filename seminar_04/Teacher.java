package seminar_04;

public class Teacher {

    private String name;
    private String subject;
    private Integer index;


    public Teacher(String name, String subject, int index) {
    }

    public Integer getIndex(){
        return index;
    }

    public void setIndex(){
        this.index = index;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject(){
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
