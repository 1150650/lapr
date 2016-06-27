package lapr.project.model;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.List;
import org.junit.AfterClass;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.BeforeClass;

/**
 * Class to demonstrate a Candidatura simple example.
 *
 * @author Nuno Bettencourt [nmb@isep.ipp.pt] on 29/05/16.
 */
public class CandidaturaExampleTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void ensureAddKeywordIsWorking() throws Exception {
        List<KeywordExample> expectedKeywordExampleList = new ArrayList<>();
        expectedKeywordExampleList.add(new KeywordExample("Doors"));

        CandidaturaExample candidatura = new CandidaturaExample("MyCandidatura", new ArrayList<>());
        candidatura.addKeyword(new KeywordExample("Doors"));

        List<KeywordExample> resultList = candidatura.getKeywordList();

        assertArrayEquals(expectedKeywordExampleList.toArray(), resultList.toArray());

    }


    @Test
    public void ensureSameContentObjectsAreEqual() {
        String description = "MyCandidatura";

        List<KeywordExample> keywords = new ArrayList<>();
        keywords.add(new KeywordExample("Doors"));
        keywords.add(new KeywordExample("Windows"));

        CandidaturaExample expected = new CandidaturaExample(description, keywords);
        CandidaturaExample result = new CandidaturaExample(description, keywords);

        assertEquals(expected, result);
    }

    @Test
    public void ensureSameObjectIsEqual() {
        String description = "MyCandidatura";

        List<KeywordExample> keywords = new ArrayList<>();
        keywords.add(new KeywordExample("Doors"));
        keywords.add(new KeywordExample("Windows"));

        CandidaturaExample expected = new CandidaturaExample(description, keywords);

        assertEquals(expected, expected);
    }

    @Test
    public void ensureDifferentObjectsAreNotEqual() {
        String description = "MyCandidatura";

        List<KeywordExample> keywords = new ArrayList<>();
        keywords.add(new KeywordExample("Doors"));
        keywords.add(new KeywordExample("Windows"));

        CandidaturaExample expected = new CandidaturaExample(description, keywords);

        Object result = new Object();
        assertNotEquals(expected, result);
    }

    @Test
    public void ensureDifferentDescriptionMakeObjectsNotEqual() {
        String description1 = "MyCandidatura1";
        String description2 = "MyCandidatura2";

        List<KeywordExample> keywords = new ArrayList<>();
        keywords.add(new KeywordExample("Doors"));
        keywords.add(new KeywordExample("Windows"));

        CandidaturaExample expected = new CandidaturaExample(description1, keywords);
        CandidaturaExample result = new CandidaturaExample(description2, keywords);

        assertNotEquals(expected, result);
    }

    @Test
    public void ensureHashCodeIsCorrect() {
        String description = "MyCandidatura";

        List<KeywordExample> keywords = new ArrayList<>();
        keywords.add(new KeywordExample("Doors"));
        keywords.add(new KeywordExample("Windows"));

        CandidaturaExample candidaturaExample = new CandidaturaExample(description, keywords);

        int expected = 461375881;
        int result = candidaturaExample.hashCode();
        assertEquals(expected, result);

    }

    /**
     * Test of addKeyword method, of class CandidaturaExample.
     */
    @Test
    public void testAddKeyword() {
        System.out.println("addKeyword");
        KeywordExample keyword = null;
        CandidaturaExample instance = new CandidaturaExample();
        instance.addKeyword(keyword);
    }

    /**
     * Test of getKeywordList method, of class CandidaturaExample.
     */
    @Test
    public void testGetKeywordList() {
        System.out.println("getKeywordList");
        CandidaturaExample instance = new CandidaturaExample();
        List<KeywordExample> expResult = null;
        List<KeywordExample> result = instance.getKeywordList();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class CandidaturaExample.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        CandidaturaExample instance = new CandidaturaExample();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class CandidaturaExample.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        CandidaturaExample instance = new CandidaturaExample();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

}
