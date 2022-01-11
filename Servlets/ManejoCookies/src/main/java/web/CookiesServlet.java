package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet{
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //Suponemos que el usuario ingresa por primera vez
        boolean nuevoUsuario = true;
        String mensaje = null;
        
        //Obtenemos el arreglo de cookies
        Cookie[] cookies = request.getCookies();
        
        //Buscamos si existe una cookie creada con anterioridad
        if(cookies != null) {
            for(Cookie c: cookies) {
                if(c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")) {
                    //Si ya existe la cookie es un usuario recurrente
                    nuevoUsuario = false;
                    mensaje = "Gracias por visitar nuevamente nuesto sitio";
                    break;
                }
            }
        }
        
        if(nuevoUsuario) {
            Cookie visitanteCookie = new Cookie("visitanteRecurrente", "si");
            response.addCookie(visitanteCookie);
            mensaje = "Gracias por visitar nuestro sitio por primera vez";
        }
        
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("Mensaje " + mensaje);
        out.close();
    }
}
