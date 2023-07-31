package seminar_05;

import java.util.List;



public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setTeacher_id(1);
        List<Student> students = List.of(new Student(), new Student(), new Student());

        Controller controller = new Controller(null);

        StudyGroup studyGroup = controller.Create_All(teacher, students);

        System.out.println("Teacher ID:     " + studyGroup.getTeacher_id());

        for (Student student : students) {

            System.out.println("Student ID:     " + studyGroup.getStudent_id());
        }

    }
}
