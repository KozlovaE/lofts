package ru.kisa.lofts;

//ета комментарий
/*ета
 ещё комментар
ий*/
public class Admin {
    final String name;
    final String phone;

    public Admin(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
