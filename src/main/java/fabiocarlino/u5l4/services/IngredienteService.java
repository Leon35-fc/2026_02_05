package fabiocarlino.u5l4.services;

import fabiocarlino.u5l4.entities.Ingrediente;
import fabiocarlino.u5l4.repositories.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredienteService {

    private final IngredienteRepository ingredienteRepository;

    @Autowired
    public IngredienteService(IngredienteRepository ingredienteRepository) {
        this.ingredienteRepository = ingredienteRepository;
    }

    public void saveIngrediente(Ingrediente newIngrediente) {
    }
}
