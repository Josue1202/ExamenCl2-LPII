package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Interfaces.Iusuario;
import Modelo.TblUsuariocl2;

public class CrudUsuarioImp implements Iusuario{

	@Override
	public boolean ValidarUsuario(String usuario,String password) {		
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("LPII_CL2_VillagarayRivasJosueGabriel");
		EntityManager emanager = conex.createEntityManager();		
		
		// APLICAMOS EL JPQL RELACIONADO CON ENTIDADES...
		Query consulta=emanager.createQuery("SELECT u FROM TblUsuariocl2 u where u.usuariocl2=:x and u.passwordcl2=:y",TblUsuariocl2.class);
		//
		consulta.setParameter("x", usuario);
		consulta.setParameter("y", password);
		List<TblUsuariocl2> confir=consulta.getResultList();
					
		return !confir.isEmpty();
	}

}
