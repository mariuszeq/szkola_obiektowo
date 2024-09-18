public class Main {
    public static void main(String[] args) {
        System.out.println("Klasy piszemy z duzej litery");

        Osoba osobaJas = new Osoba("Jas", "Sliwka", 7);

        //niezgodne z formula hermetyzacji
        System.out.println(osobaJas.imie);
        System.out.println(osobaJas.nazwisko);

        System.out.println(osobaJas.getImie());
        System.out.println(osobaJas.getNazwisko());
        osobaJas.setImie("Jan");


    }
}