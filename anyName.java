import java.util.Scanner;

public class anyName {
// public class AlphabetGenerator {

    static  void alphaA(int i, int n) {


        for (int j = 0; j < n; j++) {

            if ((j == 0 || j == n - 1) && i != 0 || i == n / 2 || (j != 0 && j != n - 1) && i == 0) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }

        }
        System.out.print(" ");
    }


    static  void alphaB(int i, int n) {

        for (int j = 0; j < n; j++) {
            if (j == 0 || i == n / 2 && j <= n - 2 || i == 0 && j != n - 1 || i == n - 1 && j != n - 1 || (i != 0 && i != n / 2 && i != n - 1) && j == n - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }

        System.out.print(" ");

    }


    static  void alphaC(int i, int n) {

        for (int j = 0; j < n; j++) {
            if (j == 0 && (i != 0 && i != n - 1) || i == 0 && j != 0 || i == n - 1 && j != 0) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");
    }


    static  void alphaD(int i, int n) {

        for (int j = 0; j < n; j++) {
            if (j == 1 || i == 0 && j != n - 1 || i == n - 1 && j != n - 1 || j == n - 1 && (i != 0 && i != n - 1)) {
                System.out.print("*");

            } else {
                System.out.print(" ");
            }

        }
        System.out.print(" ");

    }


    static  void alphaE(int i, int n) {

        for (int j = 0; j < 3 * n / 4; j++) {
            if (j == 0 || i == 0 && j <= n || i == n / 2 && j <= n || i == n - 1 && j <= n) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }

            System.out.print(" ");

        }
    }

    static  void alphaF(int i, int n) {

        for (int j = 0; j < n; j++) {
            if (j == 0 || i == 0 && j <= 3 * n / 4 || i == n / 2 && j <= 3 * n / 4) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }

        System.out.print(" ");
    }

    static  void alphaG(int i, int n) {

        for (int j = 0; j < n; j++) {

            if (j == 0 && (i != 0 && i != n - 1) || i == 0 && (j <= 3 * n / 4 && j != 0) || i == n - 1 && (j <= (3 * n / 4) - 1 && j != 0) || i >= n / 2 && j == (3 * n / 4) - 1
                    || i == n / 2 && j >= n - 1 || i >= n / 2 && j == n - 1 || i == n / 2 && j > (3 * n / 4) - 2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }

        }

        System.out.print(" ");

    }

    static  void alphaH(int i, int n) {

        for (int j = 0; j < n; j++) {
            if (j == 0 || j == n - 1 || i == n / 2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");
    }

    static  void alphaI(int i, int n) {

        for (int j = 0; j < n; j++) {
            if (i == 0 || i == n - 1 || j == n / 2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");
    }

    static  void alphaJ(int i, int n) {

        for (int j = 0; j < n; j++) {
            if (i == 0 || j == n / 2 || i >= 3 * n / 4 && j == 0 || i == n - 1 && j <= n / 2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }

        System.out.print(" ");

    }

    static  void alphaK(int i, int n) {

        for (int j = 0; j < n; j++) {
            if (j == 0 || j + i == (3 * n / 4) - 1 || i - j == (3 * n / 4) - 3) {            //wut
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    static  void alphaL(int i, int n) {
        for (int j = 0; j < n; j++) {
            if (j == 0 || i == n - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }

        System.out.print(" ");
    }

    static  void alphaM(int i, int n) {
        for (int j = 0; j < n; j++) {
            if (j == 0 || j == n - 1 || i <= n / 2 && j == i || i + j == n - 1 && i <= n / 2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");

    }

    static  void alphaN(int i, int n) {

        for (int j = 0; j < n; j++) {
            if (j == 0 || j == n - 1 || j == i) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");

    }

    static  void alphaO(int i, int n) {

        for (int j = 0; j < n; j++) {
            if (i == 0 && (j != 0 && j != n - 1) || j == 0 && (i != 0 && i != n - 1) || i == n - 1 && (j != 0 && j != n - 1) || j == n - 1 && (i != 0 && i != n - 1)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");

    }

    static  void alphaP(int i, int n) {

        for (int j = 0; j < n; j++) {
            if (j == 0 && i != 0 || i == 0 && (j != 0 && j != n - 1) || i <= n / 2 && i != 0 && i != n / 2 && j == n - 1 || i == n / 2 && j != n - 1 && j != 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }

        System.out.print(" ");

    }

    static  void alphaQ(int i, int n) {
        for (int j = 0; j < n; j++) {
            if (i == 0 && (j != 0 && j != n - 1) || j == 0 && (i != 0 && i <= n - 3 && i != n - 3) || i == n - 3 && (j != 0 && j != n - 1)
                    || j == n - 1 && (i != 0 && i != n - 3 && i <= n - 3) || i == j && i >= n - 4) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");

    }

    static  void alphaR(int i, int n) {
        for (int j = 0; j < n; j++) {
            if (j == 0 || i == 0 && j != n - 1 || j == n - 1 && i <= n / 2 && i != 0 && i != n / 2 || i == n / 2 && j != n - 1 || i >= n / 2 && i == j) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }

        }
        System.out.print(" ");

    }

    static  void alphaS(int i, int n) {

        for (int j = 0; j < n; j++) {
            if (i == 0 && (j != 0 && j != n - 1) || i == 1 && j == n - 1 || j == 0 && i <= n / 2 && i != 0 && i != n / 2 || i == n / 2 && j != 0 && j != n - 1
                    || j == n - 1 && i != n / 2 && i != n - 1 && i >= n / 2 || i == n - 1 && j != 0 && j != n - 1 || i == n - 2 && j == 0) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");

    }

    static  void alphaT(int i, int n) {
        for (int j = 0; j < n; j++) {
            if (i == 0 || j == n / 2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");
    }

    static  void alphaU(int i, int n) {

        for (int j = 0; j < n; j++) {
            if (j == 0 && i != n - 1 || j == n - 1 && i != n - 1 || i == n - 1 && j != 0 && j != n - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");

    }

    static  void alphaV(int i, int n) {
        for (int j = 0; j < n; j++) {
            if (i - j == n / 2 || i + j == n + n / 2 - 1 || j == 0 && i <= n / 2 || j == n - 1 && i <= n / 2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }

        System.out.print(" ");
    }

    static  void alphaW(int i, int n) {
        for (int j = 0; j < n; j++) {
            if (j == 0 || j == n - 1 || i >= n / 2 && j == i || i >= n / 2 && j == n - i - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");

    }

    static  void alphaX(int i, int n) {
        for (int j = 0; j < n; j++) {
            if (i == j || i == n - j - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");
    }

    static  void alphaY(int i, int n) {
        for (int j = 0; j < n; j++) {
            if (i <= n / 2 && j == i || i <= n / 2 && j == n - i - 1 || j == n / 2 && i >= n / 2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");

    }

     static  void alphaZ(int i, int n) {
        for (int j = 0; j < n; j++) {
            if (i == 0 || j == n - i - 1 || i == n - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");
    }

// }

    public static  void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter any name: ");
        String words = sc.nextLine().toUpperCase().replaceAll(" ", "      ")
                .replaceAll("[1-9]", "").trim();
        int n = 7;


        for (int i = 0; i < n; i++) {


            for (int c = 0; c < words.length(); c++) {

                System.out.print(" "); //For a margin at the beginning

                switch (words.charAt(c)) {
                    case 'A':
                        alphaA(i, n);
                        break;
                    case 'B':
                        alphaB(i, n);
                        break;
                    case 'C':
                        alphaC(i, n);
                        break;
                    case 'D':
                        alphaD(i, n);
                        break;
                    case 'E':
                        alphaE(i, n);
                        break;
                    case 'F':
                        alphaF(i, n);
                        break;
                    case 'G':
                        alphaG(i, n);
                        break;
                    case 'H':
                        alphaH(i, n);
                        break;
                    case 'I':
                        alphaI(i, n);
                        break;
                    case 'J':
                        alphaJ(i, n);
                        break;
                    case 'K':
                        alphaK(i, n);
                        break;
                    case 'L':
                        alphaL(i, n);
                        break;
                    case 'M':
                        alphaM(i, n);
                        break;
                    case 'N':
                        alphaN(i, n);
                        break;
                    case 'O':
                        alphaO(i, n);
                        break;
                    case 'P':
                        alphaP(i, n);
                        break;
                    case 'Q':
                        alphaQ(i, n);
                        break;
                    case 'R':
                        alphaR(i, n);
                        break;
                    case 'S':
                        alphaS(i, n);
                        break;
                    case 'T':
                        alphaT(i, n);
                        break;
                    case 'U':
                        alphaU(i, n);
                        break;
                    case 'V':
                        alphaV(i, n);
                        break;
                    case 'W':
                        alphaW(i, n);
                        break;
                    case 'X':
                        alphaX(i, n);
                        break;
                    case 'Y':
                        alphaY(i, n);
                        break;
                    case 'Z':
                        alphaZ(i, n);
                        break;

                    default:
                        break;
                }
            }


            System.out.println();
        }
        sc.close();
    }
}

