/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// probemos pues
@WebServlet(name = "ServletSaludo1", urlPatterns = {"/ServletSaludo1"})//anotaciones en java del java 7 en adelante
public class ServletSaludo1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // response.setContentType("text/html;charset=UTF-8");
        //  String nom;
//        int n1;
//        int n2;
        // nom = request.getParameter("nombre");
//        n1 = Integer.parseInt(request.getParameter("n1"));
//        n2 = Integer.parseInt(request.getParameter("n2"));
        // try (PrintWriter out = response.getWriter()) {
        /* TODO output your page here. You may use following sample code. */
        // n1 = Integer.parseInt(request.getParameter("n1"));
        //n2 = Integer.parseInt(request.getParameter("n2"));
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Mi primer Servlet</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Bienvenido a mi primer servlet </h1>");
        //out.println("<h1>n1:" + n1 + "</h1>");
        //out.println("<h1>n2:" + n2 + "</h1>");
        // out.println("<h1>Servlet ServletSaludo at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);

        response.setContentType("text/html;charset=UTF-8");
        String opcion = request.getParameter("opciones");

        double n1 = Double.parseDouble(request.getParameter("n1"));
        double n2 = Double.parseDouble(request.getParameter("n2"));

        double r = 0;
        String res = "";

        if (opcion.equals("+")) {
            r = n1 + n2;
            res = "suma";
        } else if (opcion.equals("-")) {
            r = n1 - n2;
            res = "resta";
        } else if (opcion.equals("*")) {
            r = n1 * n2;
            res = "Multipliación";
        } else {
            r = n1 / n2;
            res = "Divición";
        }

        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang=es>");
        out.println("<link href=\"css/estilo.css\" rel=\"stylesheet\" type=\"text/css\" >");
        out.println("<head>");

        out.println("<title>Mi primer Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<center>");
        out.println("<table border=\"3\">");
        out.println("<tr>");
        out.println("<td>");
        out.println("<h1>Bienvenido a mi primer servlet </h1>");
        out.println("<h2>n1=" + n1 + "</h1>");
        out.println("<h2>n2=" + n2 + "</h1>");
        out.println("<h2>La operecion es = " + res + "</h1>");
        out.println("<p>La respuesta es = " + r + "</p>");
        out.println("<a href=\"javascript:history.go(-1)\">Atrás</a>");

        out.println("<form action=\"ServletSaludo1\" Realizado por Edwin Cabascangohod=\"GET\">\n"
                + "                        <!-- <input type=\"text\" name =\"nombre\" placeholder=\" ingresa aqui\"/>-->\n"
                + "                        <input type=\"text\" value=\"" + n1 + "\" name=\"n1\" />\n"
                + "                        <input type=\"text\" value=\"" + n2 + "\" name=\"n2\" />\n"
                + "\n"
                + "                        <select name=\"opciones\"><br>\n"
                + "                            <option value=\"+\">(+)</option>\n"
                + "                            <option value=\"-\">(-)</option>\n"
                + "                            <option value=\"*\">(*)</option>\n"
                + "                            <option value=\"/\">(/)</option>\n"
                + "\n"
                + "                        </select>\n"
                + "                        <input type=\"submit\" value =\"Ingresar\"/><br>\n"
                + "                    </form>");
        out.println("</td>");
        out.println("</tr>");
        out.println("</table>");
        out.println("</center>");
        out.println("</body>");
        out.println("</html>");

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
