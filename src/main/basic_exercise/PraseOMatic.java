package main.basic_exercise;

public class PraseOMatic {
    public static void main(String[] args) {


        String[] wordListOne = {"24/7", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based", "smart", "six-sigma", "critical-path"};
        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "branded", "outside-the-box", "positioned", "networked"};
        String[] wordListThree = {"process", "tipping-point", "solution", "arhitecture", "strategy", "portal", "space", "vision", "mission"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("What we need is a " + phrase);
    }
}
