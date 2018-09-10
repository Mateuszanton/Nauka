package Folder;

public class Klasa {
    public static void main(String args[])
            throws java.io.IOException {
        {
            for (int i = 0; ; i++) {
                System.out.print("wpisz literke!!");
                char ch = (char) System.in.read();
                if (ch == 'q') break;
                switch (ch) {
                    case 'k':
                        System.out.println("wpisałeś " + ch + " jak kurwa");
                        break;
                    case 'h':
                        System.out.println("wpisałeś " + ch + " jak huj");
                        break;
                }
            }
            System.out.println("koniec programu");

        }
    }
}