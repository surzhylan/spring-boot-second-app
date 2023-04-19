package kz.bitlab.spring.bootfirstapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Students {
    private Long id;
    private String name;
    private String surname;
    private int exam;
    private String mark;
}
