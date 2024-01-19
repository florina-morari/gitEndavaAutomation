package ObiectConstructor;

public class Avion {
    // constructor = are ca rol sa initializeze variabilele unei clase;
    // recunoastem un constructor dupa numele clasei;
    // intr-o clasa putem avea n constructori care se diferentiaza dupa numarul sau tipul de parametrii;
    // exista 2 tipuri de constructori: cu parametrii sau fara parametrii;
    // intr-o clasa avem tot timpul un constructor default (fara parametrii);
    // constructorul trebuie sa fie public;

    //obiect = instanta unei clase;
    //dintr-o clasa putem sa facem mai multe obiecte;
    //ca sa initializam un obiect ne folosim de cuvantul new;
    //cand se initializeaza un obiect se apeleaza constructorul clasei;


    public String tip;
    public String marca;
    public String model;
    public Integer capacitatePasageri;
    public String tipCombustibil;
    public Integer numarBagaje;

    public Avion(String tip, String marca, String model, Integer capacitatePasageri, String tipCombustibil) {
        this.tip = tip;
        this.marca = marca;
        this.model = model;
        this.capacitatePasageri = capacitatePasageri;
        this.tipCombustibil = tipCombustibil;

    }

    public Avion(String tip, String marca, String model, Integer capacitatePasageri, String tipCombustibil, Integer numarBagaje) {
        this.tip = tip;
        this.marca = marca;
        this.model = model;
        this.capacitatePasageri = capacitatePasageri;
        this.tipCombustibil = tipCombustibil;
        this.numarBagaje = numarBagaje;
    }

    public void prezentareAvion() {
        System.out.println("Tipul avionului: " + tip);
        System.out.println("Marca avionului: " + marca);
        System.out.println("Modelul avionului: " + model);
        System.out.println("Capacitatea pasagerilor avionului: " + capacitatePasageri);
        System.out.println("Tipul combustibilului avionului: " + tipCombustibil);
        if (numarBagaje != null) {
            System.out.println("Numarul de bagaje ale avionului: " + numarBagaje);
        } else
            System.out.println("Avionul nu are bagaje");

    }

}
