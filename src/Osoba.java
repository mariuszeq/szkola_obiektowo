import java.util.Scanner;

public class Osoba {
    String imie;
    String nazwisko;
    int wiek;

    // konstruktor to metoda wywolywana w momencie tworzenia konstruktorow


    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
//gettery metody dostepowe
    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }
//settery prywatne wlasnosci sa dostepne tylko w tej klasie         metody dostepowe
    public void setImie(String imie) {
        //wpisywanie hasla z klawiatury
        Scanner scanner = new Scanner(System.in);
        String haslo = scanner.next();

        if(haslo.equals("1234")) {
            this.imie = imie;
        }else {
            System.out.println("zle haslo");
        }
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}
