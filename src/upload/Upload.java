package upload;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/upload")
public class Upload extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    public Upload() {
        super();
    }
 
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
         
        /*Obtem o caminho relatorio da pasta img*/
        String path = request.getServletContext().getRealPath("img")+ File.separator;
         
        File files = new File(path);
        response.setContentType("image/jpeg");
         
        /*Mostra o arquivo que está na pasta img onde foi realizado o upload*/
        for (String file : files.list()) {
            File f = new File(path + file);
            BufferedImage bi = ImageIO.read(f);
            OutputStream out = response.getOutputStream();
            ImageIO.write(bi, "jpg", out);
            out.close();
        }
    }

}