public class Course
{
        Teacher teacher;
        String name;
        int code;
        String prefix;
        int note;


        public Course(String name, int code, String prefix) {
            this.name = name;
            this.code = code;
            this.prefix = prefix;
            this.note = 0;

        }

        void addTeacher (Teacher teacher)
        {
            if (teacher.branch.equals(this.prefix))
            {
                this.teacher = teacher;
                //printTeacher();
            }
            else
            {
                //System.out.print("Teacher and his/her department are not compatible.");
            }

        }

        void printTeacher( )
        {
            this.teacher.print();
        }
}
