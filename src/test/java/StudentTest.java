import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    private Student fer;
    private Student ryan;

    @BeforeAll
    public static void onceExecutedBeforeAll() {
        System.out.println("Test Student Class");
    }

    @BeforeEach
    public void setup() {
        fer = new Student(1L, "fer");
        fer.addGrade(100);
        fer.addGrade(80);
    }

    @DisplayName("Check data in Student object")
    @Test
    public void testCreateStudent() {
        assertNull(ryan);      // ryan нигде не создаётся
        assertNotNull(fer);    // fer должен быть инициализирован
    }

    @Disabled // этот тест временно выключен
    @Test
    public void testStudentFields() {
        assertEquals(1L, fer.getId());
        assertEquals("fer", fer.getName());
        assertEquals(2, fer.getGrades().size());
    }

    @Test
    public void testAddGrade() {
        assertEquals(100, fer.getGrades().get(0));
        assertEquals(80, fer.getGrades().get(1));
    }

    @Test
    public void testAverageGrade() {
        assertEquals(90.0, fer.getGradeAverage(), 0.001);
    }
}
