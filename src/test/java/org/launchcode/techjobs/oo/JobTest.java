package org.launchcode.techjobs.oo;

import org.junit.Test;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        job1.setId(7);

        assertEquals(7, job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

//        assertEquals(1, job.getId());

        assertTrue(job.getName() instanceof String);
        assertTrue(job.getEmployer() instanceof Employer);
        assertTrue(job.getLocation() instanceof Location);
        assertTrue(job.getPositionType() instanceof PositionType);
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);


        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertFalse(job1.equals(job2));
    }


//    @Test
//    public void testToString() {
//        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//
//        String expected = "\nID: " + job.getId() +
//                "\nName: Product tester" +
//                "\nEmployer: ACME" +
//                "\nLocation: Desert" +
//                "\nPosition Type: Quality control" +
//                "\nCore Competency: Persistence\n";
//
//        assertEquals(expected, job.toString());
//
//    }


    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job test3 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertEquals('\n',test3.toString().charAt(0));
        assertEquals('\n', test3.toString().charAt(test3.toString().length() - 1));

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job test4 = new Job("Product tester",
                new Employer(""),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency(""));

        assertEquals("\nID: " + test4.getId() +
                "\nName: Product tester" +
                "\nEmployer: Data not available" +
                "\nLocation: Desert" +
                "\nPosition Type: Quality control" +
                "\nCore Competency: Data not available" +
                "\n" , test4.toString());
    }
@Test
    public void testToStringHandlesEmptyField() {
        Job test5 = new Job("Product tester",
                new Employer(""),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency(""));

        assertEquals("\nID: " + test5.getId() +
                "\nName: Product tester" +
                "\nEmployer: Data not available" +
                "\nLocation: Desert" +
                "\nPosition Type: Quality control" +
                "\nCore Competency: Data not available" +
                "\n" , test5.toString());


    }

}