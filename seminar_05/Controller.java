package seminar_05;

import java.util.List;

public class Controller {
    private StudyGroupService studyGroupService;

    public Controller(StudyGroupService studyGroupService){
        this.studyGroupService = new StudyGroupService();
    }

    public StudyGroup Create_All(Teacher teacher, List<Student> students){
        return studyGroupService.Create_Study(teacher, students);
    }
}
