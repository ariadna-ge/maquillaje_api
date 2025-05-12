package mx.unam.aragon.ico.is.maquillaje_api.services;

import mx.unam.aragon.ico.is.maquillaje_api.entities.Maquillaje;
import mx.unam.aragon.ico.is.maquillaje_api.repositories.MaquillajeRepository;
import mx.unam.aragon.ico.is.maquillaje_api.services.interfaces.MaquillajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MaquillajeServiceImpl implements MaquillajeService {
    @Autowired
    private MaquillajeRepository maquillajeRepository;


    @Override
    public Maquillaje crear(Maquillaje maquillaje) {
        return maquillajeRepository.save(maquillaje);
    }

    @Override
    public Iterable<Maquillaje> listarTodo() {
        return maquillajeRepository.findAll();
    }

    @Override
    public Optional<Maquillaje> buscarId(Long id) {
        return maquillajeRepository.findById(id);
    }

    @Override
    public Maquillaje actualizar(Long id, Maquillaje maquillaje) {
        Optional<Maquillaje> maquillajeActualizada = maquillajeRepository.findById(id);
        if (maquillajeActualizada.isPresent()) {
            Maquillaje tmp = maquillajeActualizada.get();
            tmp.setId(maquillaje.getId());
            tmp.setNombre(maquillaje.getNombre());
            tmp.setMarca(maquillaje.getMarca());
            tmp.setTipo(maquillaje.getTipo());
            tmp.setFoto(maquillaje.getFoto());
            tmp.setPrecio(maquillaje.getPrecio());
            return maquillajeRepository.save(tmp);
        }else{
            return null;
        }
    }

    @Override
    public Maquillaje eliminar(Long id) {
        return maquillajeRepository.deleteMaquillajeById(id);
    }
}
