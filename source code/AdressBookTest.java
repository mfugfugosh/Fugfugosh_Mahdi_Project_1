import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdressBookTest {

    AdressBook a = new AdressBook();

    @Test
    void testgetAddressEntryList() {
        a = new AdressBook();
        a.add(new AdressEntry());
        assertEquals(a.getAddressEntryList().size(),1);
    }

    @Test
    void testadd() {
        a = new AdressBook();
        a.add(new AdressEntry());
        assertEquals(a.add(new AdressEntry()),false);
    }

    @Test
    void testfind() {
        a = new AdressBook();
        a.add(new AdressEntry("Mahdi","Fugfugosh","18688 Galton Ln ","Hayward","CA",94588,"510-415-7353","fmahdi1@icloud.com"));
        assertEquals(a.find("Fug",0).size() ,1);
    }

    @Test
    void testgetAddress() {
        a = new AdressBook();
        a.add(new AdressEntry("Mahdi","Fugfugosh","18688 Galton Ln ","Hayward","CA",94588,"510-415-7353","fmahdi1@icloud.com"));
        AdressEntry e = new AdressEntry("Mahdi","Fugfugosh","18688 Galton Ln ","Hayward","CA",94588,"510-415-7353","fmahdi1@icloud.com");
        assertEquals(a.getAddress(0),e);
    }

    @Test
    void testlessThan1() {
        a = new AdressBook();
        a.add(new AdressEntry("Mahdi","Fugfugosh","18688 Galton Ln ","Hayward","CA",94588,"510-415-7353","fmahdi1@icloud.com"));
        a.add(new AdressEntry("Jacob","Shultiz","Lake Chabot Rd","Castro Valley","CA",94546,"510-431-2145","jshultiz@gmail.com"));
        AdressBook b = new AdressBook();
        b.add(new AdressEntry("Tommy","Faustka","San Miguel Ave","Castro Valley","CA",94546,"510-731-8895","thomasfaustka15@yahoo.com"));
        assertTrue(b.lessThan(a));
    }

    @Test
    void testlessThan2() {
        a = new AdressBook();
        a.add(new AdressEntry("Mahdi","Fugfugosh","18688 Galton Ln ","Hayward","CA",94588,"510-415-7353","fmahdi1@icloud.com"));
        a.add(new AdressEntry("Jacob","Shultiz","Lake Chabot Rd","Castro Valley","CA",94546,"510-431-2145","jshultiz@gmail.com"));
        AdressBook b = new AdressBook();
        b.add(new AdressEntry("Jacob","Shultiz","Lake Chabot Rd","Castro Valley","CA",94546,"510-431-2145","jshultiz@gmail.com"));
        b.add(new AdressEntry("Tommy","Faustka","San Miguel Ave","Castro Valley","CA",94546,"510-731-8895","thomasfaustka15@yahoo.com"));
        assertFalse(b.lessThan(b));
    }

    @Test
    void testgreaterThan1() {
        a = new AdressBook();
        a.add(new AdressEntry("Mahdi","Fugfugosh","18688 Galton Ln ","Hayward","CA",94588,"510-415-7353","fmahdi1@icloud.com"));
        a.add(new AdressEntry("Jacob","Shultiz","Lake Chabot Rd","Castro Valley","CA",94546,"510-431-2145","jshultiz@gmail.com"));
        AdressBook b = new AdressBook();
        b.add(new AdressEntry("Tommy","Faustka","San Miguel Ave","Castro Valley","CA",94546,"510-731-8895","thomasfaustka15@yahoo.com"));
        assertTrue(a.greaterThan(b));
    }

    @Test
    void testgreaterThan2() {
        a = new AdressBook();
        a.add(new AdressEntry("Mahdi","Fugfugosh","18688 Galton Ln ","Hayward","CA",94588,"510-415-7353","fmahdi1@icloud.com"));
        a.add(new AdressEntry("Jacob","Shultiz","Lake Chabot Rd","Castro Valley","CA",94546,"510-431-2145","jshultiz@gmail.com"));
        AdressBook b = new AdressBook();
        b.add(new AdressEntry("Jacob","Shultiz","Lake Chabot Rd","Castro Valley","CA",94546,"510-431-2145","jshultiz@gmail.com"));
        b.add(new AdressEntry("Tommy","Faustka","San Miguel Ave","Castro Valley","CA",94546,"510-731-8895","thomasfaustka15@yahoo.com"));
        assertFalse(a.greaterThan(b));
    }


    @Test
    void testEqual1() {
        a = new AdressBook();
        a.add(new AdressEntry("Mahdi","Fugfugosh","18688 Galton Ln ","Hayward","CA",94588,"510-415-7353","fmahdi1@icloud.com"));
        a.add(new AdressEntry("Jacob","Shultiz","Lake Chabot Rd","Castro Valley","CA",94546,"510-431-2145","jshultiz@gmail.com"));
        AdressBook b = new AdressBook();
        b.add(new AdressEntry("Jacob","Shultiz","Lake Chabot Rd","Castro Valley","CA",94546,"510-431-2145","jshultiz@gmail.com"));
        b.add(new AdressEntry("Tommy","Faustka","San Miguel Ave","Castro Valley","CA",94546,"510-731-8895","thomasfaustka15@yahoo.com"));
        assertNotEquals(a,b);
    }

    @Test
    void testEqual2() {
        a = new AdressBook();
        a.add(new AdressEntry("Mahdi","Fugfugosh","18688 Galton Ln ","Hayward","CA",94588,"510-415-7353","fmahdi1@icloud.com"));
        a.add(new AdressEntry("Jacob","Shultiz","Lake Chabot Rd","Castro Valley","CA",94546,"510-431-2145","jshultiz@gmail.com"));
        AdressBook b = new AdressBook();
        b.add(new AdressEntry("Mahdi","Fugfugosh","18688 Galton Ln ","Hayward","CA",94588,"510-415-7353","fmahdi1@icloud.com"));
        b.add(new AdressEntry("Jacob","Shultiz","Lake Chabot Rd","Castro Valley","CA",94546,"510-431-2145","jshultiz@gmail.com"));
        assertEquals(a,b);
    }
}