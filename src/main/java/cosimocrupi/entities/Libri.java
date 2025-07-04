package cosimocrupi.entities;

import cosimocrupi.enums.Genere;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table
public class Libri extends Catalogo{
    @Id
    UUID isbn;
    protected String autore;
    protected Genere genere;
    @OneToOne(mappedBy = "libro")
    private Prestito prestito;

    public Libri(String titolo, int annoProduzione, int numeroPagine, String autore, Genere genere) {
        super(titolo, annoProduzione, numeroPagine);
        this.titolo=titolo;
        this.annoProduzione=annoProduzione;
        this.numeroPagine=numeroPagine;
        this.autore=autore;
        this.genere=genere;
    }

    public Prestito getPrestito() {
        return prestito;
    }

    @Override
    public String toString() {
        return "Libri{" +
                "isbn=" + isbn +
                ", autore='" + autore + '\'' +
                ", genere=" + genere +
                ", prestito=" + prestito +
                ", isbn='" + isbn + '\'' +
                ", titolo='" + titolo + '\'' +
                ", annoProduzione=" + annoProduzione +
                ", numeroPagine=" + numeroPagine +
                '}';
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }
}
