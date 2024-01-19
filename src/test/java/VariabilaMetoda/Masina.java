package VariabilaMetoda;

import org.testng.annotations.Test;

import java.util.Scanner;

public class Masina {
    public String marca;
    public String model;
    public Integer anFabricatie;
  @Test
    public void testMethods(){
//      dateMasina("BMW","X5",2020);
//      dateMasina("BMW","X6",2022);
//      calculMedie(5.00,6.00,9.00);
      citireNote();

    }

    public void dateMasina(String param1, String param2, Integer param3){
        marca = param1;
        model = param2;
        anFabricatie=param3;
        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Anul fabricatiei masinii este: " + anFabricatie);
    }

    public void calculMedie( Double nota1, Double nota2, Double nota3){
      Double medieRezultat= (nota1+nota2+nota3)/3;
        System.out.println("Media este: " + medieRezultat);
    }

    public void citireNote(){

        Scanner scanner = new Scanner(System.in);
        int nota = scanner.nextInt();
        while (nota<0 || nota > 10){
            System.out.println("Nota " + nota + "trebuie sa fie intre 1 si 10. Reintrodu o valoare valida.");
            nota = scanner.nextInt();
        }
        System.out.println("Nota " + nota +" introdusa este valida");
    }
}
