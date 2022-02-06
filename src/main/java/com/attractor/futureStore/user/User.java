package com.attractor.futureStore.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singular;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Entity
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 50)
    @Size(min = 2, max = 30, message = "enter appropriate amount of letters, min 2")
    private String username;
    @Column(length = 100)
    @Email(message = "Enter a valid email")
    @NotBlank(message = "email should have a value")
    private String email;
    @Column(length = 50)
    @NotBlank(message = "password should have a value")
    @Size(min = 6, message = "password should at least consist of 6 characters")
    private String password;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
}
