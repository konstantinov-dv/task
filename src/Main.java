public class Main {
    public static void main(String[] args) {
        // переменные часть 1

        // задача 1
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;

        // задача 2
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        // задача 3
        var y = 3.5;
        System.out.println(dog - y);
        var x = 1.6;
        System.out.println(cat - x);
        paper = paper - 7639;
        System.out.println(paper);

        // задание 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // задание 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        var q = 3.5;
        System.out.println(frog / q);
        System.out.println(frog / q + 4);

        // задание 6
        var weightOneBoxer = 78.2;
        var weightTwoBoxer = 87.7;
        var totalWeight = weightOneBoxer + weightTwoBoxer;
        System.out.println( "Общий вес боксеров " + totalWeight + "кг.");

        var difference = weightTwoBoxer % weightOneBoxer;
        System.out.println("Разница боксеров " + difference + "кг");

        // задание 7
        var oneDifference = weightTwoBoxer - weightOneBoxer;
        System.out.println("Разница путем вычитания составит " + oneDifference + "кг");
        var twoDifference = weightTwoBoxer % weightOneBoxer;
        System.out.println("Разница путем остаток от деления равно " + twoDifference + "кг");

        // задание 8
        var allHours = 640;
        var oneWorker = 8; // кол. часов у одного работник
        var firstBrigade = allHours / oneWorker;  // первая бригада
        System.out.println("Всего работников в компании – " + firstBrigade + " человек");

        // при учёте распределения 640 часов

        var secondBrigade = firstBrigade + 94;
        System.out.println("Если в компании работает " + secondBrigade + " человек, то всего " + (double)allHours / secondBrigade + " часов работы может быть поделено между сотрудниками." );








    }
}

