import java.util.Scanner;

public abstract class Osoba {
    //klasa abstrakcyjna nie mozna utworzyc obiektu tej klasy, klasa jest uzywana w dziedziczeniu
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

    //przeciazanie konstruktora


    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        wiek = 7;
        //jezeli nie ma lokalnie zmiennej wiek to jest to
    }

    public Osoba() {
        imie = "";
        nazwisko = "";
        wiek = 0;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }


}
