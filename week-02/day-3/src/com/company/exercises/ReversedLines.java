package com.company.exercises;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class ReversedLines {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt

        Path path = Path.of("reversed-lines.txt");

        //creation of the encrypted file for the method to work properly
        try {
            Files.writeString(path, """                            
                    nohtyP fo neZ ehT
                    sreteP miT yb

                    .ylgu naht retteb si lufituaeB
                    .ticilpmi naht retteb si ticilpxE
                    .xelpmoc naht retteb si elpmiS
                    .detacilpmoc naht retteb si xelpmoC
                    .detsen naht retteb si talF
                    .esned naht retteb si esrapS
                    .stnuoc ytilibadaeR
                    .selur eht kaerb ot hguone laiceps t'nera sesac laicepS
                    .ytirup staeb ytilacitcarp hguohtlA
                    .yltnelis ssap reven dluohs srorrE
                    .decnelis ylticilpxe sselnU
                    .sseug ot noitatpmet eht esufer ,ytiugibma fo ecaf eht nI
                    .ti od ot yaw suoivbo-- eno ylno ylbareferp dna --eno eb dluohs erehT
                    .hctuD er'uoy sselnu tsrif ta suoivbo eb ton yam yaw taht hguohtlA
                    .reven naht retteb si woN
                    .won *thgir* naht retteb netfo si reven hguohtlA
                    .aedi dab a s'ti ,nialpxe ot drah si noitatnemelpmi eht fI
                    .aedi doog a eb yam ti ,nialpxe ot ysae si noitatnemelpmi eht fI
                    !esoht fo erom od s'tel -- aedi taerg gniknoh eno era secapsemaN""");
        } catch (IOException e) {
            e.printStackTrace();
        }

        reverseFileText(path);
    }

    private static void reverseFileText(Path path) {
        List<String> reveredList = new ArrayList<>();

        try {
            try  (BufferedReader textToReverse = new BufferedReader(new FileReader(path.toFile()))) {
                String line;
                while ((line = textToReverse.readLine()) != null) {
                    StringBuilder thisLine = new StringBuilder(line);
                    reveredList.add(thisLine.reverse().toString());
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