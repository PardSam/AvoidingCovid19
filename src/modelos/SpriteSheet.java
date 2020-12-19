package modelos;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

/**
 *
 * @version 18/12/2020
 * @author Sanchez Pardo
 * @author Monja Vasquez
 */
public class SpriteSheet {

    private BufferedImage sheet;

    public SpriteSheet(String ruta) {
        try {
            this.sheet = ImageIO.read(getClass().getResource(ruta));
        } catch (Exception e) {
        }

    }

    public BufferedImage getSprite(int columna, int fila, int ancho, int alto) {
        return sheet.getSubimage((columna * ancho) - ancho, (fila * alto) - alto, ancho, alto);
    }
}
