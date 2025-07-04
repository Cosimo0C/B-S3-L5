package cosimocrupi.DAO;


import cosimocrupi.entities.Catalogo;
import cosimocrupi.entities.Utente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class UtenteDAO {
    private EntityManager em;

    public UtenteDAO(EntityManager em) {
        this.em = em;
    }


    public void save(Utente utente) {
        try {
            EntityTransaction t = em.getTransaction();
            t.begin();
            em.persist(utente);
            t.commit();
            System.out.println(utente.getNome() + "  " + utente.getCognome()+ " creato!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Utente findById(long tessera) {
        return em.find(Utente.class, tessera);
    }

    public void findByIdAndDelete(long tessera) {
        try {
            EntityTransaction t = em.getTransaction();
            t.begin();
            Utente found = em.find(Utente.class, tessera);
            if (found != null) {
                em.remove(found);
                t.commit();
                System.out.println("Elemento eliminata");
            } else System.out.println("Elemento non trovata");


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
