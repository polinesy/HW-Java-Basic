package homework8.task1;

public class Computer_main {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Dell", 1500, 512, 6);
        System.out.println(computer1);
        System.out.println("======================");
        Computer computer2 = new Computer("HP", 1345, 256, 4);
        Computer computer3 = new Computer("HP", 1555, 256, 4);
        System.out.println(computer1.equals(computer2));
        System.out.println(computer2.equals(computer3));





    }
}
