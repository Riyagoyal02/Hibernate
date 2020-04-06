package tablePerClass;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Demo {

    public static void main(String args[]){

        A a = new A();
        a.setId(105);
        a.setName("a");

        B b = new B();
        b.setId(106);
        b.setName("d");
        b.setValueOne("b1");

        C c = new C();
        c.setId(107);
        c.setName("x");
        c.setValueTwo("c1");


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sampleapp");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        em.persist(a);
        em.persist(b);
        em.persist(c);

        tx.commit();
        em.close();
        emf.close();


    }
}
