void main () {

    Scanner scanner = new Scanner(System.in);

// ZADANIE 1
    System.out.println("ZADANIE 1");
    System.out.print("Podaj liczbę: ");
    int liczba1 = scanner.nextInt();

    for (int i = 1; i <= liczba1; i += 2) {
        System.out.println(i);
    }


// ZADANIE 2
    System.out.println("ZADANIE 2");
    System.out.print("Podaj liczbę: ");
    int liczba2 = scanner.nextInt();

    int potega = 1;

    while (potega <= liczba2) {
        System.out.println(potega);
        potega = potega * 2;
    }


// ZADANIE 3
    System.out.println("ZADANIE 3");
    System.out.println("Podawaj liczby. 0 kończy program.");

    int liczba3;
    int suma3 = 0;

    do {
        liczba3 = scanner.nextInt();
        suma3 = suma3 + liczba3;
    } while (liczba3 != 0);

    System.out.println("Suma: " + suma3);


// ZADANIE 4
    System.out.println("ZADANIE 4");
    System.out.println("Podawaj liczby. 0 kończy program.");

    int liczba4;
    int suma4 = 0;
    int ilosc4 = 0;
    int najmniejsza = 0;
    int najwieksza = 0;

    do {
        liczba4 = scanner.nextInt();

        if (liczba4 != 0) {

            if (ilosc4 == 0) {
                najmniejsza = liczba4;
                najwieksza = liczba4;
            }

            if (liczba4 < najmniejsza) {
                najmniejsza = liczba4;
            }

            if (liczba4 > najwieksza) {
                najwieksza = liczba4;
            }

            suma4 = suma4 + liczba4;
            ilosc4++;
        }

    } while (liczba4 != 0);

    if (ilosc4 > 0) {
        System.out.println("Najmniejsza: " + najmniejsza);
        System.out.println("Największa: " + najwieksza);
        System.out.println("Suma najmniejszej i największej: " + (najmniejsza + najwieksza));

        double srednia = (double) suma4 / ilosc4;
        System.out.println("Średnia: " + srednia);
    } else {
        System.out.println("Nie podano żadnych liczb.");
    }


// ZADANIE 5
    System.out.println("ZADANIE 5");

    Random random = new Random();
    int wylosowana = random.nextInt(100) + 1;

    int strzal;

    do {
        System.out.print("Zgadnij liczbę od 1 do 100: ");
        strzal = scanner.nextInt();

        if (strzal > wylosowana) {
            System.out.println("Podałeś za dużą wartość");
        } else if (strzal < wylosowana) {
            System.out.println("Podałeś za małą wartość");
        } else {
            System.out.println("Gratulacje");
        }

    } while (strzal != wylosowana);


// ZADANIE 6
    System.out.println("ZADANIE 6");

    System.out.print("Podaj znak: ");
    char znak = scanner.next().charAt(0);

    System.out.print("Podaj x: ");
    int x = scanner.nextInt();

    System.out.print("Podaj y: ");
    int y = scanner.nextInt();

    System.out.print("Podaj długość a: ");
    int a = scanner.nextInt();

    System.out.print("Podaj długość b: ");
    int b = scanner.nextInt();

// Puste linie przed prostokątem
    for (int i = 1; i < y; i++) {
        System.out.println();
    }

// Prostokąt
    for (int i = 0; i < b; i++) {

// Spacje przed prostokątem
        for (int j = 1; j < x; j++) {
            System.out.print(" ");
        }

// Znaki prostokąta
        for (int j = 0; j < a; j++) {
            System.out.print(znak);
        }

        System.out.println();
    }


// ZADANIE 7
    System.out.println("ZADANIE 7");

    System.out.print("Podaj wysokość choinki: ");
    int n = scanner.nextInt();

    for (int i = 1; i <= n; i++) {

// Spacje
        for (int j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }

// Gwiazdki
        for (int j = 1; j <= 2 * i - 1; j++) {
            System.out.print("*");
        }

        System.out.println();
    }


// ZADANIE 8
    System.out.println("ZADANIE 8");

    System.out.print("Podaj liczbę: ");
    int liczba8 = scanner.nextInt();

    int silnia = 1;

    for (int i = 1; i <= liczba8; i++) {
        silnia = silnia * i;
    }

    System.out.println("Silnia: " + silnia);


// ZADANIE 9
    System.out.println("ZADANIE 9");

    System.out.print("Podaj słowo: ");
    String slowo = scanner.next();

    String odwrocone = "";

    for (int i = slowo.length() - 1; i >= 0; i--) {
        odwrocone = odwrocone + slowo.charAt(i);
    }

    if (slowo.equals(odwrocone)) {
        System.out.println("To jest palindrom");
    } else {
        System.out.println("To nie jest palindrom");
    }


// ZADANIE 10
    System.out.println("ZADANIE 10");

    petlaGlowna:
    for (int i = 1; i <= 10; i++) {

        if (i % 2 != 0) {
            continue;
        }

        for (int j = 1; j <= 10; j++) {

            System.out.println(j);

            if (j > i) {
                continue petlaGlowna;
            }
        }
    }
}