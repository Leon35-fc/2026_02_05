package fabiocarlino.u5l4.runners;

import fabiocarlino.u5l4.entities.Bevanda;
import fabiocarlino.u5l4.entities.Ingrediente;
import fabiocarlino.u5l4.entities.Pizza;
import fabiocarlino.u5l4.repositories.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("application.properties")
public class MenuRunner implements CommandLineRunner {

    private final IngredienteRepository ingredienteRepository;
    @Value("${costo.coperto}")
    private double costoCoperto;
    @Autowired
    private Pizza margherita;
    @Autowired
    private Pizza hawaiana;
    @Autowired
    private Pizza salami;
    @Autowired
    private Bevanda limonata;

    @Autowired
    public MenuRunner(IngredienteRepository ingredienteRepository) {
        this.ingredienteRepository = ingredienteRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Ingrediente mozzarella = new Ingrediente("mozzarella", 92, 0.69);
        System.out.println("Pizza:\n" + margherita.getNome() + "\nCoperto:\n" + costoCoperto + "\nTotale:\n" + (costoCoperto + margherita.getPrezzo()));
        System.out.println("Ingrediente:\n" + mozzarella);
        ingredienteRepository.save(mozzarella);
    }
}
