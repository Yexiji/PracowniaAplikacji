// Zadanie 1
static int wiek() {
    return 18;
}


// Zadanie 2
static String imie() {
    return "Maks";
}


// Zadanie 3
static void oblicz(int a, int b) {
    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
}


// Zadanie 4
static boolean parzysta(int a) {
    return a % 2 == 0;
}


// Zadanie 5
static boolean podzielna(int a) {
    return a % 3 == 0 && a % 5 == 0;
}


// Zadanie 6
static int potega(int a) {
    return a * a * a;
}


// Zadanie 7
static double pierwiastek(double a) {
    return Math.sqrt(a);
}


// Zadanie 8
static boolean trojkat(int a, int b, int c) {

    if (a * a == b * b + c * c)
        return true;

    if (b * b == a * a + c * c)
        return true;

    if (c * c == a * a + b * b)
        return true;

    return false;
}


// Zadanie 9
static char ostatni(String tekst) {
    return tekst.charAt(tekst.length() - 1);
}


// Zadanie 11
static int suma(int[] tablica) {

    int suma = 0;

    for (int i = 0; i < tablica.length; i++) {
        suma = suma + tablica[i];
    }

    return suma;
}


// Zadanie 12
static int zlicz(String tekst, char znak) {

    int licznik = 0;

    for (int i = 0; i < tekst.length(); i++) {
        if (tekst.charAt(i) == znak)
            licznik++;
    }

    return licznik;
}
void main() {

    System.out.println(wiek());

    System.out.println(imie());

    oblicz(10, 5);

    System.out.println(parzysta(4));

    System.out.println(podzielna(15));

    System.out.println(potega(3));

    System.out.println(pierwiastek(25));

    System.out.println(trojkat(3, 4, 5));

    System.out.println(ostatni("Witaj"));

    int[] tablica = {1, 7, 20, 100};

    System.out.println(suma(tablica));

    System.out.println(zlicz("Ala ma kota", 'a'));
}
