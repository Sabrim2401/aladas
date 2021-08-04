package ar.com.ada.api.aladas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.aladas.entities.Aeropuerto;
import ar.com.ada.api.aladas.repos.AeropuertoRepository;

@Service
public class AeropuertoService {

    @Autowired
    private AeropuertoRepository repo;

    // El crear este tiene que pasarle como parametro el aeropuertoId porque
    // en ESTE caso no es autoincremental.
    public void crear(Integer aeropuertoId, String nombre, String codigoIATA) {

        Aeropuerto aeropuerto = new Aeropuerto(); // declaran e instancian
        aeropuerto.setAeropuertoId(aeropuertoId);
        aeropuerto.setNombre(nombre);
        aeropuerto.setCodigoIATA(codigoIATA);

        repo.save(aeropuerto);
    }

    public List<Aeropuerto> obtenerTodos() {

        return repo.findAll();

    }

    public Aeropuerto buscarPorCodigoIATA(String codigoIATA) {
        return repo.findByCodigoIATA(codigoIATA);
    }

    public boolean validarCodigoIATA(Aeropuerto aeropuerto) {

        // SI viene algo diferente de 3, que salga.
        if (aeropuerto.getCodigoIATA().length() != 3)
            return false;

        String codigoIATA = aeropuerto.getCodigoIATA();

        // " AP"
        for (int i = 0; i < codigoIATA.length(); i++) {
            char c = codigoIATA.charAt(i);

            if (!(c >= 'A' && c <= 'Z'))
                return false;

        }

        return true;

    }
}