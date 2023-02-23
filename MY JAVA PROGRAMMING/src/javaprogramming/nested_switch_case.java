package javaprogramming;

import java.util.Scanner;

public class nested_switch_case {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        String dep = n.next();
        int id = n.nextInt();

        switch (id) {
            case 100 -> System.out.println("CODEX");
            case 200 -> System.out.println("CODEX CODER");
            case 300 -> {
                System.out.println("CODER");
                switch (dep) {
                    case "IT" -> System.out.println("Departement IT");
                    case "CSE" -> System.out.println("Departement CSE");
                    case "AI" -> System.out.println("Departement AI");
                    default -> System.out.println("No branch are valid");
                }
            }
            case 400 -> System.out.println("BABA CODEX");
            case 500 -> {
                System.out.println("CODEX JI");
                switch (dep) {
                    case "IT" -> System.out.println("Departement IT");
                    case "CSE" -> System.out.println("Departement CSE");
                    case "AI" -> System.out.println("Departement AI");
                    default -> System.out.println("No branch are valid");
                }
            }
            default -> System.out.println("Enter Valid Id");
        }
    }

}
