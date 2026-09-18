void main() {

    // Zadanie 1
    System.out.println("Ania");
    System.out.println("Bartek");
    System.out.println("Kasia");


    // Zadanie 2
    String imie = "Maks";
    int urodzenie = 2007;
    double ulamek = 0.66;


    // Zadanie 3
    System.out.println("Mam na imię " + imie + ", mam " + (2026 - urodzenie) + " lat i będę pisać maturę za " + ulamek + " roku.");


    // Zadanie 4
    Scanner scanner = new Scanner(System.in);

    System.out.print("Podaj temperaturę w stopniach Celsjusza: ");
    double stopnie = scanner.nextDouble();

    double farenhajt = 1.8 * stopnie + 32.0;

    System.out.println("Temperatura w Fahrenheitach: " + farenhajt);


    // Zadanie 5
    System.out.print("Podaj 3 boki trójkąta: ");

    double bok1 = scanner.nextDouble();
    double bok2 = scanner.nextDouble();
    double bok3 = scanner.nextDouble();

    double obwod = bok1 + bok2 + bok3;

    System.out.println("Obwód: " + obwod);


    // Zadanie 6
    System.out.println("Podaj 3 słowa:");

    String slowo1 = scanner.next();
    String slowo2 = scanner.next();
    String slowo3 = scanner.next();

    System.out.println(slowo3 + ", " + slowo2 + ", " + slowo1);


    // Zadanie 7
    System.out.print("Podaj wyraz: ");

    String slowo = scanner.next();

    System.out.println(slowo.length());


    // Zadanie 8
    int x = 5;
    int y = 2;

    double wynik = (double) x / y;

    System.out.println(wynik);


    // Zadanie 9
    System.out.print("Podaj słowo: ");

    String slowo4 = scanner.next();

    System.out.println(slowo4.toUpperCase());


    // Zadanie 10
    System.out.print("Podaj promień: ");

    int promien = scanner.nextInt();

    double pole = Math.PI * promien * promien;

    System.out.println("Pole koła: " + pole);
}
