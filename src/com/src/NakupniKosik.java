package com.src;

public class NakupniKosik {
    public static void main(String[] args){
        String veci[] = {"Rohlik", "Maslo", "Cesnek", "Cibule", "Brambora", "Mleko", "Caj", "Houska"};
        int ceny[] = {2, 20, 5, 10, 2, 10, 8, 3};
        int finalcena = 0;

        if(args.length == 0){
            System.out.println("Tady jsou produkty.");
            for (int i = 0; i < veci.length; i++){
                System.out.println(i + " - " + veci[i] + " - " + ceny[i] + "Kc.");
            }
        }

        else{
            for (int i = 0; i < args.length; i++){
                if(Integer.parseInt(args[i]) <= veci.length-1){
                    System.out.println(args[i] + " - " + veci[Integer.parseInt(args[i])] + " - " + ceny[Integer.parseInt(args[i])] + "Kc.");
                    finalcena += ceny[Integer.parseInt(args[i])];
                }

                else{
                    System.out.println("Nenasel jsem produkt " + args[i]);
                }
            }
            System.out.println("Finalni cena je " + finalcena + "Kc.");
        }
    }
}
