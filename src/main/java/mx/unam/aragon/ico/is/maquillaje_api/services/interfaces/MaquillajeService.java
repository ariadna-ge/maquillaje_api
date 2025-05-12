package mx.unam.aragon.ico.is.maquillaje_api.services.interfaces;

import mx.unam.aragon.ico.is.maquillaje_api.entities.Maquillaje;

import java.util.Optional;

public interface MaquillajeService {
    public abstract Maquillaje crear(Maquillaje maquillaje);
    public abstract Iterable<Maquillaje> listarTodo();
    public abstract Optional<Maquillaje> buscarId(Long id);
    public abstract Maquillaje actualizar(Long id, Maquillaje maquillaje);
    public abstract Maquillaje eliminar(Long id);
}