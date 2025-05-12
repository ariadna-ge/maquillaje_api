package mx.unam.aragon.ico.is.maquillaje_api.repositories;

import mx.unam.aragon.ico.is.maquillaje_api.entities.Maquillaje;
import org.springframework.data.repository.CrudRepository;

public interface MaquillajeRepository extends CrudRepository<Maquillaje, Long> {
    public Maquillaje findMaquillajeById(Long id);
    public Maquillaje deleteMaquillajeById(Long id);
}

