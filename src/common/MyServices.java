package common;

import java.util.Scanner;


public abstract class MyServices {

    public void showMenu() {
        System.out.println("Hansı əməliyatı etmek istəyirsiniz?");
        System.out.println("""
                0. İlk dəfə yarat\s
                1. Yenisini yarat\s
                2. Yenilemek(update)\s
                3. Silmek\s
                4. Axtarmaq\s
                5. Hamısını görmək
                6. Əməliyyatı sonlandır""");
        byte action = new Scanner(System.in).nextByte();
        if (action == 0) {
            initialize();
        } else if (action == 1) {
            createNew();
        } else if (action == 2) {
            printAll();
            update();
            printAll();
        } else if (action == 3) {
            delete();
            printAll();
        } else if (action == 4) {
            find();
        } else if (action == 5) {
            printAll();
        } else if(action == 6) {
            return;
        }else {
            System.out.println("Düzgün reqem daxil edin! \n");
        }
    }

    public abstract void initialize();

    public abstract void createNew();

    public abstract void printAll();

    public abstract void update();

    public abstract void delete();

    public abstract void find();
}
