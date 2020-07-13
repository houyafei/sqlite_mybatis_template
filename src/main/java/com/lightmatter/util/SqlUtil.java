package com.lightmatter.util;

import java.sql.Connection;
import java.sql.Statement;

public class SqlUtil {

    public static void creatTables(){
        createStudent();
    }

    private static void createStudent(){
        Connection c = MybatisUtil.getSession().getConnection();
        if (c == null) {
            System.err.println("Connection is null");
            return;
        }
        Statement stmt;
        try {
            String sql = TablesConstants.STUDENTS_TABLE_SQL;
            stmt = c.createStatement();
            int result = stmt.executeUpdate(sql);
            System.out.println("Table created successfully code : "+result);
            c.commit();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }


}
