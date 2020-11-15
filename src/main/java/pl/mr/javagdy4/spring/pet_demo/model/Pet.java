package pl.mr.javagdy4.spring.pet_demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String name;
    private String age;
    private String ownerName;
    private Double weight;
    private boolean pureRace;
    @Enumerated(EnumType.STRING)
    private Race race;
    @ManyToOne
    @EqualsAndHashCode.Exclude
    private Owner owner;

}
