import java.sql.*; //step 1

import static java.lang.Class.forName;

public class Demojdbc {
    public static void main(String[] args) throws Exception {
        /*
        import package
        load and register the driver
        create connection
        create statement
        execute statement
        process the results
        close the connection
         */

        String url = "jdbc:postgresql://localhost:5432/student";
        String uname = "postgres";
        String pwd = "0000";

        int sid = 101;
        String sname = "Max";
        int marks = 55;

//CRUD// String query = "insert into student values(5,'kishan', 65)";
       // String query = "update student set sname='Max' where sid=5";
        //String query = "select * from student";
     //string query ="delete from student where sid=5";
        String query = "insert into student values(?,?,?)";
        //Class.forName("org.postgresql.Driver"); //step 2
        Connection conn = DriverManager.getConnection(url,uname,pwd);//step 3
        System.out.println("Connection Established");

      //Statement st = conn.createStatement();// step 4
        PreparedStatement st = conn.prepareStatement(query);
        st.setInt(1, sid);
        st.setString(2, sname);
        st.setInt(3, marks);



        st.execute();




      //  ResultSet rs = st.executeQuery(query);// step 5
       // rs.next();//step 6
        //String name = rs.getString("sname");
        //System.out.println("Name of the Student: "+ name);

     //   while(rs.next()){
   //         System.out.print(rs.getInt(1)+ " - ");
    //        System.out.print(rs.getString(2)+ " - ");
     //       System.out.println(rs.getInt(3));
      //  }

        conn.close();//step 7;
        System.out.println("Connection Closed");







    }
}
