package crjcact1_t4.act1_4.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/general")
public class GeneralController {

    @GetMapping("/identificacion")
    public Map<String, Object> obtenerIdentificacion() {
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("id", "Instancia perteciente a Canseco Reyes Juan Carlos");
        respuesta.put("endpoint1", "/general/identificacion");
        respuesta.put("endpoint2", "/general/status");
        respuesta.put("endpoint3", "/estudiante/materias");
        return respuesta;
    }

    @GetMapping("/status")
    public Map<String, Object> obtenerEstatus() {
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("estado", "Servicio activo");
        respuesta.put("codigo", 200);
        
        // Formatear la fecha y hora actual (ejemplo: "17:25:00 - 07/11/2026")
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss - dd/MM/yyyy");
        String horaFormateada = LocalDateTime.now().format(formato);
        
        respuesta.put("horaActual", horaFormateada);
        return respuesta;
    }

}