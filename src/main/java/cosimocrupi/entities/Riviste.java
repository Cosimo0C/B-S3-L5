package cosimocrupi.entities;

import cosimocrupi.enums.Pereodicita;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table
public class Riviste extends Catalogo {
    protected Pereodicita pereodicita;
    public Riviste(String titolo, int annoProduzione, int numeroPagine, Pereodicita pereodicita) {
        super(titolo, annoProduzione, numeroPagine);
        this.titolo=titolo;
        this.annoProduzione=annoProduzione;
        this.numeroPagine=numeroPagine;
        this.pereodicita=pereodicita;
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
