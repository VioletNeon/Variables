public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println("dog: " + dog);

        var cat = 3.6;
        System.out.println("cat: " + cat);

        var paper = 763789;
        System.out.println("paper: " + paper);

        dog = dog + 4;
        System.out.println("dog: " + dog);

        cat = cat + 4;
        System.out.println("cat: " + cat);

        paper = paper + 4;
        System.out.println("paper: " + paper);

        dog = dog - 3.5;
        System.out.println("dog: " + dog);

        cat = cat - 1.6;
        System.out.println("cat: " + cat);

        paper = paper - 7639;
        System.out.println("paper: " + paper);

        var friend = 19;
        System.out.println("friend: " + friend);

        friend = friend + 2;
        System.out.println("friend: " + friend);

        friend = friend / 7;
        System.out.println("friend: " + friend);

        var frog = 3.5;
        System.out.println("frog: " + frog);

        frog = frog * 10;
        System.out.println("frog: " + frog);

        frog = frog / 3.5;
        System.out.println("frog: " + frog);

        frog = frog + 4;
        System.out.println("frog: " + frog);

        var firstBoxerWeight = 78.2;
        System.out.println("Масса одного боксера: " + firstBoxerWeight + " кг");

        var secondBoxerWeight = 82.7;
        System.out.println("Масса второго боксера: " + secondBoxerWeight + " кг");

        var totalBoxersWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общая масса двух бойцов: " + totalBoxersWeight + " кг");

        var differenceBoxersWeight = Math.abs(firstBoxerWeight - secondBoxerWeight);
        System.out.println("Разница между массами бойцов: " + differenceBoxersWeight + " кг");

        var remainderOfDivisionBetweenBoxers = Math.max(firstBoxerWeight, secondBoxerWeight) % Math.min(firstBoxerWeight, secondBoxerWeight);
        System.out.println("Остаток от деления между двумя весами: " + remainderOfDivisionBetweenBoxers + " кг");

        var totalWorkHours = 640;
        var employeeWorkHours = 8;
        var allEmployees = totalWorkHours / employeeWorkHours;
        System.out.println("Всего работников в компании — " + allEmployees + " человек");

        allEmployees = 94;
        totalWorkHours = allEmployees * employeeWorkHours;
        System.out.println("Если в компании работает " + allEmployees + " человека, то всего " + totalWorkHours + " часов работы может быть поделено между сотрудниками.");
    }
}