public class Main
{
    public static void main(String[] args)
    {
        Teacher t1 = new Teacher("Julia",12345,"Maths");
        Teacher t2 = new Teacher("Alex",45678,"Physics");
        Teacher t3 = new Teacher("James", 456123, "Biology" );

        Course maths = new Course("Maths",101,"MTH");
        maths.addTeacher(t1);
        Course physics = new Course("Physics",102,"PHY");
        physics.addTeacher(t2);
        Course biology = new Course("Biology",103,"BIO");
        biology.addTeacher(t3);

        Student s1 = new Student("Melissa", 856, "4",maths,physics,biology, 80);
        s1.addAllExamNote(80,75,90);
        s1.printNote();
        s1.isPass();
    }
}
