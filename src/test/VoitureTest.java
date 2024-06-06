package test;

import main.Voiture;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VoitureTest {
    @Test
    public void VoitureTest()  {
        Voiture v1 = new Voiture("Mercedes", 40000.5);
        System.out.println(v1.getMarque());
        System.out.println(v1.getPrix());
        assertEquals(v1.getMarque(),"Mercedes");
        assertEquals(v1.getPrix(),40000.5);
        v1.setPrix(105000.2);
        v1.setMarque("Peugeot");
        assertEquals(v1.getMarque(),"Peugeot");
        assertEquals(v1.getPrix(),105000.2);


    }
}
