package com.zourceview.soas.jpa;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "soas_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(max = 64)
    @Column(name = "fname", length = 64, nullable = false)
    private String fname;

    @NotNull
    @Size(max = 64)
    @Column(name = "lname", length = 64, nullable = false)
    private String lname;

    @Column(name = "created")
    private Long created;

    @OneToMany(mappedBy = "role")
    private Set<Role> roles = new HashSet<Role>();

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getFname() {
	return fname;
    }

    public void setFname(String fname) {
	this.fname = fname;
    }

    public String getLname() {
	return lname;
    }

    public void setLname(String lname) {
	this.lname = lname;
    }

    public Long getCreated() {
	return created;
    }

    public void setCreated(Long created) {
	this.created = created;
    }

    public Set<Role> getRoles() {
	return roles;
    }

    public void setRoles(Set<Role> roles) {
	this.roles = roles;
    }

}
