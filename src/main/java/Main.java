import java.util.Scanner;

public class Main {
    public static void main (String[] args){
//        System.out.println("Hello and welcome!");
//        for (int i=1; i<=5;i++){
//            System.out.println("i = " +i);
//        }
       // citireNote();
       // printareValoriWhile();
        //printareValoriDoWhile();
        printareValoreFor();
    }
//
    public static void citireNote(){
    System.out.println("Introduceti nota: ");
        Scanner scanner = new Scanner(System.in);
        int nota = scanner.nextInt();
        while (nota<0 || nota > 10){
            System.out.println("Nota " + nota + " trebuie sa fie intre 1 si 10. Reintrodu o valoare valida.");
            nota = scanner.nextInt();
        }
        System.out.println("Nota " + nota +" introdusa este valida");
    }

    public static void printareValoriWhile(){
        int valoare = 16;
        while(valoare <=5){
            valoare++;
            System.out.println("Valoarea este " + valoare);
            valoare++;
        }
        System.out.println("Valoarea dupa parcurgerea while este " + valoare);
    }

    public static void printareValoriDoWhile(){
        int valoare = 6;
        do{
            System.out.println("Valoarea este " + valoare);
            valoare++;
        }while(valoare<=5);
        System.out.println("Valoarea dupa parcurgerea do-while este " + valoare);
    }

    public static void printareValoreFor()
    {
        //int valoare =1;
        for(int valoare =1; valoare <=5; valoare ++){
            System.out.println("Valoarea este " + valoare);
           // valoare++;
        }
    }
}
