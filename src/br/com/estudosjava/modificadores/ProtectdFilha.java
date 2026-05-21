
// Java
package br.com.estudosjava.modificadores;

public class ProtectdFilha extends Protectd {
    public void exibir() {
        // Pode acessar membros protegidos da classe base
        mostrarMensagem();
    }
}