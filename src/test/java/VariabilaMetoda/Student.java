package VariabilaMetoda;

import com.google.errorprone.annotations.Var;
import org.testng.annotations.Test;

public class Student {
    //class = sablon care defineste proprietatile si comportmanetul unei entitati specifice
    //intr-un sablon Java putem avea mai multe clase  diferentiate pe baza numelui (nu este un practice bun sa avem mai multe clase cu acelasi nume)
    //intr-o clasa putem defini proprietatile si actiunile entitatii
    //variabila = proprietatea unei clase; pot fi de 2 feluri: global si local
    // variabilele globale = sunt vizibile peste tot in proiect
    // variabilele locale = sunt vizibile doar in locul unde este declarata
    //ca sa definim o variabila globala: access control(public), tip variabila, nume variabila
    // in momentul definirii unei variabile nu este obligatoriu sa ii dam o valoare
    // metoda = actiunea unei clase
    // 2 tipuri de metode: void si return

    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public String Adresa;
    public Double Inaltime;
    public Float Greutate;
    public Character Sex;
    public Boolean AreDiploma;

@Test
    public void prezentareStudent(){
        Nume="Ko";
        Prenume = "Min-Jo";
        Varsta = 20;
        Adresa = "str. Gyong, South Korea, no.67";
        Inaltime = 1.77;
        Greutate = 56f;
        Sex = 'f';
        AreDiploma = true;
        System.out.println(Nume + " " + Prenume + " " + Varsta + " " + Adresa+ " " + Inaltime + " " + Greutate + " " + Sex + " " + AreDiploma);
        System.out.println("Numele studentului este: " + Nume);
        System.out.println("Prenumele studentului este: " + Prenume);
        System.out.println("Varsta studentului este: " + Varsta);
        System.out.println("Adresa studentului este: " + Adresa);
        System.out.println("Inaltimea studentului este: " + Inaltime);
        System.out.println("Greutatea studentului este: " + Greutate);
        System.out.println("Sexul studentului este: " + Sex);
        System.out.println("Are studentul diploma? " + AreDiploma);

        calculMedie();
        System.out.println(getSalariu());
    }

    public void calculMedie() {
        Integer nota1 = 10;
        Integer nota2 = 9;
        Integer nota3 = 8;

        Integer medie = (nota1 + nota2 + nota3) / 3;
        System.out.println("Media studentului este: " + medie);
    }

    //metoda cu return
    public Integer getSalariu() {
        Integer salariu = 5000;
        return salariu;

    }
}

