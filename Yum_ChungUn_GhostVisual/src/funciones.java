
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chung
 */
public class funciones {
    static loginMenu loginMenu = new loginMenu();
    static crearplayerMenu crearplayerMenu = new crearplayerMenu();
    public static int posicionUsuario = -1;
    static menuPrincipal menuPrincipal = new menuPrincipal();
    static perfilMenu perfilMenu = new perfilMenu();
    
    
    public static int validarPosicion (String[][] usuariosInfo, String usuarioBusqueda){
        for(int i=0;i<usuariosInfo[0].length;i++){
        if(usuarioBusqueda.equals(usuariosInfo[0][i])){
        loginMenu.posicionUsuario = i;
        }
        
    }
    return posicionUsuario;
    }
   
   public static boolean validarPassword(String passwordBusqueda){
    boolean passwordValida;
    passwordValida= (passwordBusqueda.length()==8);
    return passwordValida;
    }
    
  public static void crearPlayer(player player,String usuarioBusqueda, String passwordBusqueda){
   
    String[][] usuariosconCreados = new String[player.getUsuariosInfo().length][player.getUsuariosInfo()[0].length+1];
    
    for(int i=0; i< player.getUsuariosInfo().length;i++){
      for(int x=0; x<player.getUsuariosInfo()[i].length;x++){
        usuariosconCreados[i][x] = player.getUsuariosInfo()[i][x];
        }
    }
    
    usuariosconCreados[0][usuariosconCreados[0].length-1] = usuarioBusqueda;
    usuariosconCreados[1][usuariosconCreados[1].length-1] = passwordBusqueda;
    usuariosconCreados[2][usuariosconCreados[2].length-1] = "";

    player.setUsuariosInfo(usuariosconCreados);
    JOptionPane.showMessageDialog(null,"Usuario creado exitosamente!");
    
    player.setUsuario(usuarioBusqueda);
    player.setPassword(passwordBusqueda);
    
    }
  
  public static void mostrarPanel (JPanel panelContenido, JPanel panel){
      
        panel.setSize(panelContenido.getWidth(),panelContenido.getHeight());
        
        panelContenido.removeAll();
        panelContenido.add(panel);
        panelContenido.revalidate();
        panelContenido.repaint();
  
  
  }
    
 
    
}
