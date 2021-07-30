package com.greenfox.api.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;
import java.util.Arrays;

@Getter
@Setter
@NoArgsConstructor
public class Sith {

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String text;

    private String sith_text;


    public void setSithTextbla() {
        text = text.toLowerCase();
        StringBuilder builder = new StringBuilder();
        String[] randomTexts = {"Uhm", "Arrgh", "Err..err.err"};
        String[] sentences = text.split("\\.");

        for (int i = 0; i < sentences.length; i++) {
            List<String> words = new ArrayList<>(Arrays.stream(sentences[i].trim().split(" ")).toList());
            for (int j = 1; j < words.size(); j += 2) {
                String temp = words.get(j);
                words.remove(j);
                words.add(j - 1, temp);
            }
            for (int j = 0; j < words.size(); j++) {
                if (j == 0) {
                    builder.append(words.get(j).substring(0, 1).toUpperCase()).append(words.get(j).substring(1)).append(" ");
                } else if (j != words.size() - 1){
                    builder.append(words.get(j)).append(" ");
                }
                else {
                    builder.append(words.get(j)).append(". ");
                    for (int k = 0; k < new Random().nextInt(randomTexts.length - 1)+1; k++) {
                        builder.append(randomTexts[new Random().nextInt(randomTexts.length - 1)]).append(". ");
                    }
                }
            }
        }
        sith_text = builder.toString();
    }
}
