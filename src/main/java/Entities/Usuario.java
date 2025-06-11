package Entities;

public class Usuario extends Base{
    private String authOId;
    private String username;
    public Usuario(String authOId, String username) {
        this.authOId = authOId;
        this.username = username;
    }
}
