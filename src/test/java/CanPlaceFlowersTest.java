import org.example.CanPlaceFlowers;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CanPlaceFlowersTest {

    @Test
    public void testPlaceFlowers(){
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        assertEquals(true, canPlaceFlowers.placeFlowers(new int[]{1,0,0,0,1},1));
    }

    @Test
    public void testPlaceFlowersNegativeScenario(){
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        assertEquals(false, canPlaceFlowers.placeFlowers(new int[]{1,0,1,0,1},1));
    }

    @Test
    public void testPlaceFlowersWithOneFlowerBeed(){
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        assertEquals(true, canPlaceFlowers.placeFlowers(new int[]{0},1));
    }

    @Test
    public void testPlaceFlowersWithOneFlowerBeedNegative(){
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        assertEquals(false, canPlaceFlowers.placeFlowers(new int[]{1},1));
    }

    @Test
    public void testPlaceFlowersWithOneFlowerBeedWithMoreFlowers(){
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        assertEquals(false, canPlaceFlowers.placeFlowers(new int[]{0},2));
    }

    @Test
    public void testPlaceFlowersAtEnd(){
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        assertEquals(true, canPlaceFlowers.placeFlowers(new int[]{1,0,0},1));
    }

    @Test
    public void testPlaceFlowersAtEndNegativeScenario(){
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        assertEquals(false, canPlaceFlowers.placeFlowers(new int[]{1,0,0},2));
    }

    @Test
    public void testCase8(){
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        assertEquals(true, canPlaceFlowers.placeFlowers(new int[]{0,0,1,0,1},1));
    }

    @Test
    public void testCase9(){
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        assertEquals(false, canPlaceFlowers.placeFlowers(new int[]{1,0,0,0,0,1},2));
    }

    @Test
    public void testCase10(){
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        assertEquals(false, canPlaceFlowers.placeFlowers(new int[]{0,1,0},1));
    }

    @Test
    public void testCase11(){
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        assertEquals(true, canPlaceFlowers.placeFlowers(new int[]{0,0,1,0,0},1));
    }
}
