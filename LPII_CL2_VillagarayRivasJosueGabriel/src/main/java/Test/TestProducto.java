package Test;

import java.util.List;

import Dao.CrudProductoImp;
import Modelo.TblProductocl2;

public class TestProducto {

	public static void main(String[] args) {
		TblProductocl2 tblpro = new TblProductocl2();
		CrudProductoImp crud = new CrudProductoImp();
		
		//Registrar
		
//		tblpro.setNombrecl2("Panes");
//		tblpro.setPrecioventacl2(1.00);
//		tblpro.setPreciocompcl2(3.50);
//		tblpro.setEstadocl2("Vigente");
//		tblpro.setDescripcl2("de fabrica");
//		
//		crud.RegistrarProducto(tblpro);
		
		//Listar
		List<TblProductocl2> listar = crud.ListadoProducto();
		  for(TblProductocl2 lista:listar) {
			  System.out.print("\n" + 
                      "Codigo : " + lista.getIdproductocl2() + "\n" + 
					   "Nombre : " + lista.getNombrecl2() + "\n" + 
                       "Precio Venta : " + lista.getPrecioventacl2() + "\n" +
					   "Precio Compra : " + lista.getPreciocompcl2() + "\n" +
                       "Estado : " + lista.getEstadocl2() + "\n" +
					   "Descripcion : " + lista.getDescripcl2() + "\n" + "\n");
		  };

	}

}
