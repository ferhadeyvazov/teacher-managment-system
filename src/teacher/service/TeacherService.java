package teacher.service;

import student.entity.Student;
import teacher.entity.Teacher;
import common.MyServices;

import java.util.Scanner;

import static common.Db.students;
import static common.Db.teachers;

public class TeacherService extends MyServices {


    @Override
    public void initialize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nece nefer mellim daxil edirsen?");
        int count = sc.nextInt();
        sc.nextLine();
        teachers = new Teacher[count];
        for (int i = 0; i < count; i++) {
            teachers[i] = requireAndCreate();
        }
        printAll();
    }

    @Override
    public void createNew() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Neçə nəfər müəllim yaratmaq istəyirsiz?");
        int newCount = sc.nextInt();
        Teacher[] newTeachers = new Teacher[teachers.length + newCount];
        for (int i = 0; i < teachers.length; i++) {
            newTeachers[i] = teachers[i];
        }
        for (int i = teachers.length; i < newTeachers.length; i++) {
            newTeachers[i] = requireAndCreate();
        }
        teachers = newTeachers;
    }

    @Override
    public void printAll() {
        if (teachers != null) {
            System.out.println("Qeydiyyatdan keçen mellimler: ");
            for (Teacher teacher : teachers) {
                System.out.println(teacher.toString());
            }
        } else {
            System.out.println("Mellim yoxdur...");
        }
    }

    @Override
    public void update() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Necenci xanada duran müəllimi yeniləmək istəyirsiz?");
        Teacher updatedIndex = teachers[sc.nextInt() - 1];
        sc.nextLine();
        System.out.println("Hansi xananı update etmek isteyirsiniz? name, surname age");
        String updatedName = sc.nextLine();
        System.out.print("Yeni sozu daxil edin: ");
        String newText = sc.nextLine();
        switch (updatedName.trim().toLowerCase()) {
            case "name" -> updatedIndex.setFirstname(newText);
            case "surname" -> updatedIndex.setSurname(newText);
            case "age" -> updatedIndex.setAge(Byte.parseByte(newText));
            default -> System.out.println("Düzgün xana daxil edin...");
        }
    }

    @Override
    public void delete() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Necenci mellimi silmek isteyirsiz?");
        teachers[sc.nextByte() - 1] = null;
    }

    @Override
    public void find() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Axtarmaq isdediyiniz müəllimin adını vəya soyadını daxil edin: ");
        String text = sc.nextLine();
        for (Teacher teacher : teachers) {
            if (text == null) continue;
            boolean equalFirstname = teacher.getFirstname().equalsIgnoreCase(text.trim());
            boolean equalSurname = teacher.getSurname().equalsIgnoreCase(text.trim());
            if (equalFirstname || equalSurname) {
                System.out.println(teacher.toString());
            }
        }
    }

    private Teacher requireAndCreate() {
        Scanner sc = new Scanner(System.in);
        Teacher teacher = new Teacher();
        System.out.print("Mellimin adini daxil edin: ");
        teacher.setFirstname(sc.nextLine());
        System.out.print("Mellimin soyadini daxil edin: ");
        teacher.setSurname(sc.nextLine());
        System.out.print("Mellimin yasini daxil edin: ");
        teacher.setAge(sc.nextByte());
        sc.nextLine();
        return teacher;
    }

}
