package fabiocarlino.u5l4.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "bevande")
public class Bevanda {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private int calorie;

    @Column(nullable = false)
    private double prezzo;
}
