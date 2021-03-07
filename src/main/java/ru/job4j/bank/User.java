package ru.job4j.bank;
import java.util.Objects;

/**
 * Класс описывает работу
 * @author Pavel Alekseev
 * @version 1.0
 */
public class User {
    /**
     * Переменная passport хранит номер паспорта клиента банка
     * Переменная username хранит фамилию, имя клиента банка
     */
    private String passport;
    private String username;

    /**
     * Конструктор принимает в качестве параметров
     * @param passport - номер паспорта клиента банка
     * @param username - имя фамилия клиента банка
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * При вызове метода getPassport() возвращает номер пасспорта клиента банка
     * @return passport - номер пасспорта клиента банка
     */
    public String getPassport() {
        return passport;
    }

    /**
     *  Метод принимает в качестве аргумента номер пасспора клиента банка
     * @param passport - задает номер пасспорта клиента в поле класса passport
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод возвращает фамилию и имя клиента банка
     * @return username - имя и фамилия клиента банка
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод задает фамилию и имя клиента банка в поле класса username
     * @param username - фамилия и имя клиента банка
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Метод сравнивает два обьекта по содержимому
     * @param o - переданный обьект для сравнения с текущим(вызывающим метод) обьектом
     * @return возвращает true или false в зависимости от результата сравнения
     * Сравнение идет по полю passport
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
