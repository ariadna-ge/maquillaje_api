package mx.unam.aragon.ico.is.maquillaje_api.controllers;

import mx.unam.aragon.ico.is.maquillaje_api.entities.Maquillaje;
import mx.unam.aragon.ico.is.maquillaje_api.services.interfaces.MaquillajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/api/v2/maquillaje")
public class MaquillajeController {

    @Autowired
    private MaquillajeService maquillajeService;

    @GetMapping("/")
    public ResponseEntity<Iterable<Maquillaje>> getMaquillaje(){
        //return maquillajeService.listarTodo();
        //return new ResponseEntity<>(maquillajeService.listarTodo(),HttpStatus.CREATED);
        return ResponseEntity.ok().body(maquillajeService.listarTodo());
    }

    @PostMapping("/")
    public ResponseEntity<Maquillaje> createMaquillaje(@RequestBody Maquillaje maquillaje) throws URISyntaxException{
        //return maquillajeService.crear(maquillaje);
        return ResponseEntity.created(new URI("http://localhost:8080")).body(maquillajeService.crear(maquillaje));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Maquillaje> getMaquillaje(@PathVariable Long id){
        //return maquillajeService.buscarId(id).orElse(null);
        return ResponseEntity.ok(maquillajeService.buscarId(id).orElse(null));
    }
}