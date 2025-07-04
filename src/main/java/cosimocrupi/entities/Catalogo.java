package cosimocrupi.entities;

import jakarta.persistence.Id;

import java.util.UUID;

public abstract class Catalogo{

     protected String titolo;
     protected int annoProduzione;
     protected int numeroPagine;
     @Id
    UUID isbn;
     public Catalogo(String titolo, int annoProduzione, int numeroPagine) {
         this.titolo=titolo;
         this.annoProduzione=annoProduzione;
         this.numeroPagine=numeroPagine;
     }

     public UUID getIsbn() {
         return isbn;
     }

     public String getTitolo() {
         return titolo;
     }

     public void setTitolo(String titolo) {
         this.titolo = titolo;
     }

     public int getAnnoProduzione() {
         return annoProduzione;
     }

     public void setAnnoProduzione(int annoProduzione) {
         this.annoProduzione = annoProduzione;
     }

     public int getNumeroPagine() {
         return numeroPagine;
     }

     public void setNumeroPagine(int numeroPagine) {
         this.numeroPagine = numeroPagine;
     }
 }
