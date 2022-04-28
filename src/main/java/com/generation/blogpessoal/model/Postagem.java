package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity // create table
@Table(name = "tb_postagens") // tb_postagens
public class Postagem {
	@Id // primary key (id)
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
	private Long id;
	
	@NotBlank(message = "O atributo Título é obrigatório")
	@Size(min = 5, max = 100, message = "O atributo título deve conter no minimo 5 e no máximo 100 caracteres")
	private String título;
	
	@NotNull(message = "O atributo texto é obrigatório")
	@Size(min = 10, max = 1000, message = "O atributo texto deve conter no minimo 5 e no máximo 100 caracteres")
	private String texto;
	
	@UpdateTimestamp
	private LocalDateTime data ;

	// Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTítulo() {
		return título;
	}

	public void setTítulo(String título) {
		this.título = título;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	
}
