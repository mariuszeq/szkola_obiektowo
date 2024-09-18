public class Main {
    public static void main(String[] args) {
        System.out.println("Klasy piszemy z duzej litery");

        Osoba osobaJas = new Osoba("Jas", "Sliwka", 10);

        //niezgodne z formula hermetyzacji
        System.out.println(osobaJas.imie);
        System.out.println(osobaJas.nazwisko);

        System.out.println(osobaJas.getImie());
        System.out.println(osobaJas.getNazwisko());
        osobaJas.setImie("Jan");
        System.out.println(osobaJas.getImie());



        Osoba osobax = new Osoba();

        System.out.println(osobaJas);
        Uczen uczen = new Uczen("Daniel", "Stary");
        System.out.println("liczba ucziow" + Uczen.liczbaobiektow);
        Uczen uczen2 = new Uczen("Adam", "Nowak");
        System.out.println("liczba ucziow" + Uczen.liczbaobiektow);
        Uczen uczen3 = new Uczen("Jarek", "Jablonski");
        System.out.println("liczba ucziow" + Uczen.liczbaobiektow);

        System.out.println(uczen);

        Nauczyciel nauczycielSlowik = new Nauczyciel("Arek", "Slowik", 34, "Polski");
        System.out.println(nauczycielSlowik);

    }


}