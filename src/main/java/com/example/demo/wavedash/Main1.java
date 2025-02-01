package com.example.demo.wavedash;

import java.io.FileWriter;
import java.nio.charset.Charset;

import javax.xml.bind.DatatypeConverter;

public class Main1 {
    public static void main(String[] args) {
        //全角チルダ
        String fullwidth_tilde_char = "～";
        String fullwidth_tilde_hex = "EFBD9E";
        printUTF8toHex(fullwidth_tilde_char);
        printHextoUtf8(fullwidth_tilde_hex);
        outFileUtf8(fullwidth_tilde_hex, "fullwidth_tilde");
        
        //波ダッシュ
        String wave_dash_char = "〜";
        String wave_dash_hex = "E3809C";
        printUTF8toHex(wave_dash_char);
        printHextoUtf8(wave_dash_hex);
        outFileUtf8(wave_dash_hex, "wave_dash");
    }

    public static void printUTF8toHex(String str) {
        System.out.print(str + " → ");
        for (Byte b : str.getBytes(Charset.forName("UTF-8"))) {
            System.out.print(String.format(" %02X", b));
        }
        System.out.println("");
    }

    public static void printHextoUtf8(String hex){
        System.out.print(hex + " → ");
        System.out.println(new String(DatatypeConverter.parseHexBinary(hex), Charset.forName("UTF-8")));
    }

    public static void outFileUtf8(String hex, String name) {
        String str = new String(DatatypeConverter.parseHexBinary(hex), Charset.forName("UTF-8"));
        try (FileWriter writer = new FileWriter("utf8.txt", Charset.forName("UTF-8"), true)) {
            writer.write(str + " : " +  name + "\n");
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
