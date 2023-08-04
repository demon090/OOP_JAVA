package seminar_06;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List teachers;

    public TeacherService(){
        teachers = new ArrayList<Teacher>();
    }

    public void createTeacher(String name, String subject){
        Teacher teacher = new Teacher(name, subject, 0);
        teachers.add(teacher);
        System.out.println("Учитель создан");
    }

    public void editTeacher(int index, String name, String subject){
        
            Teacher teacher = (Teacher) teachers.get(index);
            teacher.setName(name);
            teacher.setSubject(subject);   
    }

    public List<Teacher> getAllTeachers(){
        return teachers;
    }
}
