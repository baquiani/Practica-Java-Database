/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.sql.*;
public class ConBD {
    String path=new java.io.File("PostTV.accdb").getAbsolutePath();
    String url="jdbc:ucanaccess://E:/PRACTICA/ProiectPostTV/app/PostTV.accdb";
    Connection con;
    ConBD(){
        
        try{
            con=DriverManager.getConnection(url);
            
            
        }
        
        catch(SQLException ex){
            ex.printStackTrace();
        }
    
    
}
    
    
    public void insertColaborari(int id,int pers,int emis){
        
        try{
        con=DriverManager.getConnection(url);
        String sql="INSERT INTO Colaborari VALUES(?,?,?)";
        PreparedStatement stmt=con.prepareStatement(sql);
        stmt.setInt(1,id);
        stmt.setInt(2,pers);
        stmt.setInt(3,emis);
        stmt.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    
}
    public void insertMeserii(int id,String meserie){
        
        try{
        con=DriverManager.getConnection(url);
        String sql="INSERT INTO Meserie VALUES(?,?)";
        PreparedStatement stmt=con.prepareStatement(sql);
        stmt.setInt(1,id);
        stmt.setString(2,meserie);
      
        stmt.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void insertLocalitati(int id,String localitate){
        
        try{
        con=DriverManager.getConnection(url);
        String sql="INSERT INTO Localitati VALUES(?,?)";
        PreparedStatement stmt=con.prepareStatement(sql);
        stmt.setInt(1,id);
        stmt.setString(2,localitate);
      
        stmt.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    
}
    public void insertFirma(int id,String firma){
        
        try{
        con=DriverManager.getConnection(url);
        String sql="INSERT INTO Firme VALUES(?,?)";
        PreparedStatement stmt=con.prepareStatement(sql);
        stmt.setInt(1,id);
        stmt.setString(2,firma);
      
        stmt.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
}
    public void insertStudio(int id,String studio){
        
        try{
        con=DriverManager.getConnection(url);
        String sql="INSERT INTO Studio VALUES(?,?)";
        PreparedStatement stmt=con.prepareStatement(sql);
        stmt.setInt(1,id);
        stmt.setString(2,studio);
      
        stmt.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void insertTipEmisiune(int id,String tip){
        
        try{
        con=DriverManager.getConnection(url);
        String sql="INSERT INTO Tipuri_Emisiuni VALUES(?,?)";
        PreparedStatement stmt=con.prepareStatement(sql);
        stmt.setInt(1,id);
        stmt.setString(2,tip);
      
        stmt.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void insertPersoane(int id,String nume,String prenume,String cnp,int domiciliu,int meserie){
        
        try{
        con=DriverManager.getConnection(url);
        String sql="INSERT INTO Persoane VALUES(?,?,?,?,?,?)";
        PreparedStatement stmt=con.prepareStatement(sql);
        stmt.setInt(1,id);
        stmt.setString(2,nume);
        stmt.setString(3,prenume);
        stmt.setString(4,cnp);
        stmt.setInt(5,domiciliu);
        stmt.setInt(6,meserie);
      
        stmt.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void insertSponsorizare(int id,double suma,int emis,int firma){
        
        try{
        con=DriverManager.getConnection(url);
        String sql="INSERT INTO Sponsorizari VALUES(?,?,?,?)";
        PreparedStatement stmt=con.prepareStatement(sql);
        stmt.setInt(1,id);
        stmt.setDouble(2,suma);
        stmt.setInt(3,emis);
        stmt.setInt(4,firma);
        
      
        stmt.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void insertDifuzari(int id,String zi,int oraIn,int oraSf,int emis){
        try{
            con=DriverManager.getConnection(url);
            String sql="INSERT INTO Difuzari VALUES(?,?,?,?,?)";
            PreparedStatement stmt=con.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.setString(2, zi);
            stmt.setInt(3,oraIn);
            stmt.setInt(4, oraSf);
            stmt.setInt(5, emis);
            stmt.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
        
    }
    public void insertEmisiuni(int id,String nume,int tip,int coord,int loc){
        
        try{
        con=DriverManager.getConnection(url);
        String sql="INSERT INTO Emisiuni VALUES(?,?,?,?,?)";
        PreparedStatement stmt=con.prepareStatement(sql);
        stmt.setInt(1,id);
        stmt.setString(2,nume);
        stmt.setInt(3,tip);
        stmt.setInt(4,coord);
        stmt.setInt(5,loc);
      
      
        stmt.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public String[] selectPersoane(){
        String[] tb=new String[10];
        int i=0;
        try{
            con=DriverManager.getConnection(url);
            String sql="SELECT nume,prenume,cnp,m.nume AS meserie,l.localitate AS domiciliu FROM (Persoane AS p INNER JOIN Meserie AS m ON p.meserie=m.id_meserie) INNER JOIN Localitati AS l ON l.id_loc=p.domiciliu;";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                tb[i]=(rs.getString("nume")+"  "+rs.getString("prenume")+"  "+rs.getString("cnp")+"   "+rs.getString("meserie")+"  "+rs.getString("domiciliu")+"  ");
                i++;
            }
        }
        
        catch(SQLException e){
            e.printStackTrace();
        }
        return tb;
    }
    public String[] selectLocalitati(){
        String[] tb=new String[100];
        int i=0;
        try{
            con=DriverManager.getConnection(url);
            String sql="SELECT * FROM Localitati";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                tb[i]=(rs.getInt("id_loc")+"   "+rs.getString("localitate"));
                i++;
            }
        }
        
        catch(SQLException e){
            e.printStackTrace();
            
        }
        
        return tb;
    }
    public String[] selectMeserii(){
        String[] tb=new String[100];
        int i=0;
        try{
            con=DriverManager.getConnection(url);
            String sql="SELECT * FROM Meserie";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                tb[i]=(rs.getInt("id_meserie")+"   "+rs.getString("nume"));
                i++;
            }
        }
        
        catch(SQLException e){
            e.printStackTrace();
            
        }
        return tb;
        
    }
    
    public String[] selectDifuzari(){
        String[] tb=new String[100];
        int i=0;
        try{
            con=DriverManager.getConnection(url);
            String sql="SELECT id_difuzare,zi,oraInceput,oraSfarsit,e.nume FROM Difuzari AS d INNER JOIN Emisiuni AS e ON d.id_difuzare=e.id_emis";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                
                tb[i]=(rs.getString("zi")+"   "+rs.getInt("oraInceput")+"   "+ rs.getInt("oraSfarsit")+"   "+rs.getString("nume"));
                i++;
                
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return tb;
    }
    
    public String[] selectFirme(){
        String[] tb=new String[100];
        int i=0;
        try{
            con=DriverManager.getConnection(url);
            String sql="SELECT * FROM Firme";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                tb[i]=(rs.getInt("id_firma")+"   "+rs.getString("nume"));
                i++;
            }
        }
        
        catch(SQLException e){
            e.printStackTrace();
            
        }
        return tb;
        
    }
    
    public String[] selectStudio(){
        String[] tb=new String[100];
        int i=0;
        try{
            con=DriverManager.getConnection(url);
            String sql="SELECT * FROM Studio";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
            tb[i]=(rs.getInt("id_studio")+"   "+rs.getString("nume"));
            i++;
            }
            
        }
        
        catch(SQLException e){
            e.printStackTrace();
            
        }
        return tb;
        
    }
    
    public String[] selectColaborari(){
        String[] tb=new String[100];
        int i=0;
        try{
            con=DriverManager.getConnection(url);
            String sql="SELECT p.nume AS pnume,prenume,e.nume AS enume FROM (Colaborari AS c INNER JOIN Persoane AS p ON c.persoane=p.id_persoana) INNER JOIN Emisiuni AS e ON e.id_emis=c.emisiuni";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                tb[i]=(rs.getString("pnume")+"   "+rs.getString("prenume")+"   "+rs.getString("enume"));
                i++;
            }
        }
        
        catch(SQLException e){
            e.printStackTrace();
            
        }
        
        return tb;
    }
    
    public String[] selectSponsorizari(){
        String[] tb=new String[100];
        int i=0;
        try{
            con=DriverManager.getConnection(url);
            String sql="SELECT sumaRon,e.nume AS enume,f.nume AS fnume FROM (Sponsorizari AS s INNER JOIN Emisiuni AS e ON s.emisiuni=e.id_emis) INNER JOIN Firme AS f ON f.id_firma=s.firme";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                tb[i]=(rs.getInt("sumaRon")+"   "+rs.getString("enume")+"   "+rs.getString("fnume"));
                i++;
            }
        }
        
        catch(SQLException e){
            e.printStackTrace();
            
        }
        return tb;
        
    }
    
    public String[] selectTipEmisiune(){
        String[] tb=new String[100];
        int i=0;
        try{
            con=DriverManager.getConnection(url);
            String sql="SELECT * FROM Tipuri_Emisiuni ";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                tb[i]=(rs.getInt("id_emisiune")+"   "+rs.getString("tipEmisiune"));
                i++;
            }
        }
        
        catch(SQLException e){
            e.printStackTrace();
            
        }
        return tb;
        
    }
    public String[] selectEmisiune(){
        String[] tb=new String[100];
        int i=0;
        try{
            con=DriverManager.getConnection(url);
            String sql="SELECT e.nume AS enume,te.tipEmisiune AS tipEmisiune,p.nume AS CoordSefn,p.prenume AS CoordSefp,l.localitate AS Locatie FROM((Emisiuni AS e INNER JOIN Tipuri_Emisiuni AS te ON e.tipEmisiune=te.id_emisiune)INNER JOIN Persoane AS p ON e.CoordSef=p.id_persoana)INNER JOIN Localitati AS l ON e.Locatie=l.id_loc ";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
               tb[i]=(rs.getString("enume")+"   "+rs.getString("tipEmisiune")+"   "+rs.getString("CoordSefn")+"   "+rs.getString("CoordSefp")+"   "+rs.getString("Locatie"));
               i++;
            }
        }
        
        catch(SQLException e){
            e.printStackTrace();
            
        }
        
        return tb;
    }
}