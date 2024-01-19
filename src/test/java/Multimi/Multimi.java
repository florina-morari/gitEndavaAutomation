package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multimi {
    //multimi: array, list, map

    @Test
    public void metodaTest() {
//        colegiCurs();
//        colegiCursLista();
        categorieObiect();
        tariOrase();
    }
    //exemplu array

    public void colegiCurs() {
        String[] colegi = new String[5];
        colegi[0] = "Ana-Maria";
        colegi[1] = "Cristina";
        colegi[2] = "Mihai";
        colegi[3] = "Alina";
        colegi[4] = "Bogdan";

        for (int i = 0; i < colegi.length; i++) {
            System.out.println("Numele colegului este: " + colegi[i]);
        }
    }

    //exemplu lista

    public void colegiCursLista() {
        List<String> colegi = new ArrayList<>();
        colegi.add("Ana-Maria");
        colegi.add("Cristina");
        colegi.add("Mihai");
        colegi.add("Alina");
        colegi.add("Bogdan");
        int i = 0;
        while (i<colegi.size()){
            System.out.println("Numele colegului este: " + colegi.get(i));
            i++;
        }

    }
    //exemplu map > cheie = valoare
    public void categorieObiect(){
        HashMap<String, String> obiect = new HashMap<>();
        obiect.put("obiect","laptop");
        obiect.put("fruct","mar");
        obiect.put("floare","trandafir");
        obiect.put("vehicul","masina");
        for (String key: obiect.keySet()){
            System.out.println("Cheia este " + key);
            System.out.println("Valoarea este " + obiect.get(key));
        }

    }

    public void tariOrase(){
        HashMap<String, List<String>> clasification = new HashMap<>();
        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Cluj");
        oraseRomania.add("Bucharest");
        oraseRomania.add("Brasov");
        oraseRomania.add("Oradea");

        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Milan");
        oraseItalia.add("Firente");
        oraseItalia.add("Roma");
        oraseItalia.add("Napoli");


        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Madrid");
        oraseSpania.add("Barcelona");
        oraseSpania.add("Alicante");

        clasification.put("Romania",oraseRomania);
        clasification.put("Italia",oraseItalia);
        clasification.put("Spania",oraseSpania);
         for (String key: clasification.keySet()){
            System.out.println("Tara este " + key);
            System.out.println("Orasele sunt " + clasification.get(key));
        }

    }

}
