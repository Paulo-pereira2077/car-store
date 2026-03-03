package br.com.carstore.dao;

import br.com.carstore.model.Car;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import static java.sql.DriverManager.getConnection;

public class CarDAO {

    public void createCar(Car car){

        String SQL = "INSERT INTO CAR (NAME) VALUES (?)";

        try {

            Connection connection = DriverManager.getConnection(url "jdbc:h2:~/test", user "sa", password "sa");

            System.out.println("success in connection");

            PreparedStatement preparedStatement= connection.prepareStatement(SQL);
            preparedStatement.setString(1, car.getName());
            preparedStatement.execute();

            System.out.println("succes in insert command");

            connection.close();

        } catch (Exception e){

            System.out.println("error in connection");

        }

    }

}
