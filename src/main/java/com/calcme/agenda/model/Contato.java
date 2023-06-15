package com.calcme.agenda.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NonNull;

@Document(collection = "contatos")
@Data
public class Contato {
    @Id
    private String id;

    @NonNull
    private String name;
    @NonNull
    @Email(message = "O campo email deve ser um email válido")
    private String email;
    @NonNull
    @Size(min = 11, max = 11)
    private String phone;
}
