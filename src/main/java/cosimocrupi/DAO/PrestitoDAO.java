package cosimocrupi.DAO;

import cosimocrupi.entities.Prestito;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class PrestitoDAO {
    private EntityManager em;

    public PrestitoDAO(EntityManager em) {
        this.em = em;
    }


    public void save(Prestito prestito) {
        try {
            EntityTransaction t = em.getTransaction();
            t.begin();
            em.persist(prestito);
            t.commit();
            System.out.println(prestito.toString() + " creato!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Prestito findById(long id) {
        return em.find(Prestito.class, id);
    }

    public void findByIdAndDelete(long id) {
        try {
            EntityTransaction t = em.getTransaction();
            t.begin();
            Prestito found = em.find(Prestito.class, id);
            if (found != null) {
                em.remove(found);
                t.commit();
                System.out.println("Prestito eliminata");
            } else System.out.println("Pestito non trovata");


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
