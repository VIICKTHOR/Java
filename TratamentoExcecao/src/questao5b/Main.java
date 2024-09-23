package questao5b;

import java.io.EOFException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);
        try{
            primeiro(x);
            System.out.println("Após primeiro");
        } catch(IllegalArgumentException e){
            System.out.println("Trata primeiro");
        }
        System.out.println("Saiu primeiro");
    }

    static void primeiro(int x) throws IllegalArgumentException {
            try {
                segundo(x);
                System.out.println("Depois segundo");
            } catch(IOException e){
                System.out.println("Trata segundo");
            }
            System.out.println("Saiu segundo");

    }

    static void segundo(int x) throws IllegalArgumentException, IOException{

            try {
                switch (x) {
                    case 0:
                        throw new IllegalArgumentException();
                    case 1:
                        throw new IOException();
                    case 2:
                        throw new EOFException();
                }
                System.out.println("Depois switch");
            } catch (EOFException e) {
                System.out.println("Trata terceiro");
            }
            System.out.println("Saiu terceiro");
    }

}

