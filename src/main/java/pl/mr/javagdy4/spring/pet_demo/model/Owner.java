package pl.mr.javagdy4.spring.pet_demo.model;

import lombok.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.Set;

@Entity()
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Owner {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String firstName;
private String lastName;

@OneToMany(mappedBy = "owner", fetch = FetchType.EAGER,cascade = CascadeType.REMOVE)
@EqualsAndHashCode.Exclude
@ToString.Exclude
@Cascade(org.hibernate.annotations.CascadeType.REMOVE)
private Set<Pet> pets;
@Formula("(SELECT AVG(p.age) FROM pet p WHERE p.owner_id=id)")
private Long avgPetsAge;
@Formula("(SELECT COUNT(id) FROM pet WHERE p.owner_id=id)")
private Integer numberOfPets;
private Long age;

}
