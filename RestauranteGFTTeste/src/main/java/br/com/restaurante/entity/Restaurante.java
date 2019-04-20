package br.com.restaurante.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author leandro
 *
 */

@Entity
@Table(name ="Restaurante_TB")
public class Restaurante {
	/**
	 * 
	 */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="COD_RESTAURANTE")
    private int id;
    @Column(name="NOME_RESTAURANTE")
    private String nome;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
        
}
