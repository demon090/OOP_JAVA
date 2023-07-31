package seminar_05;

import java.util.List;

public class StudyGroupService {
    public static StudyGroup Create_Study(Teacher teacher, List<Student> students){
        StudyGroup studyGroup = new StudyGroup(teacher, students);
        return studyGroup;
    }
}
