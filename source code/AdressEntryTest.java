import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdressEntryTest {

    AdressEntry a;
    @Test
    void testgetFirstName() {
        a = new AdressEntry("Mahdi","Fugfugosh","18688 Galton Ln ","Hayward","CA",94588,"510-415-7353","fmahdi1@icloud.com");
        assertEquals(a.getFirstName(), ("Mahdi"));
    }

    @Test
    void testsetFirstName() {
        a = new AdressEntry("Mahdi","Fugfugosh","18688 Galton Ln ","Hayward","CA",94588,"510-415-7353","fmahdi1@icloud.com");
        a.setFirstName("Jacob");
        assertEquals(a.getFirstName(),"Jacob");
    }

    @Test
    void testgetLastName() {
        a = new AdressEntry("Mahdi","Fugfugosh","18688 Galton Ln ","Hayward","CA",94588,"510-415-7353","fmahdi1@icloud.com");
        assertEquals(a.getLastName(),"Fugfugosh");
    }

    @Test
    void testsetLastName() {
        a = new AdressEntry("Mahdi","Fugfugosh","18688 Galton Ln ","Hayward","CA",94588,"510-415-7353","fmahdi1@icloud.com");
        a.setLastName("Shultiz");
        assertEquals(a.getLastName(),"Shultiz");
    }

    @Test
    void testgetZip() {
        a = new AdressEntry("Mahdi","Fugfugosh","18688 Galton Ln ","Hayward","CA",94588,"510-415-7353","fmahdi1@icloud.com");
        assertEquals(a.getZip(),94588);
    }

    @Test
    void testsetZip() {
        a = new AdressEntry("Mahdi","Fugfugosh","18688 Galton Ln ","Hayward","CA",94588,"510-415-7353","fmahdi1@icloud.com");
        a.setZip(94546);
        assertEquals(a.getZip(),94546);
    }

    @Test
    void testToString() {
        a = new AdressEntry("Mahdi","Fugfugosh","18688 Galton Ln ","Hayward","CA",94588,"510-415-7353","fmahdi1@icloud.com");
        assertEquals(a.toString(),("Mahdi Fugfugosh\n" +
                "   18688 Galton Ln \n" +
                "   Hayward, CA 94588\n" +
                "   fmahdi1@icloud.com\n" +
                "   510-415-7353"));
    }

    @Test
    void testcompareTo1() {
        a = new AdressEntry("Mahdi","Fugfugosh","18688 Galton Ln ","Hayward","CA",94588,"510-415-7353","fmahdi1@icloud.com");
        AdressEntry b = new AdressEntry("Jacob","Shultiz","Lake Chabot Rd","Castro Valley","CA",94546,"510-431-2145","jshultiz@gmail.com");
        assertTrue(a.compareTo(b)<0);
    }

    @Test
    void testcompareTo2() {
        a = new AdressEntry("Mahdi","Fugfugosh","18688 Galton Ln ","Hayward","CA",94588,"510-415-7353","fmahdi1@icloud.com");
        AdressEntry b = new AdressEntry("Jacob","Shultiz","Lake Chabot Rd","Castro Valley","CA",94546,"510-431-2145","jshultiz@gmail.com");
        assertTrue(b.compareTo(a)>0);
    }

    @Test
    void testEquals1() {
        a = new AdressEntry("Mahdi","Fugfugosh","18688 Galton Ln ","Hayward","CA",94588,"510-415-7353","fmahdi1@icloud.com");
        AdressEntry b = new AdressEntry("Jacob","Shultiz","Lake Chabot Rd","Castro Valley","CA",94546,"510-431-2145","jshultiz@gmail.com");
        assertNotEquals(a, b);
    }

    @Test
    void testEquals2() {
        a = new AdressEntry("Mahdi","Fugfugosh","18688 Galton Ln ","Hayward","CA",94588,"510-415-7353","fmahdi1@icloud.com");
        AdressEntry b = new AdressEntry("Mahdi","Fugfugosh","18688 Galton Ln ","Hayward","CA",94588,"510-415-7353","fmahdi1@icloud.com");
        assertEquals(a, b);
    }
}