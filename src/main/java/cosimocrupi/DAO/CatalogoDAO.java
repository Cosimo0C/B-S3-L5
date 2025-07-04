package cosimocrupi.DAO;


import cosimocrupi.entities.Catalogo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class CatalogoDAO {
    private EntityManager em;

    public CatalogoDAO(EntityManager em) {
        this.em = em;
    }


    public void save(Catalogo ele) {
        try {
            EntityTransaction t = em.getTransaction();
            t.begin();
            em.persist(ele);
            t.commit();
            System.out.println(ele.getTitolo() + "  " + ele.getIsbn()+ " creato!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Catalogo findById(long id) {
        return em.find(Catalogo.class, id);
    }

    public void findByIdAndDelete(long id) {
        try {
            EntityTransaction t = em.getTransaction();
            t.begin();
            Catalogo found = em.find(Catalogo.class, id);
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
