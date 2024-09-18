public class Uczen extends Osoba implements Dyzurny{
    //poniewarz uczen ma te same wlasnosci co osoba to bedzie klasa podolna co klasa osoba
    //klasa osoba bedzie klasa bazowa
    private int nr_ewidencyjny;
    static public int liczbaobiektow;


    public Uczen(String imie, String nazwisko, int wiek, int nr_ewidencyjny) {
        super(imie, nazwisko, wiek);
        //^^^^^^wywolanie konstruktora klasy bazowej
        this.nr_ewidencyjny = nr_ewidencyjny;
        liczbaobiektow++;
    }

    public Uczen(String imie, String nazwisko) {
        super(imie, nazwisko);
        liczbaobiektow++;
        nr_ewidencyjny = liczbaobiektow;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "nr_ewidencyjny=" + nr_ewidencyjny +
                ", imie='" + getImie()  +
                ", nazwisko='" + getNazwisko()  +
                ", wiek=" +  +
                '}';
    }

    @Override
    public void wykonajDyzur() {
        System.out.println("Uczen zmazuje tablice");
    }
}
