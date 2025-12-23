import teacher.service.TeacherService;
import common.MyServices;

//    1. Teacher.entity.Teacher class-i yarat
//        2. Lazimli fields-leri elave edin
//        3. Bunu Encapsule(private edin  ) edin
//        4. Musteriden name, surname, age teleb edin
//        5. Daxil olunani muvafiq fields-e menimset.
//        6. Muteriden sorus nece nefer mellim daxil edeceyini sorus.
//        7. Uzunlugu count qeder olan massiv yaradin ve teacherleri hemin massive
//        yarandiqca at
class Main {
    private static final MyServices teacherService = new TeacherService();

    public static void main(String[] args) {
        while (true) {
            teacherService.showMenu();
        }
    }


}