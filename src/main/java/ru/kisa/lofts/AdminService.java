package ru.kisa.lofts;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AdminService {
    List<Admin> admins = new ArrayList<>();
    private final Random random = new Random();

    public AdminService() {
        admins.add(new Admin("Катя", "88005553535"));
        admins.add(new Admin("Аня", "856905746005"));
        admins.add(new Admin("Андрей","49305"));
    }

    public Admin getRandomAdmin() {
        int randomIndex = random.nextInt(admins.size());
        return admins.get(randomIndex);
    }
}
