import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculation = new Calculator ( ) ;
        int sum = calculation.add ( 2 , 5 ) ;
        int testSum = 7 ;
        assertEquals ( sum , testSum ) ;
    }
}