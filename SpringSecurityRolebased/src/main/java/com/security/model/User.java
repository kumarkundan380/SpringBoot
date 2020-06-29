package com.security.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {

	 @Id 
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name = "user_id")
	 private long userId;
	 
	 @Column(nullable=false)
	 private String name;
	    
	 @Column(nullable=false)
	 private String email;
	    
	 @Column(nullable=false)
	 private String password;
	 
	 @ManyToMany(cascade=CascadeType.MERGE)
	 @JoinTable(name="user_role",
	      joinColumns={@JoinColumn(name="user_id", referencedColumnName="user_id")},
	      inverseJoinColumns={@JoinColumn(name="role_id", referencedColumnName="role_id")})
	 private List<Role> roles;
	 
}
