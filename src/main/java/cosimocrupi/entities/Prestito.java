package cosimocrupi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table
public class Prestito {
    @Id
    @GeneratedValue
    private long id;
    protected Catalogo elementoPrestato;
    protected LocalDate dataInizio;
    protected LocalDate dataRestPrev;
    protected LocalDate dataRest;

    public Prestito(Catalogo elementoPrestato, LocalDate dataInizio, LocalDate dataRestPrev, LocalDate dataRest) {
        this.elementoPrestato = elementoPrestato;
        this.dataInizio = dataInizio;
        this.dataRestPrev = dataRestPrev;
        this.dataRest = dataRest;
    }

    @Override
    public String toString() {
        return "Prestito{" +
                "id=" + id +
                ", elementoPrestato=" + elementoPrestato +
                ", dataInizio=" + dataInizio +
                ", dataRestPrev=" + dataRestPrev +
                ", dataRest=" + dataRest +
                '}';
    }

    public long getId() {
        return id;
    }

    public Catalogo getElementoPrestato() {
        return elementoPrestato;
    }

    public void setElementoPrestato(Catalogo elementoPrestato) {
        this.elementoPrestato = elementoPrestato;
    }

    public LocalDate getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(LocalDate dataInizio) {
        this.dataInizio = dataInizio;
    }

    public LocalDate getDataRestPrev() {
        return dataRestPrev;
    }

    public void setDataRestPrev(LocalDate dataRestPrev) {
        this.dataRestPrev = dataRestPrev;
    }

    public LocalDate getDataRest() {
        return dataRest;
    }

    public void setDataRest(LocalDate dataRest) {
        this.dataRest = dataRest;
    }
}
