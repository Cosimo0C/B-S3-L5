package cosimocrupi.entities;

import cosimocrupi.enums.Genere;
import cosimocrupi.enums.Pereodicita;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.util.UUID;

    @Entity
    @Table
    public class Riviste extends Catalogo {

    @Id
    UUID isbn;
    protected String autore;
    protected Genere genere;
    @OneToOne(mappedBy = "rivista")
    private Prestito prestito;

    protected Pereodicita pereodicita;
    public Riviste(String titolo, int annoProduzione, int numeroPagine, Pereodicita pereodicita) {
        super(titolo, annoProduzione, numeroPagine);
        this.titolo=titolo;
        this.annoProduzione=annoProduzione;
        this.numeroPagine=numeroPagine;
        this.pereodicita=pereodicita;
    }

    public Prestito getPrestito() {
        return prestito;
    }

    @Override
    public String toString() {
        return "Riviste{" +
                ", isbn='" + isbn + '\'' +
                ", titolo='" + titolo + '\'' +
                ", annoProduzione=" + annoProduzione +
                ", numeroPagine=" + numeroPagine +
                "pereodicita=" + pereodicita +
                '}';
    }

    public Pereodicita getPereodicita() {
        return pereodicita;
    }

    public void setPereodicita(Pereodicita pereodicita) {
        this.pereodicita = pereodicita;
    }
}
