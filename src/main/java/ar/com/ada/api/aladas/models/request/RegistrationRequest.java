package ar.com.ada.api.aladas.models.request;

import java.util.Date;

import ar.com.ada.api.aladas.entities.Pais.TipoDocuEnum;
import ar.com.ada.api.aladas.entities.Usuario.TipoUsuarioEnum;


public class RegistrationRequest {

    public String fullName; 
    public int country;
    public TipoDocuEnum identificationType; 
    public String identification;
    public Date birthDate; 
    public String email; 
    public TipoUsuarioEnum userType;
    public String password; 
}