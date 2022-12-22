package oop.time.chess;

import java.util.ArrayList;
import java.util.List;

public class Chess {
    public static void main(String[] args) {
        FigureService figureService = new FigureService();

        List<ChessFigure> list = new ArrayList<>();
        list.add(new Horse());
        list.add(new Queen());
        list.add(new King());

        list.forEach(figureService::moveFigure);
    }
}

class ChessFigure {
    String move() {
        return "move";
    }
}

class Horse extends ChessFigure {
    @Override
    public String move() {
        return "Horse moving";
    }
}

class Queen extends ChessFigure {
    @Override
    public String move() {
        return "Queen " + super.move();
    }
}

class King extends ChessFigure {
    @Override
    public String move() {
        return "King " + super.move();
    }
}

class FigureService {
    public void moveFigure(ChessFigure chessFigure) {
        System.out.println(chessFigure.move());
    }
}
