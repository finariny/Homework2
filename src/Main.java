public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper= 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task 2
        System.out.println("Task 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task 3
        System.out.println("Task 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task 4
        System.out.println("Task 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //task 5
        System.out.println("Task 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //task 6
        System.out.println("Task 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println(totalWeight);
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println(weightDifference);

        //task 7
        System.out.println("Task 7");
        var weightDifferenceFirstWay = secondBoxerWeight - firstBoxerWeight;
        System.out.println(weightDifferenceFirstWay);
        var weightDifferenceSecondWay = secondBoxerWeight % firstBoxerWeight;
        System.out.println(weightDifferenceSecondWay);

        //task 8
        System.out.println("Task 8.1");
        var totalHours1 = 640;
        var hoursPerEmployee1 = 8;
        var numberOfEmployees1 = totalHours1 / hoursPerEmployee1;
        System.out.println("Всего работников в компании – " + numberOfEmployees1 + " человек");

        System.out.println("Task 8.2");
        var numberOfEmployees2 = totalHours1 / hoursPerEmployee1 + 94;
        var totalHours2 = numberOfEmployees2 * 8;
        System.out.println("Если в компании работает " + numberOfEmployees2 + " человека, то всего " + totalHours2 + " часа работы может быть поделено между сотрудниками");
    }
}