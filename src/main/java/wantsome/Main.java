package wantsome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

//in cazul in care nu folosim o baza de date, atunci adaugam optiunea de 'exclude'
// intrucat SpringBoot scaneaza la runtime o baza de date si daca nu o gaseste atunci arunca eroare
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello All");
        SpringApplication.run(Main.class, args);
    }
}