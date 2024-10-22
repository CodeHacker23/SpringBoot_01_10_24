package org.example.springboot_01_10_24.model;

import jakarta.persistence.*; // подключаем аннотации JPA

import javax.xml.crypto.Data;
import java.time.LocalDate;

public class model {
    @Entity
    @Table(name = "produkts ")

    public class Produkt {

        @Id // указываем, что это первичный ключ
        @GeneratedValue(strategy = GenerationType.IDENTITY) // автоматическая генерация ID в случае добавления объекта
        private Long id;

        @Column(name = "name", nullable = false) // определяем колонку для названия продукта в таблице БД
        private String name;

        @Column(name = "prise", nullable = false)// определяем колонку для прайса в таблице БД
        private double prise;

        @Column(name = "category", nullable = false)// определяем колонку для Категории в таблице БД
        private String category;

        @Column(name = " localDate", nullable = false) // определяем колонку для Срока годноти(даты) в таблице БД
        private LocalDate localDate;

        public Produkt() {   //пустой конструктор
        }

        public Produkt(Long id, String name, double prise, String category, LocalDate localDate) { // просто конструтор
            this.id = id;
            this.name = name;
            this.prise = prise;
            this.category = category;
            this.localDate = localDate;
        }

        public Long getId() {
            return id;
        }

        public double getPrise() {
            return prise;
        }

        public String getName() {
            return name;
        }

        public String getCategory() {
            return category;
        }

        public LocalDate getLocalDate() {
            return localDate;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrise(double prise) {
            this.prise = prise;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public void setLocalDate(LocalDate localDate) {
            this.localDate = localDate;
        }
    }
}


