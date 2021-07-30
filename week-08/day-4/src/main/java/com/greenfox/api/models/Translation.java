package com.greenfox.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
@NoArgsConstructor
public class Translation {

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String text;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String language;

    private String translated;
    private String lang;


    // cant see anything wrong with this one
    boolean isVowel(char c) {
        return Arrays.asList('a', 'u', 'o', 'e', 'i', 'y', 'á', 'ý', 'í', 'é').contains(c);
    }

    // cant see anything wrong with this one
    public void translate() {
        this.translated = this.text;
        int length = translated.length();
        if (this.getLang().equals("hu")) {
            for (int i = 0; i < length; i++) {
                char c = translated.charAt(i);
                if (isVowel(String.valueOf(c).toLowerCase().charAt(0))) {
                    translated = String.join(c + "v" + String.valueOf(c).toLowerCase(), translated.substring(0, i), translated.substring(i + 1));
                    i += 2;
                    length += 2;
                }
            }
            this.lang = "teve";
        } else if (this.getLang().equals("english")) {
            for (int i = 0; i < length; i++) {
                char c = translated.charAt(i);
                if (isVowel(String.valueOf(c).toLowerCase().charAt(0))) {
                    translated = String.join(c + "blab", translated.substring(0, i), translated.substring(i + 1));
                    i += 4;
                    length += 4;
                }
            }
            this.lang = "gibberish";
        }
    }
}