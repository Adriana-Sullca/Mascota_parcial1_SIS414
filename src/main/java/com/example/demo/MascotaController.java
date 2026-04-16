package com.example.demo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/mascotas")
@Tag(name = "CRUD MASCOTAS", description = "Gestión de mascotas para el examen")
public class MascotaController {

    private List<Mascota> listaMascotas = new ArrayList<>();

    @GetMapping
    @Operation(summary = "Listar todas las mascotas")
    public List<Mascota> listar() {
        return listaMascotas;
    }

    @PostMapping
    @Operation(summary = "Agregar una nueva mascota")
    public Mascota guardar(@RequestBody Mascota mascota) {
        listaMascotas.add(mascota);
        return mascota;
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar mascota por ID")
    public String eliminar(@PathVariable Long id) {
        listaMascotas.removeIf(m -> m.getId().equals(id));
        return "Mascota eliminada correctamente";
    }
}
