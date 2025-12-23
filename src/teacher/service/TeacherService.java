package teacher.service;

import teacher.entity.Teacher;
import common.MyServices;

import java.util.Scanner;

import static common.Db.teachers;

public class TeacherService extends MyServices {
    public void showMenu() {
        System.out.println("Hansi emelliyyati etmek isteyirsiniz?");
        System.out.println("""
                0. muellimleri ilk defe yarat\s
                1. yenisini yarat\s
                2. yenilemek(update)\s
                3. silmek\s
                4.  axtarmaq\s
                5. Hamisini gormek""");
        byte action = new Scanner(System.in).nextByte();
        if (action == 0) {
            initialize();
        } else if (action == 1) {
            teachers = createNew(teachers);
        } else if (action == 2) {
            printAll(teachers);
            update(teachers);
            printAll(teachers);
        } else if (action == 3) {
            delete(teachers);
            printAll(teachers);
        } else if (action == 4) {
            find(teachers);
        } else if (action == 5) {
            if (teachers != null) printAll(teachers);
            else System.out.println("Teacher yoxdur...");
        }
    }

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
        printAll(teachers);
    }

    @Override
    public Teacher requireAndCreate() {
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

    @Override
    public Teacher[] createNew(Teacher[] teachers) {
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
        return newTeachers;
    }

    @Override
    public void printAll(Teacher[] teachers) {
        System.out.println("Qeydiyyatdan keçen mellimler: ");
        for (Teacher teacher : teachers) {
            System.out.println(teacher.toString());
        }
    }

    @Override
    public void update(Teacher[] teachers) {
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
    public void delete(Teacher[] teachers) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Necenci mellimi silmek isteyirsiz?");
        teachers[sc.nextByte() - 1] = null;
    }

    @Override
    public void find(Teacher[] teachers) {
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

}
