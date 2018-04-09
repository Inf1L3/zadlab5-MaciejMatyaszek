/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

import java.util.Scanner;

/**
 *
 * @author Maciej
 */
public class Firma {
    private Pracownik[] proacownikTab = new Pracownik[100];

    public Firma() {
        for (int i = 0; i < this.proacownikTab.length; i++) {
            this.proacownikTab[i] = new Pracownik("", "", 0, "");
        }
    }
    
    public void wpiszPracownika(int i){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        String imie = input.nextLine();
        System.out.println("Podaj nazwisko: ");
        String nazwisko = input.nextLine();
        System.out.println("Podaj pozycje: ");
        String pozycja = input.nextLine();
        System.out.println("Podaj wiek: ");
        int wiek = input.nextInt();
        this.proacownikTab[i] = new Pracownik(imie, nazwisko, wiek, pozycja);
    }
    
    public void wPracownika(){
        for (int i = 0; i < proacownikTab.length; i++) {
            System.out.println("-----------------------------");
            System.out.println(proacownikTab[i].toString());           
        }
        System.out.println("-----------------------------");
    }
    
}