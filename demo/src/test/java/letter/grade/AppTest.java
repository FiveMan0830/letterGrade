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
    @Test
    public void inputInFirstPartitionShouldReturnLetterA()
    {
        assertEquals('A', App.letterGrade(99));
        assertEquals('A', App.letterGrade(98));
        assertEquals('A', App.letterGrade(97));
        assertEquals('A', App.letterGrade(96));
        assertEquals('A', App.letterGrade(95));
        assertEquals('A', App.letterGrade(94));
        assertEquals('A', App.letterGrade(93));
        assertEquals('A', App.letterGrade(92));
        assertEquals('A', App.letterGrade(91));
    }

    @Test
    public void inputInSecondPartitionShouldReturnLetterB()
    {
        assertEquals('B', App.letterGrade(89));
        assertEquals('B', App.letterGrade(88));
        assertEquals('B', App.letterGrade(87));
        assertEquals('B', App.letterGrade(86));
        assertEquals('B', App.letterGrade(85));
        assertEquals('B', App.letterGrade(84));
        assertEquals('B', App.letterGrade(83));
        assertEquals('B', App.letterGrade(82));
        assertEquals('B', App.letterGrade(81));
    }

    @Test
    public void inputInThirdPartitionShouldReturnLetterC()
    {
        assertEquals('C', App.letterGrade(79));
        assertEquals('C', App.letterGrade(78));
        assertEquals('C', App.letterGrade(77));
        assertEquals('C', App.letterGrade(76));
        assertEquals('C', App.letterGrade(75));
        assertEquals('C', App.letterGrade(74));
        assertEquals('C', App.letterGrade(73));
        assertEquals('C', App.letterGrade(72));
        assertEquals('C', App.letterGrade(71));
    }

    @Test
    public void inputInFourthPartitionShouldReturnLetterD()
    {
        assertEquals('D', App.letterGrade(69));
        assertEquals('D', App.letterGrade(68));
        assertEquals('D', App.letterGrade(67));
        assertEquals('D', App.letterGrade(66));
        assertEquals('D', App.letterGrade(65));
        assertEquals('D', App.letterGrade(64));
        assertEquals('D', App.letterGrade(63));
        assertEquals('D', App.letterGrade(62));
        assertEquals('D', App.letterGrade(61));
    }

    @Test
    public void inputInFifthPartitionShouldReturnLetterF()
    {
        assertEquals('F', App.letterGrade(59));
        assertEquals('F', App.letterGrade(35));
        assertEquals('F', App.letterGrade(1));
    }

    @Test
    public void inputBelowZeroShouldReturnLetterX()
    {
        assertEquals('X', App.letterGrade(-3));
    }

    @Test
    public void inputOverHundredShouldReturnLetterX()
    {
        assertEquals('X', App.letterGrade(1079));
    }
    
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
