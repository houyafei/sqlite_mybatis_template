package com.lightmatter;

import com.lightmatter.dto.User;
import com.lightmatter.mapperservice.InitTableService;
import com.lightmatter.mapperservice.UserService;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        InitTableService initTableService = new InitTableService();
        initTableService.creatStudentTable();
        Thread.sleep(100);
        UserService service = new UserService();
        User user = service.getUser(1);
        System.out.println();
//        for (int i = 10; i > 1; ) {
//
//        }
    }
}
