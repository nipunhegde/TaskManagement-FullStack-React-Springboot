package com.FSprojects.Task.User.Service.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fullName;
    private String email;
    private String password;
    private String role;



    // private String mobile;

//    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//    private String password;
//
//    private String role="ROLE_CUSTOMER";
//
//    private List<Long> completedTasks;

}
