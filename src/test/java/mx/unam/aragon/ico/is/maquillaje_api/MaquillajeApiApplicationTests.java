package mx.unam.aragon.ico.is.maquillaje_api;

import mx.unam.aragon.ico.is.maquillaje_api.entities.Maquillaje;
import mx.unam.aragon.ico.is.maquillaje_api.repositories.MaquillajeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MaquillajeapiApplicationTests {
    @Autowired
    private MaquillajeRepository maquillajeRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void insertarMaquillaje() {
        Maquillaje maquillaje = new Maquillaje(0, "10 aceites naturales", "Yuya", "Máscara de pestañas", null, 199);
        maquillajeRepository.save(maquillaje);
    }

    @Test
    void leerMaquillajePorId(){
        Long idTmp = 2l;
        Maquillaje tmp= maquillajeRepository.findMaquillajeById(idTmp);
        System.out.println(tmp);
    }

    @Test
    public void eliminarMaquillaje(){
        Long idTmp = 2l;
        maquillajeRepository.deleteById(idTmp);
    }

    @Test
    public void actualizarMaquillaje(){
        Long idTmp = 1l;
        Maquillaje tmp = maquillajeRepository.findMaquillajeById(idTmp);
        tmp.setFoto("https://m.media-amazon.com/images/I/713yFzAGBOL.jpg");
        maquillajeRepository.save(tmp);
    }

}