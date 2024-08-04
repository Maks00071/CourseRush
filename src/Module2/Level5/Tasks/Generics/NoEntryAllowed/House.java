package Module2.Level5.Tasks.Generics.NoEntryAllowed;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/***** Вход воспрещен! *****
 * Проанализируй классы в задаче.
 * В методе main создано два дома: один для котов и один для собак.
 * Однако сейчас, когда в дом для кошек заходит собака, возникает конфликт
 * и все находящиеся в нем коты вынуждены покинуть дом (метод checkConflicts).
 * -----
 * Помоги котам защитить свой дом от посторонних, а также не позволить
 * им случайно заходить в дом для собак.
 * Для этого параметризируй House типом T и внеси соответствующие правки в реализацию класса.
 * -----
 * Требования:
 * • Класс House должен быть параметризован с типом T.
 * • Поле residents в классе House должно быть параметризовано типом T.
 * • Метод enter в классе House должен принимать объект типа T.
 * • Метод leave в классе House должен принимать объект типа T.
 * • Метод checkConflicts в классе House больше не нужен и должен быть удален.
 */

public class House {

    private List residents = new ArrayList();

    public void enter(Object resident) {
        residents.add(resident);
        checkConflicts();
    }

    public void leave(Object resident) {
        residents.remove(resident);
    }

    public void checkConflicts() {
        boolean conflict = false;

        for (Object resident : residents) {
            if (resident instanceof Dog) {
                conflict = true;
            }
        }

        if (conflict) {
            Iterator iterator = residents.iterator();
            while (iterator.hasNext()) {
                Object resident = iterator.next();
                if (resident instanceof Cat) {
                    iterator.remove();
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("В доме находятся:\n");
        for (Object resident : residents) {
            builder.append(resident.toString()).append("\n");
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Dog bruno = new Dog("Bruno");
        Puppy larsik = new Puppy("Larsik");
        Cat barsik = new Cat("Barsik");
        Kitten keksik = new Kitten("Keksik");

        House dogHouse = new House();

    }
}

















