package com.example.demo.wavedash;

import java.nio.charset.Charset;

import javax.xml.bind.DatatypeConverter;

public class Main0 {
    public static void main(String[] args) {
        printCP932("8160");
        printCP932("8161");
        printCP932("817C");
        printCP932("8191");
        printCP932("8192");
        printCP932("81CA");
        printCP932("815C");

        // ～ EFBD9E
        // ∥ E288A5
        // － EFBC8D
        // ￠ EFBFA0
        // ￡ EFBFA1
        // ￢ EFBFA2
        // ― E28095

        printSJIS("8160");
        printSJIS("8161");
        printSJIS("817C");
        printSJIS("8191");
        printSJIS("8192");
        printSJIS("81CA");
        printSJIS("815C");

        // ? E3809C
        // ? E28096
        // ? E28892
        // ￠ C2A2
        // ￡ C2A3
        // ￢ C2AC
        // ? E28094
    }

    public static void printCP932(String hex) {
        String win31 = new String(DatatypeConverter.parseHexBinary(hex), Charset.forName("Windows-31J"));
        System.out.print("\t\t// " + win31);
        System.out.print(" ");
        for (Byte b : win31.getBytes(Charset.forName("UTF-8"))) {
            System.out.print(String.format("%02X", b));
        }
        System.out.println("");
    }

    public static void printSJIS(String hex) {
        String win31 = new String(DatatypeConverter.parseHexBinary(hex), Charset.forName("SJIS"));
        System.out.print("\t\t// " + win31);
        System.out.print(" ");
        for (Byte b : win31.getBytes(Charset.forName("UTF-8"))) {
            System.out.print(String.format("%02X", b));
        }
        System.out.println("");
    }
}
