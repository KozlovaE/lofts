package ru.kisa.lofts;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdminServiceTest {

    private final AdminService adminService = new AdminService();

    @Test
    public void shouldGetRandomAdmin(){
        Admin randomAdmin = adminService.getRandomAdmin();
        System.out.println(randomAdmin);
    }

}