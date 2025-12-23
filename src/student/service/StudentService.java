package student.service;

import common.MyServices;

import student.entity.Student;

import java.util.Scanner;

import static common.Db.students;

public class StudentService extends MyServices {

    @Override
    public void initialize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Neçə nəfər Şagird daxil edirsen?");
        int count = sc.nextInt();
        sc.nextLine();
        students = new Student[count];
        for (int i = 0; i < count; i++) {
            students[i] = requireAndCreate();
        }
        printAll();
    }

    @Override
    public void createNew() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Neçə nəfər müəllim yaratmaq istəyirsiz?");
        int newCount = sc.nextInt();
        Student[] newStudents = new Student[students.length + newCount];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        for (int i = students.length; i < newStudents.length; i++) {
            newStudents[i] = requireAndCreate();
        }

    }

    @Override
    public void printAll() {
        if (students != null) {
            System.out.println("Qeydiyyatdan keçen Şagirdlər: ");
            for (Student student : students) {
                System.out.println(student.toString());
            }
        } else {
            System.out.println("Şagird yoxdur...");
        }
    }

    @Override
    public void update() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Necenci xanada duran müəllimi yeniləmək istəyirsiz?");
        Student updatedIndex = students[sc.nextInt() - 1];
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
        students[sc.nextByte() - 1] = null;
    }

    @Override
    public void find() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Axtarmaq isdediyiniz müəllimin adını vəya soyadını daxil edin: ");
        String text = sc.nextLine();
        for (Student student : students) {
            if (text == null) continue;
            boolean equalFirstname = student.getFirstname().equalsIgnoreCase(text.trim());
            boolean equalSurname = student.getSurname().equalsIgnoreCase(text.trim());
            if (equalFirstname || equalSurname) {
                System.out.println(student.toString());
            }
        }
    }

    private Student requireAndCreate() {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Şagirdin adini daxil edin: ");
        student.setFirstname(sc.nextLine());
        System.out.print("Şagirdin soyadini daxil edin: ");
        student.setSurname(sc.nextLine());
        System.out.print("Şagirdin yaşını daxil edin: ");
        student.setAge(sc.nextByte());
        sc.nextLine();
        return student;
    }

}
