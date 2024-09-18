public sealed class Nauczyciel extends Osoba permits Wychowawca{
    private String przedmiot;

    public Nauczyciel(String imie, String nazwisko, int wiek, String przedmiot) {
        super(imie, nazwisko, wiek);
        this.przedmiot = przedmiot;
    }

    @Override
    public String toString() {
        return "Nauczyciel{" +
                "przedmiot='" + przedmiot + '\'' +
                ", imie='" + getImie() + '\'' +
                ", nazwisko='" + getNazwisko() + '\'' +
                '}';
    }
}
