/*
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
NoteBook notebook1 = new NoteBook
NoteBook notebook2 = new NoteBook
NoteBook notebook3 = new NoteBook
NoteBook notebook4 = new NoteBook
NoteBook notebook5 = new NoteBook

Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД hd hdd
3 - Операционная система
4 - Цвет

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

Класс сделать в отдельном файле

приветствие
Выбор параметра
выбор конкретнее
вывод подходящих
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        var Notebooks = SetNotebooks();
        Menu(Notebooks);
    }

    public static void Menu(HashSet<notebook> Notebooks) {
        Scanner sc = new Scanner(System.in, "cp866");
        int num = -1;
        while (num != 0) {
            System.out.print(
                    "Введите цифру, соответствующую необходимому критерию:\n 1 - Цвет\n 2 - ОС\n 3 - Объем ОЗУ\n 4 - Объем HHD\n 0 - Выход\n");
            num = Integer.valueOf(sc.nextLine());
            switch (num) {
                case 0:
                    break;
                case 1:
                    SearchColor(Notebooks);
                    break;
                case 2:
                    SearchOS(Notebooks);
                    break;
                case 3:
                    SearchRAM(Notebooks);
                    break;
                case 4:
                    SearchHDD(Notebooks);
                    break;
                default:
                    break;
            }
        }
    }

    public static HashSet<notebook> SetNotebooks() {

        notebook notebook1 = new notebook("Apple", 25000);
        notebook1.setColor("Black");
        notebook1.setOS("MacOS");
        notebook1.setRAM(16);
        notebook1.setHDD(512);

        notebook notebook2 = new notebook("Apple", 24000);
        notebook2.setColor("White");
        notebook2.setOS("MacOS");
        notebook2.setRAM(16);
        notebook2.setHDD(512);

        notebook notebook3 = new notebook("ASUS", 7000);
        notebook3.setColor("Black");
        notebook3.setOS("Windows");
        notebook3.setRAM(8);
        notebook3.setHDD(256);

        notebook notebook4 = new notebook("ACER", 15000);
        notebook4.setColor("Black");
        notebook4.setOS("Windows");
        notebook4.setRAM(8);
        notebook4.setHDD(512);

        notebook notebook5 = new notebook("ASUS", 5000);
        notebook5.setColor("White");
        notebook5.setOS("Windows");
        notebook5.setRAM(8);
        notebook5.setHDD(256);

        notebook notebook6 = new notebook("Honor", "Black", "Windows", 16, 512, 22000);

        var notebooks = new HashSet<notebook>(
                Arrays.asList(notebook1, notebook2, notebook3, notebook4, notebook5, notebook6));
        return notebooks;
    }

    public static void SearchColor(HashSet<notebook> Notebooks) {
        Scanner sc = new Scanner(System.in, "cp866");
        int input = 0;
        System.out
                .println(
                        "Цвет:\n 1 - Белый\n 2 - Черный\n");
        input = Integer.valueOf(sc.nextLine());
        switch (input) {
            case 1:
                for (notebook notebook : Notebooks) {
                    if (notebook.getColor().equals("White")) {
                        System.out.print(notebook);
                    }
                }
                break;
            case 2:
                for (notebook notebook : Notebooks) {
                    if (notebook.getColor().equals("Black")) {
                        System.out.print(notebook);
                    }
                }
            default:
                break;
        }
    }

    public static void SearchOS(HashSet<notebook> Notebooks) {
        Scanner sc = new Scanner(System.in, "cp866");
        int input = 0;
        System.out.println("Операционная система\n 1 - Windows\n 2 - MacOS\n");
        input = Integer.valueOf(sc.nextLine());
        switch (input) {
            case 1:
                for (notebook notebook : Notebooks) {
                    if (notebook.getOS().equals("Windows")) {
                        System.out.print(notebook);
                    }
                }
                break;
            case 2:
                for (notebook notebook : Notebooks) {
                    if (notebook.getOS().equals("MacOS")) {
                        System.out.print(notebook);
                    }
                }
                break;
            default:
                break;
        }
    }

    public static void SearchRAM(HashSet<notebook> Notebooks) {
        Scanner sc = new Scanner(System.in, "cp866");
        int input = 0;
        System.out.println("Минимальный объем ОЗУ: ");
        input = Integer.valueOf(sc.nextLine());
        int count = 0;
        for (notebook notebook : Notebooks) {
            if (notebook.getRAM() >= input) {
                System.out.print(notebook);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Нет в наличии");
        }
    }

    public static void SearchHDD(HashSet<notebook> Notebooks) {
        Scanner sc = new Scanner(System.in, "cp866");
        int input = 0;
        System.out.println("Минимальный объем HDD: ");
        input = Integer.valueOf(sc.nextLine());
        int count = 0;
        for (notebook notebook : Notebooks) {
            if (notebook.getHDD() >= input) {
                System.out.print(notebook);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Нет в наличии");
        }
    }

}
