package letter.grade;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Input in Partition
     */
    // @Test
    // public void inputInFirstPartitionShouldReturnLetterA()
    // {
    //     assertEquals('A', App.letterGrade(95));
    // }

    // @Test
    // public void inputInSecondPartitionShouldReturnLetterB()
    // {
    //     assertEquals('B', App.letterGrade(83));
    // }

    // @Test
    // public void inputInThirdPartitionShouldReturnLetterC()
    // {
    //     assertEquals('C', App.letterGrade(76));
    // }

    // @Test
    // public void inputInFourthPartitionShouldReturnLetterD()
    // {
    //     assertEquals('D', App.letterGrade(61));
    // }

    // @Test
    // public void inputInFifthPartitionShouldReturnLetterF()
    // {
    //     assertEquals('F', App.letterGrade(35));
    // }

    // @Test
    // public void inputBelowZeroShouldReturnLetterX()
    // {
    //     assertEquals('X', App.letterGrade(-3));
    // }

    // @Test
    // public void inputOverHundredShouldReturnLetterX()
    // {
    //     assertEquals('X', App.letterGrade(1079));
    // }
    
    /**
     * Input On Boundary
     */
    @Test
    public void inputOneHundredShouldReturnLetterA()
    {
        assertEquals('A', App.letterGrade(100));
    }

    @Test
    public void inputNinetyShouldReturnLetterA()
    {
        assertEquals('A', App.letterGrade(90));
    }

    @Test
    public void inputEightyShouldReturnLetterB()
    {
        assertEquals('B', App.letterGrade(80));
    }

    @Test
    public void inputSeventyShouldReturnLetterC()
    {
        assertEquals('C', App.letterGrade(70));
    }

    @Test
    public void inputSixtyShouldReturnLetterD()
    {
        assertEquals('D', App.letterGrade(60));
    }

    @Test
    public void inputZeroShouldReturnLetterF()
    {
        assertEquals('F', App.letterGrade(0));
    }
}
