package com.example.demo.wavedash;

import java.io.FileWriter;
import java.nio.charset.Charset;

import javax.xml.bind.DatatypeConverter;

public class Main2 {
    public static void main(String[] args) {
        // ◆ CP932
        System.out.println("CP932");

        // 1.全角チルダ
        String fullwidth_tilde_char = "～";
        String fullwidth_tilde_hex = "EFBD9E";
        printUTF8toHex(fullwidth_tilde_char);
        printHextoUtf8(fullwidth_tilde_hex);
        outFileUtf8(fullwidth_tilde_hex, "1. fullwidth_tilde");

        // 2.並行記号
        String parallel_to_char = "∥";
        String parallel_to_hex = "E288A5";
        printUTF8toHex(parallel_to_char);
        printHextoUtf8(parallel_to_hex);
        outFileUtf8(parallel_to_hex, "2. parallel_to");

        // 3.全角ハイフン — マイナス
        String fullwidth_hyphen_minus_char = "－";
        String fullwidth_hyphen_minus_hex = "EFBC8D";
        printUTF8toHex(fullwidth_hyphen_minus_char);
        printHextoUtf8(fullwidth_hyphen_minus_hex);
        outFileUtf8(fullwidth_hyphen_minus_hex, "3. fullwidth_hyphen_minus");

        // 4.全角セントサイン
        String fullwidth_cent_sign_char = "￠";
        String fullwidth_cent_sign_hex = "EFBFA0";
        printUTF8toHex(fullwidth_cent_sign_char);
        printHextoUtf8(fullwidth_cent_sign_hex);
        outFileUtf8(fullwidth_cent_sign_hex, "4. fullwidth_cent_sign");

        // 5.全角ポンド記号
        String fullwidth_pound_sign_char = "￡";
        String fullwidth_pound_sign_hex = "EFBFA1";
        printUTF8toHex(fullwidth_pound_sign_char);
        printHextoUtf8(fullwidth_pound_sign_hex);
        outFileUtf8(fullwidth_pound_sign_hex, "5. fullwidth_pound_sign");

        // 6.全角否定記号
        String fullwidth_not_sign_char = "￢";
        String fullwidth_not_sign_hex = "EFBFA2";
        printUTF8toHex(fullwidth_not_sign_char);
        printHextoUtf8(fullwidth_not_sign_hex);
        outFileUtf8(fullwidth_not_sign_hex, "6. fullwidth_not_sign");

        // 7.水平バー
        String horizontal_bar_char = "―";
        String horizontal_bar_hex = "E28095";
        printUTF8toHex(horizontal_bar_char);
        printHextoUtf8(horizontal_bar_hex);
        outFileUtf8(horizontal_bar_hex, "7. horizontal_bar");




        // ◆ SJIS
        System.out.println("\nSJIS");

        // 1.波ダッシュ
        String wave_dash_char = "〜";
        String wave_dash_hex = "E3809C";
        printUTF8toHex(wave_dash_char);
        printHextoUtf8(wave_dash_hex);
        outFileUtf8(wave_dash_hex, "1. wave_dash");

        // 2.双柱
        String double_vertical_line_char = "‖";
        String double_vertical_line_hex = "E28096";
        printUTF8toHex(double_vertical_line_char);
        printHextoUtf8(double_vertical_line_hex);
        outFileUtf8(double_vertical_line_hex, "2. double_vertical_line");

        // 3.マイナス記号
        String minus_sign_char = "−";
        String minus_sign_hex = "E28892";
        printUTF8toHex(minus_sign_char);
        printHextoUtf8(minus_sign_hex);
        outFileUtf8(minus_sign_hex, "3. minus_sign");

        // 4.セント記号
        String cent_sign_char = "￠";
        String cent_sign_hex = "C2A2";
        printUTF8toHex(cent_sign_char);
        printHextoUtf8(cent_sign_hex);
        outFileUtf8(cent_sign_hex, "4. cent_sign");

        // 5.ポンド記号
        String pound_sign_char = "￡";
        String pound_sign_hex = "C2A3";
        printUTF8toHex(pound_sign_char);
        printHextoUtf8(pound_sign_hex);
        outFileUtf8(pound_sign_hex, "5. pound_sign");

        // 6.否定記号
        String not_sign_char = "￢";
        String not_sign_hex = "C2AC";
        printUTF8toHex(not_sign_char);
        printHextoUtf8(not_sign_hex);
        outFileUtf8(not_sign_hex, "6. not_sign");

        // 7.全角ダッシュ
        String em_dash_char = "—";
        String em_dash_hex = "E28094";
        printUTF8toHex(em_dash_char);
        printHextoUtf8(em_dash_hex);
        outFileUtf8(em_dash_hex, "7. em_dash");
    }

    public static void printUTF8toHex(String str) {
        System.out.print(str + " → ");
        for (Byte b : str.getBytes(Charset.forName("UTF-8"))) {
            System.out.print(String.format("%02X", b));
        }
        System.out.println("");
    }

    public static void printHextoUtf8(String hex) {
        System.out.print(hex + " → ");
        System.out.println(new String(DatatypeConverter.parseHexBinary(hex), Charset.forName("UTF-8")));
    }

    public static void outFileUtf8(String hex, String name) {
        String str = new String(DatatypeConverter.parseHexBinary(hex), Charset.forName("UTF-8"));
        try (FileWriter writer = new FileWriter("utf8.txt", Charset.forName("UTF-8"), true)) {
            writer.write(str + " : " + name + "\n");
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
