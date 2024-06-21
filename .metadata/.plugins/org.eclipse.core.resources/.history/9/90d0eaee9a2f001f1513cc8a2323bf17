package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CrudProductoImp;
import model.TblProductocl2;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("/RegistrarProducto.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);			
		
		String nombre=request.getParameter("nombre");
		Double precio=Double.parseDouble(request.getParameter("precio"));
		Double precioven=Double.parseDouble(request.getParameter("precioven"));
		String estado=request.getParameter("estado");
		String descrip=request.getParameter("descrip");
		
		TblProductocl2 tblpro = new TblProductocl2();
		CrudProductoImp crud = new CrudProductoImp();
		
		tblpro.setNombrecl2(nombre);
		tblpro.setPrecioventacl2(precio);
		tblpro.setPreciocompcl2(precioven);
		tblpro.setEstadocl2(estado);
		tblpro.setDescripcl2(descrip);
				
		crud.RegistrarProducto(tblpro);
		
		List<TblProductocl2> listarpro=crud.ListadoProducto();
		request.setAttribute("listado", listarpro);
		request.getRequestDispatcher("/RegistrarProducto.jsp").forward(request, response);
				
		
	}	// FIN DEL METODO DOPOST...
	

}
