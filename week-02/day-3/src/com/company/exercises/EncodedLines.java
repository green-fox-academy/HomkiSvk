package com.company.exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {
    public static void main(String[] args) {
        // Create a method that decrypts encoded-lines.txt

        Path path = Path.of("encoded-lines.txt");

        //creation of the encrypted file for the method to work properly
        try {
            Files.writeString(path, """                            
                    Uif [fo pg Qzuipo
                    cz Ujn Qfufst
                                        
                    Cfbvujgvm jt cfuufs uibo vhmz/
                    Fyqmjdju jt cfuufs uibo jnqmjdju/
                    Tjnqmf jt cfuufs uibo dpnqmfy/
                    Dpnqmfy jt cfuufs uibo dpnqmjdbufe/
                    Gmbu jt cfuufs uibo oftufe/
                    Tqbstf jt cfuufs uibo efotf/
                    Sfbebcjmjuz dpvout/
                    Tqfdjbm dbtft bsfo(u tqfdjbm fopvhi up csfbl uif svmft/
                    Bmuipvhi qsbdujdbmjuz cfbut qvsjuz/
                    Fsspst tipvme ofwfs qbtt tjmfoumz/
                    Vomftt fyqmjdjumz tjmfodfe/
                    Jo uif gbdf pg bncjhvjuz- sfgvtf uif ufnqubujpo up hvftt/
                    Uifsf tipvme cf pof.. boe qsfgfsbcmz pomz pof ..pcwjpvt xbz up ep ju/
                    Bmuipvhi uibu xbz nbz opu cf pcwjpvt bu gjstu vomftt zpv(sf Evudi/
                    Opx jt cfuufs uibo ofwfs/
                    Bmuipvhi ofwfs jt pgufo cfuufs uibo +sjhiu+ opx/
                    Jg uif jnqmfnfoubujpo jt ibse up fyqmbjo- ju(t b cbe jefb/
                    Jg uif jnqmfnfoubujpo jt fbtz up fyqmbjo- ju nbz cf b hppe jefb/
                    Obnftqbdft bsf pof ipoljoh hsfbu jefb .. mfu(t ep npsf pg uiptf\"""");
        } catch (IOException e) {
            e.printStackTrace();
        }

        decodeText(path);
    }

    private static void decodeText (Path path) {
        List<String> reveredList = new ArrayList<>();

        try {
            try  (BufferedReader textToReverse = new BufferedReader(new FileReader(path.toFile()))) {
                String line;
                while ((line = textToReverse.readLine()) != null) {
                    StringBuilder decryptedWord = new StringBuilder();
                    for (int i = 0; i < line.length(); i++) {
                        if (line.charAt(i) != ' ') {
                            decryptedWord.append((char) (line.charAt(i) - 1));
                        } else {
                            decryptedWord.append(' ');
                        }
                    }
                    reveredList.add(decryptedWord.toString());
                }
            }
            System.out.println("Content of the file is decrypted.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Files.write(path, reveredList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
