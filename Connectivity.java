package bookstore2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connectivity {
    Connection connect=null;
    ResultSet resultat=null;
    Statement stat=null;
    int resultat_update;

    public Connectivity(){
        
        
        //DRIVER LOADING
        
         try{Class.forName("com.mysql.jdbc.Driver");}
    catch(ClassNotFoundException e){System.err.println("error while loading the driver"+e);}
        

        // GETTING THE CONNECTION 
        try{
        connect=DriverManager.getConnection("jdbc:mysql://localhost/bookstore","root","");}
        

      catch(SQLException  e){System.err.println("error while trying to connect"+e);}
        

        //CREATING A STATEMENT 
        try{stat=connect.createStatement();}
        catch(SQLException  e){System.err.println("error while trying to create SQL statement"+e);}

}
    //ADDING A METHOD TO INSERT BOOKS IN THE DATABASE.AN INSERTED BOOK HAS ITS OWN UNIQUE KEY.
     
	public  void dateUse() {
		 try {
		 stat=connect.createStatement();
		 String requette="INSERT INTO `bookstore`.`a_book`(`id`, `Title`, `Author`, `Price`, `release`) VALUES ('555', 'the power of now', 'Eckhart Tolle', '26', '2020-11-21')";
		  resultat_update= stat.executeUpdate(requette);
		}
		 catch (SQLException e) {System.err.println("YOU MAY HAVE A Duplicate entry for key 'PRIMARY'id "+ e);}
                 
		 
		 }
        //ADDING A METHOD TO DISPLAY ALL THE BOOKS STORED IN THE DATABASE
        public void displayBook() 
	    {   
		    
	    try {
                 String col[]=new String []{"id","Title","Author","Price","release"};
	    	stat =  connect.createStatement(); 
	    	 String querry="select *from a_book "; 
	    ResultSet resul = stat.executeQuery(querry);
           
	  
	    while (resul.next()) {
	     

	        System.out.println("id : " + resul.getInt("id"));
	        System.out.println("Title : " + resul.getString("Title"));
	        System.out.println("Author : " + resul.getString("Author"));
	        System.out.println("Price : " + resul.getDouble("Price"));
	        System.out.println("release: " + resul.getDate("release"));
                
                
	    }}
            
	    catch(SQLException e){System.err.println("failed"+e);}}
		
    
    
    
    
    
    
}