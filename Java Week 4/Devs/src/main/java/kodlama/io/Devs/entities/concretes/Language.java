package kodlama.io.Devs.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name = "languages")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // veritabanında int id tanımlamasının primary key olduğunu belirttik
    @Column(name="id")
    private int id;

    @Column(name="language_name")
    private String name;

    @OneToMany(mappedBy = "language")
    private List<LanguageTechnology> technologies;




}
