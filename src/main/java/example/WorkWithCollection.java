package example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Этот класс выполянет тестирование производительности различных операций с двумя типами списков:
 * ArrayList и LinkedList. Тестируется время выполнения операций добавления, получения и удаления элементов
 * в разных поизициях списка.
 */
public class WorkWithCollection {

    /**
     * Количество операций для тестирования каждого метода.
     */
    private static final int NUM_OPERATIONS = 2000;

    /**
     * Главный метод для инициализации тестирования ArrayList и LinkedList.
     * Создаются экземпеляры ArrayList и LinkedList, и выполняются тесты для каждого.
     *
     * @param args Аргументы командной строки (не используются в данной реализации)
     */
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        System.out.println("Тестирование ArrayList:");
        performTests(arrayList);

        System.out.println("\nТестирование LinkedList:");
        performTests(linkedList);
    }

    /**
     * Выполняет различные тесты для переданного списка и выводит результаты.
     * Этот метод тестирует время выполнения нескольких операций над списком:
     * Добавление элементов в список
     * Добавление элементов в начало
     * - Добавление элементов в середину
     * - Получение элементов из списка
     * - Удаление элементов с конца
     * - Удаление элементов с начала
     *
     * @param list Список, который будет тестироваться (ArrayList и LinkedList)
     */
    private static void performTests(List<String> list) {
        System.out.printf("%-20s %-20s %-15s%n", "Метод", "Количество", "Время (нс)");
        System.out.println("------------------------------------------------------");

        long addTime = add(list);
        System.out.printf("%-20s %-20d %-15d%n", "add", NUM_OPERATIONS, addTime);

        long addFirstTime = addFirst(list);
        System.out.printf("%-20s %-20d %-15d%n", "addFirst", NUM_OPERATIONS, addFirstTime);

        long addMiddleTime = addMiddle(list);
        System.out.printf("%-20s %-20d %-15d%n", "addMiddle", NUM_OPERATIONS, addMiddleTime);

        long getTime = get(list);
        System.out.printf("%-20s %-20d %-15d%n", "get", NUM_OPERATIONS, getTime);

        long deleteTime = delete(list);
        System.out.printf("%-20s %-20d %-15d%n", "delete", NUM_OPERATIONS, deleteTime);

        long deleteFirstTime = deleteFirst(list);
        System.out.printf("%-20s %-20d %-15d%n", "deleteFirst", NUM_OPERATIONS, deleteFirstTime);
    }

    /**
     * Тестирует время добавления элементов в конец списка.
     *
     * @param list Список, в который добавляются элементы
     * @return Время выполнения операции добавления в наносекундах
     */
    public static long add(List<String> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < NUM_OPERATIONS; i++) {
            list.add("Element " + i);
        }
        return System.nanoTime() - startTime;
    }

    /**
     * Тестирует время добавления элементов в начало списка.
     *
     * @param list Список, в который добавляются элементы в начало
     * @return Время выполнения операции добавления в начале в наносекундах
     */
    public static long addFirst(List<String> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < NUM_OPERATIONS; i++) {
            list.add(0, "Element " + i);
        }
        return System.nanoTime() - startTime;
    }

    /**
     * Тестирует время добавления элементов в середину списка.
     *
     * @param list Список, в который добавляются элементы в середину
     * @return Время выполнения операции добавления в середину в наносекундах
     */
    public static long addMiddle(List<String> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < NUM_OPERATIONS; i++) {
            list.add(list.size() / 2, "Element " + i);
        }
        return System.nanoTime() - startTime;
    }

    /**
     * Тестирует время получения элементов из списка.
     * Метод обращается к элементам по индексам, которые циклически повторяются в пределах размера списка.
     *
     * @param list Список, из которого получаются элементы
     * @return Время выполнения операции получения элемента в наносекундах
     */
    public static long get(List<String> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < NUM_OPERATIONS; i++) {
            list.get(i % list.size());
        }
        return System.nanoTime() - startTime;
    }

    /**
     * Тестирует время удаления элементов с конца списка.
     *
     * @param list Список, из которого удаляются элементы с конца
     * @return Время выполнения операции удаления с конца в наносекундах
     */
    public static long delete(List<String> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < NUM_OPERATIONS; i++) {
            if (!list.isEmpty()) {
                list.remove(list.size() - 1); // Удаление с конца
            }
        }
        return System.nanoTime() - startTime;
    }

    /**
     * Тестирует время удаления элементов с начала списка.
     *
     * @param list Список, из которого удаляются элементы с начала
     * @return Время выполнения операции удаления с начала в наносекундах
     */
    public static long deleteFirst(List<String> list) {
        long startTime = System.nanoTime();
        for (int i = 0; i < NUM_OPERATIONS; i++) {
            if (!list.isEmpty()) {
                list.remove(0); // Удаление с начала
            }
        }
        return System.nanoTime() - startTime;
    }
}
