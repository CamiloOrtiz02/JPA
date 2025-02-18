package egg.Persistence;

import egg.Entity.Oficina;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class OficinaDAO {
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("LOCAL_VIVERO");
    private final EntityManager em = emf.createEntityManager();

    public void agregarOficina(Oficina oficina) throws Exception{
        em.getTransaction().begin();
        em.persist(oficina);
        em.getTransaction().commit();
    }

    public void eliminarOficina(int id) throws Exception{
        Oficina oficina = em.find(Oficina.class, id);
        em.getTransaction().begin();
        em.remove(em.merge(oficina));
        em.getTransaction().commit();
    }

    public void actualizarOficina (Oficina oficina){
        em.getTransaction().begin();
        em.merge(oficina);
        em.getTransaction().commit();
    }

    public Oficina buscarOficina(Long id) throws Exception{
        return em.find(Oficina.class, id);
    }
}
