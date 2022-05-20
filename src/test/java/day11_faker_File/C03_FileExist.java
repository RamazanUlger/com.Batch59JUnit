package day11_faker_File;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C03_FileExist {

    @Test
    public void test01() {
        System.out.println(System.getProperty("user.dir"));
        //Bana icinde oldugum projenin dosaya yolunu(path)verir
        System.out.println(System.getProperty("user.home"));
        //benim bilgisayarimin bana ozel kismini verir : C:\Users\ramaz

        //C:\Users\ramaz\Downloads //Download icin
        //  C:\Users\ramaz\OneDrive\Masaüstü  //Masaustu icin
        //
        String dosyaYolu=System.getProperty("user.home")+"\\Desktop\\text.txt";
        System.out.println(dosyaYolu);
        String farkliKisim=System.getProperty("user.home");
        String ortakKisim="\\Desktop\\text.txt";
        String dosyaYolu01=farkliKisim+ortakKisim;
        System.out.println(Files.exists(Paths.get(dosyaYolu)));
       // Assert.assertTrue(Files.exists(Paths.get(dosyaYolu01)));

    }
}
