package com.company;

public class Main {
    public static void main(String[] args) {

    }
}
    enum Sizez{XXS(32), XS(34), S(36), M(38), L(40);
    int EuroSizes;
    Sizez(int p){
        EuroSizes = p;
    }
    void getDiscription(){
        if (EuroSizes < 38){
            System.out.println("Детский размер");
        } else System.out.println("Взрослый размер");
    }
}
    interface MenClothes {
        default void DressMan(){
            System.out.println(Atelie.CLOTHES[0]);
            System.out.println("Размеры: " + Sizez.XXS + " " + Sizez.XS + " " + Sizez.S + " " + Sizez.M + " " + Sizez.L + " ");
            System.out.println(Atelie.CLOTHES[1]);
            System.out.println("Размеры: " + Sizez.XXS + " " + Sizez.XS + " " + Sizez.S + " " + Sizez.M + " " + Sizez.L + " ");
            System.out.println(Atelie.CLOTHES[2]);
            System.out.println("Размеры: " + Sizez.XXS + " " + Sizez.XS + " " + Sizez.S + " " + Sizez.M + " " + Sizez.L + " ");
        }
    }
    interface WomenClothes {
        default void DressWoman(){
            System.out.println(Atelie.CLOTHES[0]);
            System.out.println("Размеры: " + Sizez.XXS + " " + Sizez.XS + " " + Sizez.S + " " + Sizez.M + " " + Sizez.L + " ");
            System.out.println(Atelie.CLOTHES[1]);
            System.out.println("Размеры: " + Sizez.XXS + " " + Sizez.XS + " " + Sizez.S + " " + Sizez.M + " " + Sizez.L + " ");
            System.out.println(Atelie.CLOTHES[3]);
            System.out.println("Размеры: " + Sizez.XXS + " " + Sizez.XS + " " + Sizez.S + " " + Sizez.M + " " + Sizez.L + " ");
        }
    }
    abstract class Clothes {
        private String Size;
        private int price;
        private String color;
    }
    class T_Shirt extends Clothes implements MenClothes, WomenClothes{

    }
    class Pants extends Clothes implements MenClothes, WomenClothes{

    }
    class Skirt extends Clothes implements WomenClothes{

    }
    class Tie extends Clothes implements MenClothes{

    }
    class Atelie{
        public static final String[] CLOTHES = "Футболка Штаны Юбка Галстук".split(" ");
        public void DressWoman(){

        }
        public void DressMan(){

        }
    }
