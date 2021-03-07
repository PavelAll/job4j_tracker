package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает работу обьеков счета в банке клиентов User
 * @author Pavel Alekseev
 * @version 1.0
 */
public class Account {
    /**
     * Поля requisite и balance - хранят реквезиты счета и баланс счета
     */
    private String requisite;
    private double balance;

    /**
     * Консруктор для инициализации полей класса, принимает requisite и balance
     * @param requisite - инициализирует реквизит счета
     * @param balance - инициализирует баланс счета
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод возвращает реквизиты счета
     * @return requisite - номер реквизита
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод задает реквизиты счета полю requisite класса
     * @param requisite - номер реквизита
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод возвращает баланс счета клиена банка
     * @return balance - баланс счета
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод задает баланс счета клиента банка
     * @param balance - баланс счета
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Метод сравнивает обьект реквезита счета пришедший как параметр в метод по
     * полю requisite пришедшего обьекта с обьектом вызвавшим метод.
     * @param o - обьект с полем requisite пришедший как параметр в метод
     * @return true или false в зависимости от сравнения по полю или ссылкам
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
