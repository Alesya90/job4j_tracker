package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf2 wolf2 = new Wolf2();
        Fox fox = new Fox();
        ball.goFromHare(hare);
        ball.goFromWolf2(wolf2);
        ball.notGoFromFox(fox);
    }
}
