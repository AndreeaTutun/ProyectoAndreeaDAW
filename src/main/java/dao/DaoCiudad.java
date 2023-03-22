/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import datos.Ciudad;
import datos.Conexion;
import java.util.*;
import java.sql.*;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class DaoCiudad {
    
    public DaoCiudad() {
        
    }
    
    public List<Ciudad> listarCiudades() throws SQLException, Exception {
         Conexion conexion = new Conexion(); //Creamos un objeto conexion
	Connection con = null;
        Statement s = null;
        ResultSet rs = null;
        List<Ciudad> listadoCiudades = new ArrayList<>();
        try {
        con = conexion.getConnection(); //Obtenemos el objeto java.sql.connection
			/* Un objeto Statement permite ejecutar una sentencia SQL estatica
			 * y retornar los resultados que produce.
			 */
            String sqlQuery = "select * from city";
            s = con.createStatement();
            rs = s.executeQuery(sqlQuery);

            /*
            Para cada fila resultante proporcionada por el objeto ResultSet, 
            se debe crear un autor que coincida con los atributos del autor.
            con los datos correspondientes del ResultSet.
            Después de cada iteración, el autor se agrega a la lista.*/
            while (rs.next()) {
                Ciudad miciudad = new Ciudad();
                miciudad.setId(rs.getInt("ID"));
                miciudad.setName(rs.getString("Name"));
                miciudad.setDistrict(rs.getString("District"));
                miciudad.setPopulation(rs.getInt("Population"));
                listadoCiudades.add(miciudad);
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            throw sqle;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (s != null) {
                s.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return listadoCiudades;
    }


}