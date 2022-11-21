package formato.planilla.Controlador;

import formato.planilla.Modelo.Formato;
import formato.planilla.Repositorio.FormatoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/formato")
@CrossOrigin(origins = "http://localhost:4200")
public class FormatoControlador {
    @Autowired
    private FormatoRepositorio formatoRepositorio;

    @GetMapping
    public List<Formato> consultarFormato(){
        return formatoRepositorio.findAll();
    }


        @PostMapping
        public Formato guardarFormato(@RequestBody Formato formato ){
            return formatoRepositorio.save(formato);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id){
        formatoRepositorio.deleteById(id);
    }

    @PutMapping
    public Formato modificarFormato(@RequestBody Formato formato ){
        if(formatoRepositorio.existsById(formato.getId())){
            return formatoRepositorio.save(formato);
        }
        return null;
    }
    @GetMapping("/{id}")
    public Optional<Formato> consultarTipoDocumento(@PathVariable("id") int id){
        return formatoRepositorio.findById(id);
    }

}

