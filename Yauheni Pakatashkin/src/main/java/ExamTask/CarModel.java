package ExamTask;

import java.util.Random;

public enum CarModel {
    MERCEDES, BMW, VW;

    private static final CarModel [] VALUES = CarModel.values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static CarModel getRandomModel()  {  //метод выбирает рандомную модель авто
        return VALUES[RANDOM.nextInt(SIZE)];
    }
}
