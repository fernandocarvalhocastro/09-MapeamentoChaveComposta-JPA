package br.com.fiap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.DependenteDAO;
import br.com.fiap.dao.impl.DependenteDAOImpl;
import br.com.fiap.entity.Dependente;
import br.com.fiap.entity.Funcionario;
import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Teste {
	
	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		f.setDataNascimento(new GregorianCalendar(1988, Calendar.NOVEMBER, 12));
		f.setNome("Fernando");
		f.setSalario(5000);
		f.setConta(55544433);
		f.setAgencia(321);
		
		Dependente d = new Dependente();
		d.setNome("Vanessa");
		d.setFuncionario(f);
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		DependenteDAO dao = new DependenteDAOImpl(em);
		dao.create(d);
		try {
			dao.commit();
		} catch (CommitErrorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		em.close();
		System.exit(0);
	}
}
