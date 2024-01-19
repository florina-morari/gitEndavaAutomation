package VariabilaMetoda;

import org.testng.annotations.Test;

public class StructuriAlternative {


    //structuri alternative: if - then - else; switch - case;
    @Test
    public void metodaTest(){
        verifyNumber(5);
        verifyParity(-1);
        verifyParity(8);
        verifyParity(-2);
        verifyParity(5);
        zileSaptamana(8);
    }
    public void verifyNumber(int nr1){
        //verificam un numar mai mare decat 5

        if(nr1>5){
            System.out.println("Numarul "+ nr1 +" este mai mare decat 5!");
        }
        else if (nr1<5){
            System.out.println("Numarul " +nr1 + " este mai mic decat 5!");
        }
        else{
            System.out.println("Numarul "+nr1 + " este egal cu 5!");
        }

    }
    public void verifyParity(int nrpar){
        //verificam daca numarul este par pozitiv sau negativ
        if (nrpar>0){
            if (nrpar%2==0){
                System.out.println("Numarul " +nrpar + " este par pozitiv!");
            }
            else{
                System.out.println("Numarul " +nrpar + " este impar pozitiv!");
            }
        }
        else if(nrpar<0){
            if (nrpar%2==0){
                System.out.println("Numarul " +nrpar+ " este par negativ!");
            }
            else{
                System.out.println("Numarul " +nrpar +" este impar negativ!");
            }
        }
        else if (nrpar==0){
            System.out.println("Numarul " + nrpar + " este 0!");
        }
    }

    //exemplu switch-case
    public void zileSaptamana(Integer zi){
        switch(zi){
            case 1:
              System.out.println("Azi este luni");
              break;
            case 2:
                System.out.println("Azi este marti");
                break;
            case 3:
                System.out.println("Azi este miercuri");
                break;
            case 4:
                System.out.println("Azi este joi");
                break;
            case 5:
                System.out.println("Azi este vineri");
                break;
            case 6:
                System.out.println("Azi este sambata");
                break;
            case 7:
                System.out.println("Azi este duminica");
                break;
            default:
                System.out.println("Valoarea introdusa nu corespunde nici unei zile din saptamana");
        }
    }
}