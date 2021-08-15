package ar.com.ada.api.aladas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.aladas.entities.*;
import ar.com.ada.api.aladas.repos.*;

@Service
public class StaffService {

    @Autowired
    StaffRepository repo;

    public void crearStaff(Staff staff) {
        repo.save(staff);
    }
}
