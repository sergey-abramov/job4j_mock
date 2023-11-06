package ru.job4j.site.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SubmitterDTO {

    private int id;

    private String fullName;

    public SubmitterDTO(String fullName) {
        this.fullName = fullName;
    }
}
