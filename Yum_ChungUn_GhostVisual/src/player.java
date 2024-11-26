/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chung
 */
public class player {
    

 String usuario,password;
 String[] resumenPartidas= new String[9];
 String[][] usuariosInfo = {{"chungun23","pollochuco24","mellzx","juanCarlos","spookyscaryskeleton","ghostmaster",""},
                                    {"mcr4ever","pollochu","gatos001","perry123","hallowee","soymejor",""}, 
                                    {"10","13","7","2","23","60",""}};
 

    

    public String[][] getUsuariosInfo() {
        return usuariosInfo;
    }

    public void setUsuariosInfo(String[][] usuariosInfo) {
        this.usuariosInfo = usuariosInfo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getResumenPartidas() {
        return resumenPartidas;
    }

    public void setResumenPartidas(String[] resumenPartidas) {
        this.resumenPartidas = resumenPartidas;
    }
 
}


