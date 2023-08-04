package seminar_06;
import java.util.List;
public class TeacherController {
    private TeacherService teacherService;
    private TeacherView teacherView;

    public TeacherController(){
        teacherService = new TeacherService();
        teacherView = new TeacherView();
    }

    public void createTeacher(String name, String subject){
        teacherService.createTeacher(name, subject);
    }

    public void editTeacher(int index, String name, String subject){
        teacherService.editTeacher(index,name, subject);
    }
    public void displayAllTeachers(){
        List<Teacher> teachers = teacherService.getAllTeachers();
        teacherView.displayTeachers(teachers);
    }
    
}
