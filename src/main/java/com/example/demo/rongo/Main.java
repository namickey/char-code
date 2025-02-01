package com.example.demo.rongo;
import javax.xml.bind.DatatypeConverter;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {

        convertBinary("剛毅朴訥、", Charset.forName("Shift-JIS"));
        convertBinary("仁に近し。", Charset.forName("Shift-JIS"));

        convertBinary("剛毅朴訥、", Charset.forName("UTF-8"));
        convertBinary("仁に近し。", Charset.forName("UTF-8"));

    }

    private static void convertBinary(String str, Charset c){
        System.out.println(str);
        System.out.println(c);
        for (String s:str.split("")) {
            if (s.getBytes(c).length == 2){
                System.out.print(String.format("%16s,", s));
            } else if (s.getBytes(c).length > 2){
                System.out.print(String.format("%25s,", s));
            } else {
                System.out.print(String.format("%8s,", s));
            }
        }
        System.out.println("");
        for (String s:str.split("")) {
            if (s.getBytes(c).length ==2){
                System.out.print(String.format("%17s,", DatatypeConverter.printHexBinary(s.getBytes(c))));
            } else if (s.getBytes(c).length > 2) {
                System.out.print(String.format("%26s,", DatatypeConverter.printHexBinary(s.getBytes(c))));
            } else {
                System.out.print(String.format("0x%8s,", DatatypeConverter.printHexBinary(s.getBytes(c))));
            }
        }
        System.out.println("");
        for (String s:str.split("")) {
            for (byte b:s.getBytes(c)){
                System.out.print(String.format("%8s,", Integer.toBinaryString(Byte.toUnsignedInt(b))).replace(' ', '0'));
            }
        }
        System.out.println("");
        for (String s:str.split("")) {
            for (byte b:s.getBytes(c)){
                System.out.print(String.format("%8s", Integer.toBinaryString(Byte.toUnsignedInt(b))).replace(' ', '0'));
            }
        }
        System.out.println("");
        for (String s:str.split("")) {
            if (s.getBytes(c).length ==2){
                System.out.print(String.format("%s", DatatypeConverter.printHexBinary(s.getBytes(c))));
            } else if (s.getBytes(c).length > 2) {
                System.out.print(String.format("%s", DatatypeConverter.printHexBinary(s.getBytes(c))));
            } else {
                System.out.print(String.format("%s", DatatypeConverter.printHexBinary(s.getBytes(c))));
            }
        }
        System.out.println("");
        for (String s:str.split("")) {
            if (s.getBytes(c).length ==2){
                System.out.print(String.format("%s,", DatatypeConverter.printHexBinary(s.getBytes(c))));
            } else if (s.getBytes(c).length > 2) {
                System.out.print(String.format("%s,", DatatypeConverter.printHexBinary(s.getBytes(c))));
            } else {
                System.out.print(String.format("%s,", DatatypeConverter.printHexBinary(s.getBytes(c))));
            }
        }
        System.out.println("");
    }
}
