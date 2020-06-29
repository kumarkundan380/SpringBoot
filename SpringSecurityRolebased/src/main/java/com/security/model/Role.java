package com.security.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "role")
public class Role {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "role_id")
    private long roleId;
    
	@Column(name = "role",nullable = false, unique = true)
    private String role;

    @ManyToMany(mappedBy = "roles")
    private List < User > users;

}
