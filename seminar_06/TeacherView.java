package seminar_06;

import java.util.List;

public class TeacherView {
     void displayTeachers(List<Teacher> teachers){
        for (Teacher teacher : teachers) {
            System.out.println("Name:   " + teacher.getName() + ", Subject: " + teacher.getSubject() );
        }
    }
}
