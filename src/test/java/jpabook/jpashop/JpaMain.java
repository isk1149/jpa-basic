package jpabook.jpashop;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import jpabook.jpashop.domain.AccountVO;
import jpabook.jpashop.domain.UserVO;

public class JpaMain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		
		try {
			/*
			UserVO user = new UserVO();
			user.setUser_id("hong");
			user.setPwd("gildong");
			user.setUser_nm("홍길동");
			
			em.persist(user);
			
			AccountVO account = new AccountVO();
			account.setAccountNo("0000003402");
			account.setUser(user);
			account.setDeposit(200000000L);
			account.setRate(2.0);
			account.setRateLimitAmount(100000000L);
			account.setOverRate(0.1);
			
			em.persist(account);
			*/
			//List<AccountVO> list = em.createQuery("select a from AccountVO as a").getResultList();
			AccountVO account = em.find(AccountVO.class, "0000003402");
			//AccountVO account = list.get(0);
			System.out.println("===========================");
			System.out.println("account no : " + account.getRate());
			
			/*Member member = new Member("Jack", "New York", "A Street", "023719");
			em.persist(member);
			
			Order order = new Order();
			Item item = new Item("spoon", 1000, 10);
			OrderItem orderItem = new OrderItem();
			
			em.persist(item);
			
			order.setMember(member);
			order.addOrderItem(orderItem);
			order.setOrderDate(LocalDateTime.of(2022, 05, 13, 12, 32, 22));
			order.setStatus(OrderStatus.ORDER);
			
			em.persist(order);
			
			orderItem.setOrder(order);
			orderItem.setItem(item);
			
			em.persist(orderItem);
*/
			tx.commit();
			
		} catch (Exception e) {
			tx.rollback();
		} finally {
			em.close();
		}
		
		emf.close();
	}
}
