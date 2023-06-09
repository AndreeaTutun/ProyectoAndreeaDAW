

package controlador;

import dao.DaoCiudad;
import datos.Ciudad;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.List;
@WebServlet(name="ServletController", urlPatterns={"/ServletController"})
public class ServletController extends HttpServlet {
   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        DaoCiudad dao = new DaoCiudad();
        String operacion = request.getParameter("operacion");
        switch (operacion) {
            case "listaCiudades":
                
               try {
                //Obtenemos el método obtenerCiudades de DaoCiudades
                    List<Ciudad>lista=dao.obtenerCiudades();
                    request.setAttribute("lista", lista);

                //El controlador nos llevará a la pagina vistafinal.jsp
                    request.getRequestDispatcher("vistafinal.jsp").forward(request, response);
                    //System.out.println("JSP pintado");
                } catch (SQLException sqle) {
                    sqle.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
    }
}

}
