package fabiocarlino.u5l4.runners;

import fabiocarlino.u5l4.entities.Ingrediente;
import fabiocarlino.u5l4.services.IngredienteService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("application.properties")
public class MenuRunner implements CommandLineRunner {

    private final IngredienteService ingredienteService;


    @Override
    public void run(String... args) throws Exception {

        Ingrediente mozzarella = new Ingrediente("mozzarella", 92, 0.69);
        System.out.println("Pizza:\n" + margherita.getNome() + "\nCoperto:\n" + costoCoperto + "\nTotale:\n" + (costoCoperto + margherita.getPrezzo()));
        System.out.println("Ingrediente:\n" + mozzarella);
//        ingredienteRepository.save(mozzarella);
//        System.out.println()
    }
}
