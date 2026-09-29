void main() {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();


    // ZADANIE 1


    System.out.println("===== ZADANIE 1 =====");

    int[] tablica1 = {10, 20, 30, 40, 50, 60};
    int[] tablica2 = {1, 2, 3, 4, 5};

    System.out.println("Co drugi element pierwszej tablicy:");

    for (int i = 0; i < tablica1.length; i += 2) {
        System.out.println(tablica1[i]);
    }

    System.out.println("Co drugi element drugiej tablicy:");

    for (int i = 0; i < tablica2.length; i += 2) {
        System.out.println(tablica2[i]);
    }



    // ZADANIE 2


    System.out.println("\n===== ZADANIE 2 =====");

    int[] liczby2 = {5, 12, 3, 25, 8, 17};

    int najwieksza = liczby2[0];

    for (int i = 1; i < liczby2.length; i++) {

        if (liczby2[i] > najwieksza) {
            najwieksza = liczby2[i];
        }
    }

    System.out.println("Największa liczba: " + najwieksza);



    // ZADANIE 3


    System.out.println("\n===== ZADANIE 3 =====");

    String[] slowa3 = {"ala", "kot", "samochod", "dom", "java"};

    for (String slowo : slowa3) {
        System.out.println(slowo.toUpperCase());
    }



    // ZADANIE 4


    System.out.println("\n===== ZADANIE 4 =====");

    String[] slowa4 = new String[5];

    for (int i = 0; i < 5; i++) {

        System.out.print("Podaj słowo: ");
        slowa4[i] = scanner.nextLine();
    }

    System.out.println("Słowa od końca:");

    for (int i = 4; i >= 0; i--) {

        String odwrocone = "";

        for (int j = slowa4[i].length() - 1; j >= 0; j--) {

            odwrocone = odwrocone + slowa4[i].charAt(j);
        }

        System.out.println(odwrocone);
    }



    // ZADANIE 5


    System.out.println("\n===== ZADANIE 5 =====");

    int[] liczby5 = new int[8];

    for (int i = 0; i < liczby5.length; i++) {

        System.out.print("Podaj liczbę: ");
        liczby5[i] = scanner.nextInt();
    }


    for (int i = 0; i < liczby5.length - 1; i++) {

        int najmniejszy = i;

        for (int j = i + 1; j < liczby5.length; j++) {

            if (liczby5[j] < liczby5[najmniejszy]) {
                najmniejszy = j;
            }
        }

        int pomocnicza = liczby5[i];
        liczby5[i] = liczby5[najmniejszy];
        liczby5[najmniejszy] = pomocnicza;
    }

    System.out.println("Posortowana tablica:");

    for (int i = 0; i < liczby5.length; i++) {
        System.out.print(liczby5[i] + " ");
    }

    System.out.println();



    // ZADANIE 6


    System.out.println("\n===== ZADANIE 6 =====");

    int[] liczby6 = new int[5];

    for (int i = 0; i < liczby6.length; i++) {

        System.out.print("Podaj liczbę: ");
        liczby6[i] = scanner.nextInt();
    }

    for (int i = 0; i < liczby6.length; i++) {

        long silnia = 1;

        for (int j = 1; j <= liczby6[i]; j++) {
            silnia = silnia * j;
        }

        System.out.println(liczby6[i] + "! = " + silnia);
    }



    // ZADANIE 7


    System.out.println("\n===== ZADANIE 7 =====");

    String[] tablica7a = {"Ala", "ma", "kota"};
    String[] tablica7b = {"Ala", "ma", "kota"};

    boolean takieSame = true;

    if (tablica7a.length != tablica7b.length) {

        takieSame = false;

    } else {

        for (int i = 0; i < tablica7a.length; i++) {

            if (!tablica7a[i].equals(tablica7b[i])) {
                takieSame = false;
            }
        }
    }

    if (takieSame) {
        System.out.println("Tablice są takie same.");
    } else {
        System.out.println("Tablice nie są takie same.");
    }



    // ZADANIE 8


    System.out.println("\n===== ZADANIE 8 =====");

    int[] tablica8 = new int[10];


    for (int i = 0; i < tablica8.length; i++) {

        tablica8[i] = random.nextInt(21) - 10;
    }


    System.out.println("Tablica:");

    for (int i = 0; i < tablica8.length; i++) {
        System.out.print(tablica8[i] + " ");
    }

    System.out.println();


    int najmniejsza8 = tablica8[0];
    int najwieksza8 = tablica8[0];

    for (int i = 1; i < tablica8.length; i++) {

        if (tablica8[i] < najmniejsza8) {
            najmniejsza8 = tablica8[i];
        }

        if (tablica8[i] > najwieksza8) {
            najwieksza8 = tablica8[i];
        }
    }


    int suma8 = 0;

    for (int i = 0; i < tablica8.length; i++) {
        suma8 = suma8 + tablica8[i];
    }


    double srednia8 = (double) suma8 / tablica8.length;


    int mniejsze8 = 0;
    int wieksze8 = 0;

    for (int i = 0; i < tablica8.length; i++) {

        if (tablica8[i] < srednia8) {
            mniejsze8++;
        }

        if (tablica8[i] > srednia8) {
            wieksze8++;
        }
    }

    System.out.println("Najmniejsza: " + najmniejsza8);
    System.out.println("Największa: " + najwieksza8);
    System.out.println("Średnia: " + srednia8);
    System.out.println("Mniejszych od średniej: " + mniejsze8);
    System.out.println("Większych od średniej: " + wieksze8);

    System.out.println("Tablica od końca:");

    for (int i = tablica8.length - 1; i >= 0; i--) {
        System.out.print(tablica8[i] + " ");
    }

    System.out.println();



    // ZADANIE 9


    System.out.println("\n===== ZADANIE 9 =====");

    int[] tablica9 = new int[20];


    for (int i = 0; i < tablica9.length; i++) {

        tablica9[i] = random.nextInt(10) + 1;
    }


    System.out.println("Tablica:");

    for (int i = 0; i < tablica9.length; i++) {
        System.out.print(tablica9[i] + " ");
    }

    System.out.println();


    for (int liczba = 1; liczba <= 10; liczba++) {

        int ile = 0;

        for (int i = 0; i < tablica9.length; i++) {

            if (tablica9[i] == liczba) {
                ile++;
            }
        }

        System.out.println(liczba + " występuje " + ile + " razy");
    }

}
