package br.com.carstore.servlet;

import br.com.carstore.dao.CarDAO;
import br.com.carstore.model.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/create-car")
public class CreateCarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String carName = request.getParameter("car-name");

//        Car carJson = new Car();
//
//        new CarDAO().createCar(carJson);
//
//        request.getRequestDispatcher("index.html").forward(request, response);

        String carJson = "{ \"carName\": \"" + carName + "\" }";

        response.setContentType("application/json");

        PrintWriter out = response.getWriter();
        out.print(carJson);
        out.flush();

        request.getRequestDispatcher("index.html").forward(request, response);

    }
}
