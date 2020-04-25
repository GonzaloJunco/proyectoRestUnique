package com.rest.restEricka.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Table(name = "tbl_producto")
@Data
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProducto;
	
	private String nombre;
	private String descripcion;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaVencimiento;
	
	private Integer stock;
	private Double precio;
	private String estatus;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name= "category_id")
	@JsonIgnoreProperties
	private Categoria categoria;
	

}
