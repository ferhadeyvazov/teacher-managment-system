package common;

import teacher.entity.Teacher;

public abstract class MyServices {
    public abstract void showMenu();

    public abstract void initialize();

    public abstract Teacher requireAndCreate();

    public abstract Teacher[] createNew(Teacher[] teachers);

    public abstract void printAll(Teacher[] teachers);

    public abstract void update(Teacher[] teachers);

    public abstract void delete(Teacher[] teachers);

    public abstract void find(Teacher[] teachers);
}
