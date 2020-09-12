package exercise_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите количество студентов:");
        Student[] students = new Student[new Scanner(System.in).nextInt()];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(
                    (int) (Math.random()*100), i + " student");
        }
        System.out.println("Исходный массив:");
        Arrays.stream(students).forEach(System.out::println);

        System.out.println("\nМассив,отсортированный вставками:");
        insertionSort(students);
        Arrays.stream(students).forEach(System.out::println);
    }

    private static void insertionSort(Student[] array) {
        for (int i = 1; i < array.length; i++) {
            Student keyStudent = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].getId() > keyStudent.getId()) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = keyStudent;
        }
    }
}
