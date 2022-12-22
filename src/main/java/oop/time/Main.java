package oop.time;

public class Main {
    public static void main(String[] args) {
        DtoTime dtoTime = new DtoTime(12,2,2022);
        DtoTime dtoTime2 = new DtoTime(2,2,2022);
        EntityTime entityTime = new EntityTime(dtoTime.getDate());

//        System.out.println(entityTime.getDate());
    }
}
