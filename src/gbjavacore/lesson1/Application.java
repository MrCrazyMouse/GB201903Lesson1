package gbjavacore.lesson1;

import gbjavacore.lesson1.animal.Cat;
import gbjavacore.lesson1.animal.Dog;
import gbjavacore.lesson1.animal.Human;
import gbjavacore.lesson1.animal.Robot;
import gbjavacore.lesson1.course.Course;
import gbjavacore.lesson1.course.Cross;
import gbjavacore.lesson1.course.Wall;
import gbjavacore.lesson1.course.Water;
import gbjavacore.lesson1.enums.Color;
import javafx.stage.Stage;

/**
 * Класс для запуска приложения - симулятор кросса
 */
public abstract class Application {

    public static void main(String[] args) {
        Team team = new Team(
                new Cat("Барсик", Color.BLACK, 2, 100, 5),
                new Cat("Мурзик", Color.BLACK, 4, 80, 7),
                new Dog("Шарик", Color.WHITE, 3, 110, 4, 80),
                new Human("Андрей", Color.BROWN, 19, 120, 2, 20),
                new Robot("R2D2", Color.RED, 2, 200, 10, 50));


    Course course = new Course(
            new Cross(50),
            new Wall(10),
            new Cross(90),
            new Water(5)
    );

        course.doIt(team);
}

    public abstract void start(Stage primeryStage);
}