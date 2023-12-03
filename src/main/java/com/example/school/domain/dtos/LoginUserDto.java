package com.example.school.domain.dtos;
import lombok.Data;

@Data
public class LoginUserDto {
    private Long IdUsuario;
    private String Nombres;
    private String TipoUsuario;
    private String Email;

    // Constructor
    public LoginUserDto(Long idUsuario, String nombres, String tipoUsuario, String email) {
        this.IdUsuario = idUsuario;
        this.Nombres = nombres;
        this.TipoUsuario = tipoUsuario;
        this.Email = email;
    }
}
