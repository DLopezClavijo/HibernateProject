package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import bean.Artista;

public class ArtistaDAOImp implements ArtistaDAO {

	public void guardar(Artista a) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sesion = sf.openSession();
		
		try {
			sesion.beginTransaction();
			sesion.save(a);
			sesion.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sesion.close();
			sf.close();
		}
		
	}

	public void save(Artista a) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Artista a) {
		// TODO Auto-generated method stub
		
	}

	public void get(Artista a) {
		// TODO Auto-generated method stub
		
	}

	public void update(Artista a) {
		// TODO Auto-generated method stub
		
	}

}
