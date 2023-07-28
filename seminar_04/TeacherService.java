package seminar_04;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {

    private List teachers;

    public TeacherService(){
        this.teachers = new ArrayList();
    }

    public void createTeacher(String name, String subject){
        Teacher teacher = new Teacher(name, subject, 0);
        teachers.add(teacher);
        System.out.println("Учитель создан");
    }

    public void editTeacher(int index, String name, String subject){
        if (index >= 0 && index < teachers.size()) {
            Teacher teacher = (Teacher) teachers.get(index);
            teacher.setName(name);
            teacher.setSubject(subject);
            System.out.println("Учитель отредактирован");
        }
        else{
            System.out.println("ERROR");
        }
    }

    public void displayTeachers(){
        if(teachers.isEmpty()){
            System.out.println("Список учителей пуст");
        }
        else{
            System.out.println("Список учителей");
            for(int i = 0; i < teachers.size(); i++){
                Teacher teacher = (Teacher) teachers.get(i);
                System.out.println((i + 1) + "." + teacher.getName() + "-" + teacher.getSubject());
            }
        }
    }
}