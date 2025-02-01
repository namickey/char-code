package com.example.demo.rongo;
import javax.xml.bind.DatatypeConverter;
import java.nio.charset.Charset;

public class Decode {
    public static void main(String[] args) {
        String hexStr = "8D848B429670E6638141";
        System.out.println(new String(DatatypeConverter.parseHexBinary(hexStr), Charset.forName("Shift-JIS")));
    }
}
