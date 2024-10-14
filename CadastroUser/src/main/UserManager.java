package main;

import java.util.HashMap;
import java.util.Map;

public class UserManager {
    private static Map<String, String> users = new HashMap<>();

    // M�todo para cadastrar usu�rio
    public static boolean signUp(String username, String password) {
        if (users.containsKey(username)) {
            return false; // Usu�rio j� existe
        }
        users.put(username, password);
        return true; // Cadastro bem-sucedido
    }

    // M�todo para verificar login
    public static boolean login(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }
}
