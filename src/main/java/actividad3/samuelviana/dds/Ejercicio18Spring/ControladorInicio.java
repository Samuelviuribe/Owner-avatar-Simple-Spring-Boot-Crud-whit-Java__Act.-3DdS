package actividad3.samuelviana.dds.Ejercicio18Spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author HP
 */
@RestController
@Slf4j
public class ControladorInicio {
    @GetMapping("/")
    
    public String inicio(){
        log.info("Ejecutando el controlador");
        return "Este es el inicio";
    }
}
