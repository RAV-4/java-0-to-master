package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/GeneracionExcelServlet")
public class GeneracionExcelServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //Indica tipo de repsuesta al navegador
        response.setContentType("application/vnd.ms-excel");
        //Inidica que cuando se de clic al link se descargue el archivo
        response.setHeader("Content-Disposition", "attachment; filename=excelEjemplo.xls");
        //Para un uso mas profesional de excel poi.apache.org
        
        //Configuracion para no guardar cache
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-store");
        response.setHeader("Expires", "-1");
        
        //Desplegar la informacion al cliente
        PrintWriter out = response.getWriter();
        out.println("\tValores");
        out.println("\t1");
        out.println("\t2");
        out.println("Total\t=SUMA(B2:B3)");
        out.close();
    }
}
