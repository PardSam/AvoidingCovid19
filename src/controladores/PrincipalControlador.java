package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import modelos.Jugador;
import modelos.PartidaCaretaker;
import modelos.Perfil;
import vistas.AcercaVista;
import vistas.AjustesVista;
import vistas.AyudaVista;
import vistas.EscenariosVista;
import vistas.PartidaVista;
import vistas.PersonajesVista;
import vistas.PrincipalVista;
import vistas.RankingVista;

/**
 * Representa una implementación de ActionListener para el Controlador de
 * Principal
 *
 * @version 09/12/2020/A
 * @author Sanchez Pardo
 * @author Monja Vasquez
 * @author More Villegas
 * @author Diaz Coronado
 * @author Gonzales Cubas
 * @author Ugaz Arenas.
 */
public class PrincipalControlador implements ActionListener {

    public PrincipalVista vista;
    public AcercaVista acerca;
    public AcercaControlador controladorAcerca;
    public AjustesVista ajustes;
    public AjustesControlador controladorAjuste;
    public AyudaVista ayuda;
    public AyudaControlador controladorayuda;
    public EscenariosVista escenario;
    public EscenariosControlador controladorEscenario;
    public PersonajesVista personaje;
    public PersonajesControlador controladorPersonaje;
    public PartidaVista partida;
    public PartidaControlador controladorPartida;
    public RankingVista ranking;
    public RankingControlador controladorRanking;

    public PartidaCaretaker partidaCaretaker;

    /**
     * Constructor
     *
     * @param vista Diseño
     */
    public PrincipalControlador(PrincipalVista vista) {
        this.vista = vista;

        vista.playBoton.addActionListener(this);
        vista.comenzarBoton.addActionListener(this);
        vista.escenariosBoton.addActionListener(this);
        vista.personajesBoton.addActionListener(this);
        vista.ayudaBoton.addActionListener(this);
        vista.infoBoton.addActionListener(this);
        vista.ajustesBoton.addActionListener(this);
        vista.salirBoton.addActionListener(this);
        vista.rankingBoton.addActionListener(this);

        escenario = new EscenariosVista();
        controladorEscenario = new EscenariosControlador(escenario);

        personaje = new PersonajesVista();
        controladorPersonaje = new PersonajesControlador(personaje);

        ranking = new RankingVista();
        controladorRanking = new RankingControlador(ranking);

        ayuda = new AyudaVista();
        controladorayuda = new AyudaControlador(ayuda);

        acerca = new AcercaVista();
        controladorAcerca = new AcercaControlador(acerca);

        ajustes = new AjustesVista();
        controladorAjuste = new AjustesControlador(ajustes);
        this.vista.setLocationRelativeTo(null);
        vista.setVisible(true);

        escenario.setVisible(false);
        personaje.setVisible(false);
        ayuda.setVisible(false);
        acerca.setVisible(false);
        ajustes.setVisible(true);
        ranking.setVisible(false);

        partidaCaretaker = new PartidaCaretaker();

        this.vista.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    /**
     * Detectar y manejar la acción sobre el evento (ventana principal)
     *
     * @param e Acción en el evento
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "play":
                partida = new PartidaVista();
                controladorPartida = new PartidaControlador(partida, partidaCaretaker);
                partida.setVisible(true);
                break;
            case "comenzar":
                partida = new PartidaVista();
                controladorPartida = new PartidaControlador(partida, partidaCaretaker);
                partida.setVisible(true);
                break;
            case "escenarios":
                controladorEscenario.cargar();
                escenario.setVisible(true);
                break;
            case "personajes":
                controladorPersonaje.cargar();
                personaje.setVisible(true);
                break;
            case "ranking":
                Jugador j = Perfil.gePerfil().getJugador();
                ranking.personas.add(j);
                ranking.setVisible(true);
                break;
            case "ayuda":
                ayuda.setVisible(true);
                break;
            case "info":
                acerca.setVisible(true);
                break;
            case "ajustes":
                ajustes.setVisible(true);
                break;
            case "salir":
                System.exit(0);
                break;
        }
    }

}
