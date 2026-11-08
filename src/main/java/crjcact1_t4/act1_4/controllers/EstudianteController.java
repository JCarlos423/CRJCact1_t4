package crjcact1_t4.act1_4.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {

    // Endpoint B: Regresa información de un objeto o lista simulada
    @GetMapping("/materias")
    public Map<String, Object> obtenerPerfil() {
        Map<String, Object> perfil = new HashMap<>();
        perfil.put("nombre", "Canseco Reyes Juan Carlos");
        perfil.put("matricula", "23160859");
        
        List<String> materias = Arrays.asList("Programacion Web", "Software para Toma de Decisiones", "Conmuntacion y Enrutamiento de Redes de Computadoras", "Taller de Investigacion I", "Sistemas Programables", "Lenguajes y Automatas II");
        perfil.put("materiasEnCurso", materias);
        
        return perfil;
    }
}