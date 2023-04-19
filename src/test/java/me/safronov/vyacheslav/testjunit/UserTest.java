package me.safronov.vyacheslav.testjunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


//Задание
//Создайте проект и добавьте в него библиотеку JUnit.
//Создайте класс UserTest и класс User с полями логин и email. Класс «User» нужно будет тестировать.
//В классе UserTest пропишите следующие тесты:
//Создайте тест, который выполнит тестирование создания объекта User с передачей в него двух параметров.
// Такая функция лишь должна проверять устанавливаются ли данные при создании объекта;
//Создайте аналогичный тест, который выполнит тестирование по созданию объекта без передачи в него параметров;
//Создайте тест, который протестирует установлен ли корректный Email адрес в поле email в классе User.
// Некорректным будет считаться тот email, в котором нет знака @ или же знака точки.
//Создайте тест, который определяет, равны ли login и email (Они не должны быть равны).
public class UserTest {
    private static final String login = "ad55";
    private static final String email = "ad55@.com";


    @Test
    public void shouldConstructorUser() {
        User user = new User(login, email);
        Assertions.assertEquals("ad55", user.getLogin());
        Assertions.assertEquals("ad55@.com", user.getEmail());
    }

    @Test
    public void shouldConstructorUserNull() {
        User user = new User();
        Assertions.assertNull(user.getLogin());
        Assertions.assertNull(user.getEmail());
    }

    @Test
    public void shouldCheckTheCorrectSpellingEmail() {
        User user = new User(email);
        Assertions.assertTrue(user.checkTheCorrectSpellingEmail());
    }

    @Test
    public void shouldCheckingForAMatchOfLoginAndEmail() {
        User user = new User(login, email);
        Assertions.assertFalse(user.checkingForAMatchOfLoginAndEmail());
    }
}
