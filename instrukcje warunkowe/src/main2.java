void main() {

    Scanner scanner = new Scanner(System.in);


    // Zadanie 1
    System.out.println("ZADANIE 1");

    System.out.print("Podaj liczbe: ");
    int liczba = scanner.nextInt();

    if (liczba % 3 == 0) {
        System.out.println("Liczba jest podzielna przez 3");
    } else {
        System.out.println("Liczba nie jest podzielna przez 3");
    }


    // Zadanie 2
    System.out.println();
    System.out.println("ZADANIE 2");

    System.out.print("Podaj pierwszy bok: ");
    double a = scanner.nextDouble();

    System.out.print("Podaj drugi bok: ");
    double b = scanner.nextDouble();

    System.out.print("Podaj trzeci bok: ");
    double c = scanner.nextDouble();

    if (a + b > c && a + c > b && b + c > a) {
        System.out.println("Mozna zbudowac trojkat");
    } else {
        System.out.println("Nie mozna zbudowac trojkata");
    }


    // Zadanie 3
    System.out.println();
    System.out.println("ZADANIE 3");

    System.out.print("Podaj pierwsza liczbe: ");
    double liczba1 = scanner.nextDouble();

    System.out.print("Podaj druga liczbe: ");
    double liczba2 = scanner.nextDouble();

    if (liczba1 > liczba2) {
        System.out.println("Najwieksza liczba to: " + liczba1);
    } else {
        System.out.println("Najwieksza liczba to: " + liczba2);
    }


    // Zadanie 4
    System.out.println();
    System.out.println("ZADANIE 4");

    System.out.print("Podaj pierwsza liczbe: ");
    double liczba3 = scanner.nextDouble();

    System.out.print("Podaj druga liczbe: ");
    double liczba4 = scanner.nextDouble();

    System.out.print("Podaj trzecia liczbe: ");
    double liczba5 = scanner.nextDouble();

    double najwieksza = liczba3;

    if (liczba4 > najwieksza) {
        najwieksza = liczba4;
    }

    if (liczba5 > najwieksza) {
        najwieksza = liczba5;
    }

    System.out.println("Najwieksza liczba to: " + najwieksza);


    // Zadanie 5
    System.out.println();
    System.out.println("ZADANIE 5");

    System.out.print("Podaj numer miesiaca: ");
    int miesiac = scanner.nextInt();

    switch (miesiac) {
        case 1:
            System.out.println("Styczen");
            break;
        case 2:
            System.out.println("Luty");
            break;
        case 3:
            System.out.println("Marzec");
            break;
        case 4:
            System.out.println("Kwiecien");
            break;
        case 5:
            System.out.println("Maj");
            break;
        case 6:
            System.out.println("Czerwiec");
            break;
        case 7:
            System.out.println("Lipiec");
            break;
        case 8:
            System.out.println("Sierpien");
            break;
        case 9:
            System.out.println("Wrzesien");
            break;
        case 10:
            System.out.println("Pazdziernik");
            break;
        case 11:
            System.out.println("Listopad");
            break;
        case 12:
            System.out.println("Grudzien");
            break;
        default:
            System.out.println("Nieprawidlowy numer miesiaca");
    }


    // Zadanie 6
    System.out.println();
    System.out.println("ZADANIE 6");

    System.out.print("Podaj swoje imie: ");
    String imie = scanner.next();

    if (imie.equals("Maks")) {
        System.out.println("Mamy takie samo imie");
    } else {
        System.out.println("Mamy rozne imiona");
    }


    // Zadanie 7
    System.out.println();
    System.out.println("ZADANIE 7");

    System.out.print("Podaj swoj wiek: ");
    int wiek = scanner.nextInt();

    boolean pelnoletni = wiek >= 18 ? true : false;

    System.out.println("Czy jestes pelnoletni: " + pelnoletni);


    // Zadanie 8
    System.out.println();
    System.out.println("ZADANIE 8");

    System.out.print("Podaj rok: ");
    int rok = scanner.nextInt();

    if ((rok % 4 == 0 && rok % 100 != 0) || rok % 400 == 0) {
        System.out.println("Rok jest przestepny");
    } else {
        System.out.println("Rok nie jest przestepny");
    }


    // Zadanie 9
    System.out.println();
    System.out.println("ZADANIE 9");

    System.out.print("Podaj wage w kg: ");
    double waga = scanner.nextDouble();

    System.out.print("Podaj wzrost w metrach: ");
    double wzrost = scanner.nextDouble();

    double bmi = waga / (wzrost * wzrost);

    System.out.println("BMI: " + bmi);

    if (bmi > 18.5 && bmi < 24.9) {
        System.out.println("waga prawidlowa");
    } else if (bmi < 18.5) {
        System.out.println("niedowaga");
    } else {
        System.out.println("nadwaga");
    }


    // Zadanie 10
    System.out.println();
    System.out.println("ZADANIE 10");

    double cena;
    int raty;

    while (true) {
        System.out.print("Podaj cene towaru: ");
        cena = scanner.nextDouble();

        if (cena >= 100 && cena <= 10000) {
            break;
        }

        System.out.println("Cena musi byc od 100 do 10000 zl.");
    }

    while (true) {
        System.out.print("Podaj liczbe rat: ");
        raty = scanner.nextInt();

        if (raty >= 6 && raty <= 48) {
            break;
        }

        System.out.println("Liczba rat musi byc od 6 do 48.");
    }

    double oprocentowanie;

    if (raty <= 12) {
        oprocentowanie = 0.025;
    } else if (raty <= 24) {
        oprocentowanie = 0.05;
    } else {
        oprocentowanie = 0.10;
    }

    double kwota = cena + cena * oprocentowanie;
    double rata = kwota / raty;

    System.out.println("Miesieczna rata: " + rata + " zl");


    // Zadanie 11
    System.out.println();
    System.out.println("ZADANIE 11");

    System.out.println("Prosty kalkulator");

    System.out.print("Podaj pierwsza liczbe: ");
    double pierwsza = scanner.nextDouble();

    System.out.print("Podaj dzialanie (+, -, *, /): ");
    String dzialanie = scanner.next();

    System.out.print("Podaj druga liczbe: ");
    double druga = scanner.nextDouble();

    double wynik;

    switch (dzialanie) {

        case "+":
            wynik = pierwsza + druga;
            System.out.println("Wynik: " + wynik);
            break;

        case "-":
            wynik = pierwsza - druga;
            System.out.println("Wynik: " + wynik);
            break;

        case "*":
            wynik = pierwsza * druga;
            System.out.println("Wynik: " + wynik);
            break;

        case "/":
            if (druga == 0) {
                System.out.println("Nie mozna dzielic przez zero");
            } else {
                wynik = pierwsza / druga;
                System.out.println("Wynik: " + wynik);
            }
            break;

        default:
            System.out.println("Nieprawidlowy symbol dzialania");
    }
}
