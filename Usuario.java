public class Usuario {

    private String usuario;
    private String contrasena;

    public Usuario(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public boolean validar(String user, String pass) {
        return usuario.equals(user) && contrasena.equals(pass);
    }
}
