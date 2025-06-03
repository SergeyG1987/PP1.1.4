package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        Util.getConnection();
        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();
        // Добавление 4 пользователей
        userDao.saveUser("Alice", "Smith", (byte) 25);
        System.out.println("User с именем — Alice добавлен в базу данных");
        userDao.saveUser("Bob", "Johnson", (byte) 30);
        System.out.println("User с именем — Bob добавлен в базу данных");
        userDao.saveUser("Charlie", "Brown", (byte) 22);
        System.out.println("User с именем — Charlie добавлен в базу данных");
        userDao.saveUser("Diana", "Wilson", (byte) 28);
        System.out.println("User с именем — Diana добавлен в базу данных");

//        userDao.removeUserById(1);
//        userDao.removeUserById(2);
//        userDao.removeUserById(3);
//        userDao.removeUserById(4);

        // Получение всех пользователей
        userDao.getAllUsers().forEach(System.out::println);

        // Очистка таблицы
//        userDao.cleanUsersTable();
//
//        // Удаление таблицы
//        userDao.dropUsersTable();
    }


    // userDao.getAllUsers();


    }


