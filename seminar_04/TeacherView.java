package seminar_04;

import java.util.Scanner;

public class TeacherView {
    private TeacherService teacherService;
    private Scanner scanner;

    public TeacherView(){
        this.teacherService = new TeacherService();
        this.scanner = new Scanner(System.in);
    }

    public void run(){
        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("Учительская система");
            System.out.println("1. Создать учителя");
            System.out.println("2. Отредактировать учителя");
            System.out.println("3. Отобразить список учителей");
            System.out.println("4. Выход");
            System.out.println();

            System.out.println("Выберите опцию");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                createTeacher();
                break;
                case 2:
                editTeacher();
                break;
                case 3:
                displayTeachers();
                break;
                case 4:
                running = false;
                break;
                default:
                System.out.println("ERROR");
            }

        }
    }

    private void createTeacher(){
        System.out.println("Введите имя учителя");
        String name = scanner.nextLine();
        System.out.println("Введите предмет который он преподает");
        String subject = scanner.nextLine();

        teacherService.createTeacher(name, subject);
    }

    private void editTeacher(){
        System.out.println("Введите номер учителя для редактирования");
        int index = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите новое имя учителя");
        String name = scanner.nextLine();
        System.out.println("Введите новый предмет");
        String subject = scanner.nextLine();

        teacherService.editTeacher(index - 1, name, subject);

    }

    private void displayTeachers(){
        teacherService.displayTeachers();
    }
}
