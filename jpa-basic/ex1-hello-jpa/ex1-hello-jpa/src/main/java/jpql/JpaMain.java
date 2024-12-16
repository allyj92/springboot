package jpql;

import hellojpa.Member;
import hellojpa.Team;

import javax.persistence.*;
import java.util.*;


public class JpaMain {
    public static <List> void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {



            jpql.Team team = new jpql.Team();
            team.setName("teamA");
            em.persist(team);

            Member1 member = new Member1();
            member.setUsername("member");
            member.setAge(10);

            member.setTeam(team);

            em.persist(member);


            em.flush();
            em.clear();

            String query = "select m from Member1 m left join m.team t on t.name = 'teamA'";
            java.util.List<Member1> result = em.createQuery(query, Member1.class)
                    .setFirstResult(1)
                    .setMaxResults(10)
                    .getResultList();



            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}

