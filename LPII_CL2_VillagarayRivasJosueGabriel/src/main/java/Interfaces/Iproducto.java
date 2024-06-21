package Interfaces;

import java.util.List;

import Modelo.TblProductocl2;

public interface Iproducto {
	public void RegistrarProducto(TblProductocl2 tblpro);
	public List<TblProductocl2> ListadoProducto();

}
