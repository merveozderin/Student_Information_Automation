public class Student
{
    Course c1;
    Course c2;
    Course c3;
    String name;
    int stdno;
    String classes;
    double avarage;
    boolean isPass;
    int personalNote;


    Student(String name, int stdno, String classes, Course c1, Course c2, Course c3, int personalNote)
    {
        this.name = name;
        this.stdno = stdno;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
        this.personalNote = 0;
    }

    void addAllExamNote(int note1, int note2, int note3)
    {
        if(note1 >= 0 && note1 <= 100)
        {
            this.c1.note = note1;
        }

        if(note2 >= 0 && note2 <= 100)
        {
            this.c2.note = note2;
        }

        if(note3 >= 0 && note3 <= 100)
        {
            this.c3.note = note3;
        }
    }

    void isPass()
    {
        avarage = (((this.c1.note + this.c2.note + this.c3.note) *(0.80)) + (personalNote*(0.20))) / (3.0)  ;

        if (avarage >= 55)
        {
            System.out.println("Avarage\t:" +this.avarage);
            System.out.println("You passed the class successfully!");
            this.isPass = true;
        }
        else
        {
            System.out.println(this.avarage + " Avarage\t:" +this.avarage);
            System.out.println("You did not pass the class successfully!");
            this.isPass = false;
        }

        //printNote();
    }

    void printNote()
    {
        System.out.println(this.c1.name + " Note\t:" +this.c1.note);
        System.out.println(this.c2.name + " Note\t:" +this.c2.note);
        System.out.println(this.c3.name + " Note\t:" +this.c3.note);
       // System.out.println(this.avarage + " Avarage\t:" +this.avarage);
    }


}
