/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

/**
 *
 * @author Maciej
 */
public class Pracownik {

    private String imie;
    private String nazwisko;
    private int wiek;
    private String pozycja;

    public Pracownik(String imie, String nazwisko, int wiek, String pozycja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.pozycja = pozycja;
    }

    @Override
    public String toString() {
        return "Imie=" + imie + "\nNazwisko=" + nazwisko + "\nWiek=" + wiek + "\nPozycja=" + pozycja;
    }

}