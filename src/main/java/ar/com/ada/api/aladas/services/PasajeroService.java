package ar.com.ada.api.aladas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.aladas.repos.PasajeroRepository;
import ar.com.ada.api.aladas.entities.*;

@Service
public class PasajeroService {
    @Autowired
    PasajeroRepository repo;

    public void crearPasajero(Pasajero pasajero) {
        repo.save(pasajero);

    }

    public Pasajero buscarPorId(Integer id) {
        return repo.findByPasajeroId(id);
    }

}
