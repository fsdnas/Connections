package com.user.model;

import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@Entity
@NoArgsConstructor
@ToString
@Table
public class User {
    @Id
    @GeneratedValue(generator = "user_seq", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "user_seq", sequenceName = "user_sequence", initialValue = 901, allocationSize = 1)
    @Column(name = "userid")
    private int userId;
    @Column(name = "username")
    private String userName;
    private String password;
    private int active;
    private String roles;

    public User(String userName, String password, int active, String roles) {
        this.userName = userName;
        this.password = password;
        this.active = active;
        this.roles = roles;
    }
}
