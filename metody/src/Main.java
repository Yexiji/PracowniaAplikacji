void main() {
    System.out.println("Wiek: " + pobierzWiek());
    System.out.println("Imię: " + pobierzImie());

    dzialania(10, 4);

    System.out.println("Czy 4 jest parzysta: " + czyParzysta(4));
    System.out.println("Czy 15 jest podzielna przez 3 i 5: " + czyPodzielnaPrzez3i5(15));
    System.out.println("2 do potęgi 3: " + doPotegiTrzeciej(2));
    System.out.println("Pierwiastek z 16: " + pierwiastekKwadratowy(16));
    System.out.println("Czy trójkąt prostokątny (3, 4, 5): " + czyTrojkatProstokatny(3, 4, 5));
    System.out.println("Ostatni znak w 'Witaj': " + ostatniZnak("Witaj"));
    System.out.println("Czy 'Kajak' to palindrom: " + czyPalindrom("Kajak"));

    int[] tablica = {1, 7, 20, 100};
    System.out.println("Suma tablicy: " + sumaTablicy(tablica));

    int liczbaLiterA = zliczWystapienia("Ala ma kota", 'a');
    System.out.println("Liczba liter 'a': " + liczbaLiterA);
}

// Zadanie 1
public int pobierzWiek() {
    return 18;
}

// Zadanie 2
public String pobierzImie() {
    return "Maks";
}

// Zadanie 3
public void dzialania(double a, double b) {
    System.out.println("Suma: " + (a + b));
    System.out.println("Różnica: " + (a - b));
    System.out.println("Iloczyn: " + (a * b));
}

// Zadanie 4
public boolean czyParzysta(int liczba) {
    return liczba % 2 == 0;
}

// Zadanie 5
public boolean czyPodzielnaPrzez3i5(int liczba) {
    return liczba % 3 == 0 && liczba % 5 == 0;
}

// Zadanie 6
public double doPotegiTrzeciej(double liczba) {
    return Math.pow(liczba, 3);
}

// Zadanie 7
public double pierwiastekKwadratowy(double liczba) {
    return Math.sqrt(liczba);
}

// Zadanie 8
public boolean czyTrojkatProstokatny(double a, double b, double c) {
    double a2 = a * a;
    double b2 = b * b;
    double c2 = c * c;

    return (a2 + b2 == c2) || (a2 + c2 == b2) || (b2 + c2 == a2);
}

// Zadanie 9
public char ostatniZnak(String teksty) {
    return teksty.charAt(teksty.length() - 1);
}

// Zadanie 10
public boolean czyPalindrom(String tekst) {
    String czysty = tekst.toLowerCase();
    String odwrocony = new StringBuilder(czysty).reverse().toString();
    return czysty.equals(odwrocony);
}

// Zadanie 11
public int sumaTablicy(int[] tablica) {
    int suma = 0;
    for (int liczba : tablica) {
        suma += liczba;
    }
    return suma;
}

// Zadanie 12
public int zliczWystapienia(String tekst, char znak) {
    int licznik = 0;
    for (int i = 0; i < tekst.length(); i++) {
        if (tekst.charAt(i) == znak) {
            licznik++;
        }
    }
    return licznik;
}