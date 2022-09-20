/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial2;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class P2 {
    private static final Scanner s = new Scanner(System.in);
    public static void p2(){
String url = "jdbc:mysql://localhost:3306/dbcomisiones?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
 int suma1 = 0;
 int suma2 = 0;
 int suma3 = 0;
 int suma4 = 0;
 int suma5 = 0;
 int suma6 = 0;
try {
         //paso 2 creamos el objeto conexion
            Connection conexion = DriverManager.getConnection(url,"root","oscarlemus18");
            //paso 3 creamos el objeto statement
            Statement sentencia = conexion.createStatement();
            //paso 4 creamos la instruccion
            String sql = "SELECT * FROM tb_comisiones";
            // paso 5 ejecutamos el query
            ResultSet resultado = sentencia.executeQuery(sql);
            // paso 6. procesar el resultado
            // explicar como se maneja al siguiente registro
            while(resultado.next()){
                System.out.println("id ="+resultado.getInt(1));
                System.out.println("correlativo = "+resultado.getInt(2));
                System.out.println("nombre ="+resultado.getString(3));
                System.out.println("enero ="+resultado.getInt(4));
                System.out.println("febrero ="+resultado.getInt(5));
                System.out.println("marzo ="+resultado.getInt(6));
                System.out.println("abril ="+resultado.getInt(7));
                System.out.println("mayo ="+resultado.getInt(8));
                System.out.println("junio ="+resultado.getInt(9));
                
                suma1 += resultado.getInt(4);
                suma2 += resultado.getInt(5);
                suma3 += resultado.getInt(6);
                suma4 += resultado.getInt(7);
                suma5 += resultado.getInt(8);
                suma6 += resultado.getInt(9);
                
                
                
             }
            System.out.println("Suma total de enero: "+suma1);
            System.out.println("Suma total de febrero: "+suma2);
            System.out.println("Suma total de marzo: "+suma3);
            System.out.println("Suma total de abril: "+suma4);
            System.out.println("Suma total de mayo: "+suma5);
            System.out.println("Suma total de junio: "+suma6);
        } catch (SQLException ex) {
            System.out.println("Ocurrio un Problema:"+ex.getMessage());
        }
}
public static void m_principal() {
    
        int opcion =0;

    System.out.println("""
                       1. Consulta id
                       2. Listado de los vendedores
                       3. Actualizar datos de vendedores
                       4. Modificar datos de vendedores """);
    opcion = s.nextInt();
    
    switch(opcion){
        case 1:
            
        case 2:
            p2();
        case 3:
            
        case 4:
    }
    
    
}
    public static void main(String[] args) {
        m_principal();
    }
}

