import Entities.Persona;
import Entities.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User diego = new User("diego", "basili", "email", "casa");
        Persona persona = diego;
        System.out.println(persona);
    }
}