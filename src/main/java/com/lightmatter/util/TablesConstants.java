package com.lightmatter.util;

public class TablesConstants {

    public static final String STUDENTS_TABLE_SQL ="" +
            "CREATE TABLE IF NOT EXISTS student " +
            "  (" +
            "    id INTEGER  not null primary key AUTOINCREMENT," +
            "    username varchar(40)," +
            "    password varchar(40)," +
            "    age INTEGER,"+
            "    tag varchar(255)"+
            "        );";

}
