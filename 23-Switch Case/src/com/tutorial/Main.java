/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;
import java.util.*;


/**
 *
 * @author USER
 * Nama: Santi
 * Kelas: TI-IB
 * Pertemuan 13-14
 */
public class Main {
    // switch case

    public static void main(String[] args){

        String input;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("panggil nama: ");
        input = inputUser.next();

        // ekspresinya berupa satuan (int,long,byte,short), String, atau enum
        switch(input){
            case "sunta":
                System.out.println("saya sunta dan hadir Bos !!!");
                break;
            case "sinta":
                System.out.println("saya sinta dan hadir Bos!!!!");
                break;
            case "santi":
                System.out.println("saya santi dan hadir Bos!!!!");
                break;
            default:
                System.out.println(input + " tidak hadir Bos!!!");
        }

        System.out.println("selesai program");

    }
}
