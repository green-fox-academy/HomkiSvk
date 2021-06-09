package com.company.exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt.
        // Decryption is the process reversing an encryption, i.e. the process
        // which converts encrypted data into its original form.

        Path path = Path.of("duplicated-chars.txt");

        //creation of the encrypted file for the method to work properly
        try {
            Files.writeString(path, """
                    TThhee  ZZeenn  ooff  PPyytthhoonn
                    bbyy  TTiimm  PPeetteerrss

                    BBeeaauuttiiffuull  iiss  bbeetttteerr  tthhaann  uuggllyy..
                    EExxpplliicciitt  iiss  bbeetttteerr  tthhaann  iimmpplliicciitt..
                    SSiimmppllee  iiss  bbeetttteerr  tthhaann  ccoommpplleexx..
                    CCoommpplleexx  iiss  bbeetttteerr  tthhaann  ccoommpplliiccaatteedd..
                    FFllaatt  iiss  bbeetttteerr  tthhaann  nneesstteedd..
                    SSppaarrssee  iiss  bbeetttteerr  tthhaann  ddeennssee..
                    RReeaaddaabbiilliittyy  ccoouunnttss..
                    SSppeecciiaall  ccaasseess  aarreenn''tt  ssppeecciiaall  eennoouugghh  ttoo  bbrreeaakk  tthhee  rruulleess..
                    AAlltthhoouugghh  pprraaccttiiccaalliittyy  bbeeaattss  ppuurriittyy..
                    EErrrroorrss  sshhoouulldd  nneevveerr  ppaassss  ssiilleennttllyy..
                    UUnnlleessss  eexxpplliicciittllyy  ssiilleenncceedd..
                    IInn  tthhee  ffaaccee  ooff  aammbbiigguuiittyy,,  rreeffuussee  tthhee  tteemmppttaattiioonn  ttoo  gguueessss..
                    TThheerree  sshhoouulldd  bbee  oonnee----  aanndd  pprreeffeerraabbllyy  oonnllyy  oonnee  ----oobbvviioouuss  wwaayy  ttoo  ddoo  iitt..
                    AAlltthhoouugghh  tthhaatt  wwaayy  mmaayy  nnoott  bbee  oobbvviioouuss  aatt  ffiirrsstt  uunnlleessss  yyoouu''rree  DDuuttcchh..
                    NNooww  iiss  bbeetttteerr  tthhaann  nneevveerr..
                    AAlltthhoouugghh  nneevveerr  iiss  oofftteenn  bbeetttteerr  tthhaann  **rriigghhtt**  nnooww..
                    IIff  tthhee  iimmpplleemmeennttaattiioonn  iiss  hhaarrdd  ttoo  eexxppllaaiinn,,  iitt''ss  aa  bbaadd  iiddeeaa..
                    IIff  tthhee  iimmpplleemmeennttaattiioonn  iiss  eeaassyy  ttoo  eexxppllaaiinn,,  iitt  mmaayy  bbee  aa  ggoooodd  iiddeeaa..
                    NNaammeessppaacceess  aarree  oonnee  hhoonnkkiinngg  ggrreeaatt  iiddeeaa  ----  lleett''ss  ddoo  mmoorree  ooff  tthhoossee!!""");
        } catch (IOException e) {
            e.printStackTrace();
        }

        decrypt(path);
    }

    private static void decrypt(Path path) {
        List<String> decryptedText = new ArrayList<>();
        try {
            List<String> text = Files.readAllLines(path);                       //load all lines
            Files.write(path, decryptedText);
            for (String sentence: text ) {
                String[] words = sentence.split("  ");                    // split into words
                for (String word : words) {
                    StringBuilder decryptedLine = new StringBuilder();
                    char[] beforeDecryption = word.toCharArray();               // split into characters
                    for (int i = 0; i < beforeDecryption.length; i += 2) {      // decrypt by removing every odd char
                        decryptedLine.append(beforeDecryption[i]);
                    }
                    Files.writeString(path, decryptedLine + " ", StandardOpenOption.APPEND);
                }
                Files.writeString(path, "\n", StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(decryptedText);
    }
}